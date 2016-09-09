package mehadi;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import chartModel.getData;
import db.DataProvider;
import model.Patient;


public class test1 extends JFrame {
	
	
	private JPanel contentPane;
	//visible diff
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_12;
	private JTextField textField_14;
	public static String patID;

	public Patient pat = new Patient();
	private JTable table;
	private JTextField txtRespRateInp;
	private JTextField txtTempInp;
	private JTextField txtPulseInp;
	private JTextField txtBPSInp;
	private JTextField txtBPDInp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 frame = new test1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test1() {
		setTitle("APPROACH TO CASE DIAGNOSIS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1300, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//Doctor Login Page Begin
		
		JPanel docLogin = new JPanel();
		contentPane.add(docLogin, "name_190462582580425");
		docLogin.setLayout(null);
		
		JLabel lblDoctorId = new JLabel("DOCTOR ID :");
		lblDoctorId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDoctorId.setBounds(291, 313, 137, 27);
		docLogin.add(lblDoctorId);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(291, 338, 89, 27);
		docLogin.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(379, 316, 86, 20);
		docLogin.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(379, 341, 86, 20);
		docLogin.add(textField_1);
		textField_1.setColumns(10);
		
		//Doc login page finish
		
		//pat search page begin
		
		JPanel patLogin = new JPanel();
		contentPane.add(patLogin, "name_190462593567884");
		patLogin.setLayout(null);
		
		JPanel patDetails = new JPanel();
		contentPane.add(patDetails, "name_190462603930491");
		patDetails.setLayout(null);
		
		//panel history ends 
		
		//panel pathTest begins
		
		JPanel pathTest = new JPanel();
		pathTest.setBackground(Color.WHITE);
		pathTest.setBounds(147, 0, 1104, 606);
		pathTest.setLayout(null);
		
		
		
		JLabel lblPathologyTest = new JLabel("PATHOLOGY TEST");
		lblPathologyTest.setForeground(Color.RED);
		lblPathologyTest.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPathologyTest.setBounds(342, 11, 342, 42);
		pathTest.add(lblPathologyTest);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(10, 70, 69, 14);
		pathTest.add(lblName);
		
		JLabel lblAge_1 = new JLabel("AGE :");
		lblAge_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAge_1.setBounds(10, 95, 46, 14);
		pathTest.add(lblAge_1);
		
		JLabel lblGender_1 = new JLabel("SEX :");
		lblGender_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender_1.setBounds(10, 120, 46, 14);
		pathTest.add(lblGender_1);
		
		JLabel lblTestName = new JLabel("TEST NAME :");
		lblTestName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTestName.setBounds(10, 145, 148, 20);
		pathTest.add(lblTestName);
		
		JLabel lblDescription = new JLabel("DESCRIPTION :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDescription.setBounds(10, 253, 148, 14);
		pathTest.add(lblDescription);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 176, 178, 32);
		pathTest.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.addItem("-select-");
		comboBox.addItem("URIN TEST");
		comboBox.addItem( "LIPID PROFILE TEST");
		comboBox.addItem("STOOL TEST");
		comboBox.addItem("CBC TEST");
		comboBox.addItem("LIVER FUNCTION TEST");
		
		textField_12 = new JTextField();
		textField_12.setBounds(10, 298, 653, 193);
		pathTest.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblPatientId_1 = new JLabel("PATIENT ID :");
		lblPatientId_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatientId_1.setBounds(395, 98, 113, 14);
		pathTest.add(lblPatientId_1);
		
		JButton btnSend = new JButton("SEND");
		btnSend.setBounds(998, 572, 96, 23);
		pathTest.add(btnSend);
		btnSend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				textField_12.setText("");
				textField_14.setText("");
			}
		});
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				pathTest.setVisible(false);
				//HISTORY.setVisible(false);
				//STATUS.setVisible(false);
			}
		});
		
				
			
				
		       // frame.getContentPane().add(panel);
				
				//pat search page finish
		
			    //patient profile panel begin
				
				JPanel patient_profile = new JPanel();
				patient_profile.setBounds(147, 0, 1104, 606);
				patient_profile.setBackground(Color.WHITE);
				patient_profile.setLayout(null);
				
				JLabel lblWeight = new JLabel("WEIGHT :");
				lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblWeight.setBounds(577, 82, 109, 20);
				patient_profile.add(lblWeight);
				
				JLabel lblName_1 = new JLabel("NAME :");
				lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblName_1.setBounds(64, 82, 109, 20);
				patient_profile.add(lblName_1);
				
				JLabel lblAge = new JLabel("AGE :");
				lblAge.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblAge.setBounds(64, 127, 78, 20);
				patient_profile.add(lblAge);
				
				JLabel lblSex = new JLabel("SEX :");
				lblSex.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblSex.setBounds(64, 171, 78, 23);
				patient_profile.add(lblSex);
				
				JLabel lblMaritalStatus = new JLabel("MARITAL STATUS :");
				lblMaritalStatus.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblMaritalStatus.setBounds(64, 227, 220, 28);
				patient_profile.add(lblMaritalStatus);
				
				JLabel lblReligion = new JLabel("RELIGION :");
				lblReligion.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblReligion.setBounds(64, 356, 132, 30);
				patient_profile.add(lblReligion);
				
				JLabel lblOccupation = new JLabel("OCCUPATION :");
				lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblOccupation.setBounds(64, 428, 174, 34);
				patient_profile.add(lblOccupation);
				
				JLabel lblContactNumber = new JLabel("CONTACT NUMBER :");
				lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblContactNumber.setBounds(577, 441, 220, 28);
				patient_profile.add(lblContactNumber);
				
				JLabel lblHeight = new JLabel("HEIGHT :");
				lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblHeight.setBounds(577, 126, 109, 23);
				patient_profile.add(lblHeight);
				
				JLabel lblCheifComplaint = new JLabel("CHEIF COMPLAINT :");
				lblCheifComplaint.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblCheifComplaint.setBounds(577, 181, 220, 28);
				patient_profile.add(lblCheifComplaint);
				
				JLabel lblPresentIllness = new JLabel("");
				lblPresentIllness.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblPresentIllness.setBounds(577, 238, 220, 28);
				patient_profile.add(lblPresentIllness);
				
				JLabel lblPastIllness = new JLabel("");
				lblPastIllness.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblPastIllness.setBounds(577, 293, 220, 23);
				patient_profile.add(lblPastIllness);
				
				JLabel lblDrugHistory = new JLabel("DRUG HISTORY :");
				lblDrugHistory.setFont(new Font("Tahoma", Font.PLAIN, 24));
				lblDrugHistory.setBounds(577, 338, 187, 28);
				patient_profile.add(lblDrugHistory);
				
				JLabel lblNewLabel_3Name = new JLabel("New Label");
				lblNewLabel_3Name.setFont(new Font("Tahoma", Font.PLAIN, 18));
				//lblNewLabel_3.setText("");
				lblNewLabel_3Name.setBounds(155, 85, 260, 20);
				patient_profile.add(lblNewLabel_3Name);
				
				JLabel lblAge_2 = new JLabel("Age");
				lblAge_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblAge_2.setBounds(133, 130, 78, 23);
				patient_profile.add(lblAge_2);
				
				JLabel lblSex_1 = new JLabel("Sex");
				lblSex_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblSex_1.setBounds(133, 175, 132, 23);
				patient_profile.add(lblSex_1);
				
				JLabel lblMstatus = new JLabel("MStatus");
				lblMstatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblMstatus.setBounds(275, 230, 174, 28);
				patient_profile.add(lblMstatus);
				
				JLabel lblReligion_1 = new JLabel("Religion");
				lblReligion_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblReligion_1.setBounds(202, 358, 149, 35);
				patient_profile.add(lblReligion_1);
				
				JLabel lblOccupation_1 = new JLabel("Occupation");
				lblOccupation_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblOccupation_1.setBounds(248, 431, 206, 34);
				patient_profile.add(lblOccupation_1);
				
				JLabel lblWeight_1 = new JLabel("Weight");
				lblWeight_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblWeight_1.setBounds(704, 81, 187, 28);
				patient_profile.add(lblWeight_1);
				
				JLabel lblHeight_1 = new JLabel("Height");
				lblHeight_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblHeight_1.setBounds(696, 125, 195, 30);
				patient_profile.add(lblHeight_1);
				
				JLabel lblComplaint = new JLabel("Complaint");
				lblComplaint.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblComplaint.setBounds(807, 181, 187, 35);
				patient_profile.add(lblComplaint);
				
				JLabel lblDrugHistory_1 = new JLabel("Drug History");
				lblDrugHistory_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblDrugHistory_1.setBounds(774, 340, 281, 30);
				patient_profile.add(lblDrugHistory_1);
				
				JLabel lblContact = new JLabel("Contact");
				lblContact.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblContact.setBounds(807, 443, 234, 31);
				patient_profile.add(lblContact);
				
				patDetails.add(patient_profile);
				
				JLabel lblPhoto = new JLabel("");
				lblPhoto.setBounds(880, 46, 160, 130);
				
				patient_profile.add(lblPhoto);
		btnCancel.setBounds(10, 557, 89, 23);
		pathTest.add(btnCancel);
		
		textField_14 = new JTextField();
		textField_14.setBackground(Color.WHITE);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_14.setForeground(Color.BLACK);
		textField_14.setBounds(232, 176, 178, 32);
		pathTest.add(textField_14);
		textField_14.setColumns(10);
		
		patDetails.add(pathTest, "name_190462614557490");
		
		JLabel lblPatname = new JLabel("patName");
		lblPatname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatname.setBounds(89, 67, 212, 20);
		pathTest.add(lblPatname);
		
		JLabel lblPatage = new JLabel("patAge");
		lblPatage.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatage.setBounds(89, 94, 51, 16);
		pathTest.add(lblPatage);
		
		JLabel lblSex_2 = new JLabel("sex");
		lblSex_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSex_2.setBounds(89, 119, 51, 16);
		pathTest.add(lblSex_2);
		
		JLabel lblPatid = new JLabel("patId");
		lblPatid.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatid.setBounds(518, 97, 128, 17);
		pathTest.add(lblPatid);
		
		JButton btnAddtest = new JButton("AddTest");
		btnAddtest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField_14.getText().equals("")){
					DataProvider.InsertTestTable(textField_14.getText());
					textField_14.setText("");
				}
			}
		});
		btnAddtest.setBounds(444, 176, 121, 32);
		pathTest.add(btnAddtest);
		
		//panel patient profile ends
		
		//panel history begins
		
		JPanel HISTORY = new JPanel();
		//HISTORY.setToolTipText("");
		HISTORY.setBackground(Color.WHITE);
		HISTORY.setForeground(new Color(0, 0, 0));
		HISTORY.setBounds(147, 0, 1104, 606);
		HISTORY.setLayout(null);
		
		JLabel lblApearance = new JLabel("APEARANCE");
		lblApearance.setForeground(Color.RED);
		lblApearance.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblApearance.setBounds(10, 109, 161, 47);
		HISTORY.add(lblApearance);
		
		JCheckBox chckbxIllLooking = new JCheckBox("ILL LOOKING");
		chckbxIllLooking.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxIllLooking.setBounds(20, 180, 125, 23);
		HISTORY.add(chckbxIllLooking);
		
		JCheckBox chckbxLathergic = new JCheckBox("LATHARGIC");
		chckbxLathergic.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxLathergic.setBounds(20, 217, 125, 23);
		HISTORY.add(chckbxLathergic);
		
		JCheckBox chckbxCachexia = new JCheckBox("CACHEXIA");
		chckbxCachexia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxCachexia.setBounds(20, 253, 125, 23);
		HISTORY.add(chckbxCachexia);
		
		JCheckBox chckbxObesity = new JCheckBox("OBESITY");
		chckbxObesity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxObesity.setBounds(20, 290, 125, 23);
		HISTORY.add(chckbxObesity);
		
		JCheckBox chckbxPale = new JCheckBox("PALE");
		chckbxPale.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxPale.setBounds(20, 327, 125, 23);
		HISTORY.add(chckbxPale);
		
		JLabel lblMentalStatus = new JLabel("MENTAL STATUS");
		lblMentalStatus.setForeground(Color.RED);
		lblMentalStatus.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblMentalStatus.setBounds(10, 361, 224, 43);
		HISTORY.add(lblMentalStatus);
		
		JCheckBox chckbxUphoric = new JCheckBox("UPHORIC");
		chckbxUphoric.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxUphoric.setBounds(20, 438, 132, 23);
		HISTORY.add(chckbxUphoric);
		
		JCheckBox chckbxPathetic = new JCheckBox("PATHETIC");
		chckbxPathetic.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxPathetic.setBounds(20, 464, 132, 23);
		HISTORY.add(chckbxPathetic);
		
		JCheckBox chckbxVolent = new JCheckBox("VIOLENT");
		chckbxVolent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxVolent.setBounds(20, 490, 132, 23);
		HISTORY.add(chckbxVolent);
		
		JCheckBox chckbxCalmCooperative = new JCheckBox("CALM & COOPERATIVE");
		chckbxCalmCooperative.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxCalmCooperative.setBounds(20, 516, 203, 23);
		HISTORY.add(chckbxCalmCooperative);
		
		JLabel lblRespiratoryRate = new JLabel("RESPIRATORY RATE :");
		lblRespiratoryRate.setForeground(Color.RED);
		lblRespiratoryRate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRespiratoryRate.setBounds(277, 126, 187, 23);
		HISTORY.add(lblRespiratoryRate);
		
		JLabel lblTemparature = new JLabel("TEMPARATURE :");
		lblTemparature.setForeground(Color.RED);
		lblTemparature.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTemparature.setBounds(277, 217, 167, 23);
		HISTORY.add(lblTemparature);
		
		JLabel lblPulseRate = new JLabel("PULSE RATE :");
		lblPulseRate.setForeground(Color.RED);
		lblPulseRate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPulseRate.setBounds(277, 290, 125, 23);
		HISTORY.add(lblPulseRate);
		
		JLabel lblBloodPressure_1 = new JLabel("BLOOD PRESSURE :");
		lblBloodPressure_1.setForeground(Color.RED);
		lblBloodPressure_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBloodPressure_1.setBounds(277, 376, 167, 23);
		HISTORY.add(lblBloodPressure_1);
		
		JLabel lblAGeneralPhysical = new JLabel("General physical findings");
		lblAGeneralPhysical.setForeground(Color.RED);
		lblAGeneralPhysical.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblAGeneralPhysical.setBounds(20, 26, 441, 72);
		HISTORY.add(lblAGeneralPhysical);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("EDEMA");
		chckbxNewCheckBox.setForeground(Color.RED);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox.setBounds(277, 427, 167, 23);
		HISTORY.add(chckbxNewCheckBox);
		
		JCheckBox chckbxCynisis = new JCheckBox("CYNOSIS");
		chckbxCynisis.setForeground(Color.RED);
		chckbxCynisis.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxCynisis.setBounds(277, 478, 167, 23);
		HISTORY.add(chckbxCynisis);
		
		JLabel lblBSystemicExamination = new JLabel("Systemic examination findings");
		lblBSystemicExamination.setForeground(Color.BLUE);
		lblBSystemicExamination.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblBSystemicExamination.setBounds(576, 32, 518, 60);
		HISTORY.add(lblBSystemicExamination);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Alimentary system");
		chckbxNewCheckBox_1.setForeground(Color.BLUE);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox_1.setBounds(759, 166, 197, 23);
		HISTORY.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxRespiratorySystem = new JCheckBox("Respiratory system");
		chckbxRespiratorySystem.setForeground(Color.BLUE);
		chckbxRespiratorySystem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxRespiratorySystem.setBounds(759, 235, 197, 23);
		HISTORY.add(chckbxRespiratorySystem);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Cardiovascular system");
		chckbxNewCheckBox_2.setForeground(Color.BLUE);
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox_2.setBounds(759, 303, 197, 23);
		HISTORY.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Nervous system");
		chckbxNewCheckBox_3.setForeground(Color.BLUE);
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox_3.setBounds(759, 361, 197, 23);
		HISTORY.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Locomotor system");
		chckbxNewCheckBox_4.setForeground(Color.BLUE);
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox_4.setBounds(759, 425, 197, 23);
		HISTORY.add(chckbxNewCheckBox_4);
		
		patDetails.add(HISTORY);
		
		JCheckBox chckbxUnconscious = new JCheckBox("UNCONSCIOUS");
		chckbxUnconscious.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxUnconscious.setBounds(20, 412, 132, 23);
		HISTORY.add(chckbxUnconscious);
		
		JLabel lblResp = new JLabel("Resp");
		lblResp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResp.setForeground(Color.RED);
		lblResp.setBounds(465, 126, 27, 23);
		lblResp.setText("");
		HISTORY.add(lblResp);
		
		JLabel lblTemp = new JLabel("temp");
		lblTemp.setForeground(Color.RED);
		lblTemp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTemp.setBackground(Color.WHITE);
		lblTemp.setText("");
		lblTemp.setBounds(424, 217, 41, 23);
		HISTORY.add(lblTemp);
		
		JLabel lblPulse = new JLabel("");
		lblPulse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPulse.setForeground(Color.RED);
		lblPulse.setBounds(397, 290, 27, 23);
		HISTORY.add(lblPulse);
		
		JLabel lblBp = new JLabel("");
		lblBp.setForeground(Color.RED);
		lblBp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBp.setBounds(442, 376, 86, 23);
		HISTORY.add(lblBp);
		
		JLabel lblPerMin = new JLabel("per min");
		lblPerMin.setForeground(Color.RED);
		lblPerMin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPerMin.setBounds(493, 129, 53, 17);
		HISTORY.add(lblPerMin);
		
		JLabel lblPerMin_1 = new JLabel("F");
		lblPerMin_1.setForeground(Color.RED);
		lblPerMin_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPerMin_1.setBounds(475, 218, 59, 20);
		HISTORY.add(lblPerMin_1);
		
		JLabel lblPerMin_2 = new JLabel("per min");
		lblPerMin_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPerMin_2.setForeground(Color.RED);
		lblPerMin_2.setBounds(434, 291, 69, 20);
		HISTORY.add(lblPerMin_2);
		
		txtRespRateInp = new JTextField();
		txtRespRateInp.setBounds(555, 129, 86, 20);
		HISTORY.add(txtRespRateInp);
		txtRespRateInp.setColumns(10);
		
		txtTempInp = new JTextField();
		txtTempInp.setBounds(555, 220, 86, 20);
		HISTORY.add(txtTempInp);
		txtTempInp.setColumns(10);
		
		txtPulseInp = new JTextField();
		txtPulseInp.setText("");
		txtPulseInp.setBounds(555, 293, 86, 20);
		HISTORY.add(txtPulseInp);
		txtPulseInp.setColumns(10);
		
		txtBPSInp = new JTextField();
		txtBPSInp.setBounds(555, 361, 86, 20);
		HISTORY.add(txtBPSInp);
		txtBPSInp.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//appearance table
				ArrayList<Boolean> Appearance = new ArrayList<Boolean>();
//				JCheckBox chckbxIllLooking = new JCheckBox("ILL LOOKING");
				if(chckbxIllLooking.isSelected()){
					System.out.println("Ill Looking is true");
					Appearance.add(true);
				}
				else{
					System.out.println("Ill Looking is false");
					Appearance.add(false);
				}

//				JCheckBox chckbxLathergic = new JCheckBox("LATHARGIC");
				if(chckbxLathergic.isSelected()){
					System.out.println("chckbxLathergic true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxLathergic false");
					Appearance.add(false);
				}
				//chckbxUnconscious
				if(chckbxUnconscious.isSelected()){
					System.out.println("chckbxUnconscious true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxUnconscious false");
					Appearance.add(false);
				}
//				JCheckBox chckbxCachexia = new JCheckBox("CACHEXIA");
				if(chckbxCachexia.isSelected()){
					System.out.println("chckbxCachexia true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxCachexia false");
					Appearance.add(false);
				}

//				JCheckBox chckbxObesity = new JCheckBox("OBESITY");
				if(chckbxObesity.isSelected()){
					System.out.println("chckbxObesity true");
					Appearance.add(true);
				}
				else
				{
					System.out.println("chckbxObesity false");
					Appearance.add(false);
				}
				
//				JCheckBox chckbxCynisis = new JCheckBox("CYNOSIS");
				if(chckbxCynisis.isSelected()){
					System.out.println("chckbxCynisis true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxCynisis false");
					Appearance.add(false);
				}
//				JCheckBox chckbxNewCheckBox = new JCheckBox("EDEMA");
				if(chckbxNewCheckBox.isSelected()){
					System.out.println("chckbxNewCheckBox-EDMA true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxNewCheckBox-EDMA false");
					Appearance.add(false);
				}

//				JCheckBox chckbxPale = new JCheckBox("PALE");
				if(chckbxPale.isSelected()){
					System.out.println("chckbxPale true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxPale false");
					Appearance.add(false);
				}

//				JCheckBox chckbxUphoric = new JCheckBox("UPHORIC");
				if(chckbxUphoric.isSelected()){
					System.out.println("chckbxUphoric true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxUphoric false");
					Appearance.add(false);
				}

//				JCheckBox chckbxPathetic = new JCheckBox("PATHETIC");
				if(chckbxPathetic.isSelected()){
					System.out.println("chckbxPathetic true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxPathetic false");
					Appearance.add(false);
				}

//				JCheckBox chckbxVolent = new JCheckBox("VIOLENT");
				if(chckbxVolent.isSelected()){
					System.out.println("chckbxVolent true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxVolent false");
					Appearance.add(false);
				}

//				JCheckBox chckbxCalmCooperative = new JCheckBox("CALM & COOPERATIVE");
				if(chckbxCalmCooperative.isSelected()){
					System.out.println("chckbxCalmCooperative true");
					Appearance.add(true);
				}
				else{
					System.out.println("chckbxCalmCooperative false");
					Appearance.add(false);
				}
				DataProvider.UpdateAppearanceTable(pat.getPID(), Appearance);
				//respiratory table
//				JLabel lblResp = new JLabel("Resp");
				
				double RespRateUpdate = Double.parseDouble(lblResp.getText());
				if(!txtRespRateInp.getText().equals("")){
					System.out.println("inside fetch set RespRateUpdate");
					RespRateUpdate = Double.parseDouble(txtRespRateInp.getText());
					System.out.println(RespRateUpdate);
					
				    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    //get current date time with Date()
				    Date date = new Date();
				    String d = dateFormat.format(date);
				    System.out.println(d);
					
				    DataProvider.InsertRespiratoryTable(pat.getPID(), d, RespRateUpdate);
				  
				    //Updating pat object
					pat.setRp((int)Double.parseDouble(txtRespRateInp.getText()));
					
					//Updating panel labels to current value
					lblResp.setText(Integer.toString(pat.getRp())); 
					
					//Clearing Text Fields
					txtRespRateInp.setText("");
					
				}
				else System.out.println(RespRateUpdate);
				//temp table
//				JLabel lblTemparature = new JLabel("TEMPARATURE :");
				double TempUpdate;
				if(!txtTempInp.getText().equals("")){
					System.out.println("inside fetch set TempUpdate");
					TempUpdate = Double.parseDouble(txtTempInp.getText());
					System.out.println(TempUpdate);
					
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    Date date = new Date();
				    String d = dateFormat.format(date);
				    System.out.println(d);
					
				    DataProvider.InsertTempTable(pat.getPID(), d, TempUpdate);
				   
				    //Updating pat object
					pat.setTemp((int)Double.parseDouble(txtTempInp.getText()));
					//Updating panel labels to current value
					lblTemp.setText(Double.toString(pat.getTemp()));
					//Clearing Text Fields
					txtTempInp.setText("");
				}
				//pulse table
//				JLabel lblPulseRate = new JLabel("PULSE RATE :");
				int PulseUpdate = Integer.parseInt(lblPulse.getText());;
				if(!txtPulseInp.getText().equals("")){
					System.out.println("inside PulseUpdateInp");
					PulseUpdate = Integer.parseInt(txtPulseInp.getText());
					System.out.println(PulseUpdate);
					
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    //get current date time with Date()
				    Date date = new Date();
				    String d = dateFormat.format(date);
				    System.out.println(d);
					
				    DataProvider.InsertPulseTable(pat.getPID(), d, PulseUpdate);
				    
				    //Updating pat object
					pat.setPulse(Integer.parseInt(txtPulseInp.getText()));
					//Updating panel labels to current value
					lblPulse.setText(Integer.toString(pat.getPulse()));
					//Clearing Text Fields
					txtPulseInp.setText("");
					
				}
				//bloodpressure table
//				JLabel lblBloodPressure_1 = new JLabel("BLOOD PRESSURE :");
				String BPUpdate= lblBloodPressure_1.getText();
				if(!txtBPSInp.getText().equals("") && !txtBPDInp.getText().equals("")){
					int BPSUpdate = Integer.parseInt(txtBPSInp.getText());
					System.out.println(BPSUpdate);
					int BPDUpdate = Integer.parseInt(txtBPDInp.getText());
					System.out.println(BPDUpdate);
					
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    //get current date time with Date()
				    Date date = new Date();
				    String d = dateFormat.format(date);
				    System.out.println(d);
					
				    DataProvider.InsertBPTable(pat.getPID(), d, BPSUpdate, BPDUpdate);	
				    
				    //Updating pat object
					pat.setSys(Integer.parseInt(txtBPSInp.getText()));
					pat.setDia(Integer.parseInt(txtBPDInp.getText()));
					
					//Updating panel labels to current value
					lblBp.setText(Integer.toString(pat.getSys())+"/"+Integer.toString(pat.getDia()));
					
					
					//Clearing Text Fields
					txtBPSInp.setText("");
					txtBPDInp.setText("");
				}
			
				//systemic_finding table
				ArrayList<Boolean> SysFind = new ArrayList<Boolean>();
//				JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Alimentary system");
				if(chckbxNewCheckBox_1.isSelected()){
					System.out.println("chckbxNewCheckBox_1-Alimentary true");
					SysFind.add(true);
				}
				else{
					System.out.println("chckbxNewCheckBox_1-Alimentary false");
					SysFind.add(false);
				}
//				JCheckBox chckbxRespiratorySystem = new JCheckBox("Respiratory system");
				if(chckbxRespiratorySystem.isSelected()){
					System.out.println("chckbxRespiratorySystem-Respiratory true");
					SysFind.add(true);
				}
				else{
					System.out.println("chckbxRespiratorySystem-Respiratory false");
					SysFind.add(false);
				}
//				JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Cardiovascular system");
				if(chckbxNewCheckBox_2.isSelected()){
					System.out.println("chckbxNewCheckBox_2-Cardiovascular true");
					SysFind.add(true);
				}
				else{
					System.out.println("chckbxNewCheckBox_2-Cardiovascular false");
					SysFind.add(false);
				}
//				JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Nervous system");
				if(chckbxNewCheckBox_3.isSelected()){
					System.out.println("chckbxNewCheckBox_3-Nervous system true");
					SysFind.add(true);
				}
				else{
					System.out.println("chckbxNewCheckBox_3-Nervous system false");
					SysFind.add(false);
				}
//				JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Locomotor system");
				if(chckbxNewCheckBox_4.isSelected()){
					System.out.println("chckbxNewCheckBox_4-Locomotor system true");
					SysFind.add(true);
				}
				else{
					System.out.println("chckbxNewCheckBox_4-Locomotor system false");
					SysFind.add(false);
				}
				DataProvider.UpdateSysFindTable(pat.getPID(), SysFind);

				
			}
		});		btnNewButton_1.setBounds(759, 492, 153, 47);
		HISTORY.add(btnNewButton_1);
		
		txtBPDInp = new JTextField();
		txtBPDInp.setBounds(555, 392, 86, 20);
		HISTORY.add(txtBPDInp);
		txtBPDInp.setColumns(10);
		
		
		JPanel report = new JPanel();
		report.setBounds(147, 0, 1104, 606);
		patDetails.add(report);
		report.setBackground(Color.WHITE);
		report.setLayout(null);
		
		JComboBox<String> comboboxTestPicker = new JComboBox<String>();
		comboboxTestPicker.setBounds(416, 111, 127, 26);
		report.add(comboboxTestPicker);
		
		JComboBox<String> comboBoxDatePicker = new JComboBox<String>();
		comboBoxDatePicker.setBounds(587, 111, 188, 26);
		report.add(comboBoxDatePicker);
		
		JButton btnView = new JButton("View");
		btnView.setBounds(794, 110, 89, 23);
		report.add(btnView);	
		
		
		JTable table = new JTable();
		table.setBounds(85, 151, 400, 300);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(83, 151, 930, 346);
		report.add(scrollPane);
		
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String[][] rs = DataProvider.getReport(pat.getPID(), (String)comboboxTestPicker.getSelectedItem(), (String)comboBoxDatePicker.getSelectedItem());

//				for(int i = 0; i<rs.length; i++){
//					for(int j = 0; j<rs[0].length; j++){
//						System.out.println(rs[i][j]);
//					}
//				}
				TableModel tm = new TModel(rs);
				table.setModel(tm);
			}
		});
		
		JPanel graph = new JPanel();
		graph.setBounds(148, 0, 1103, 606);
		patDetails.add(graph);
		graph.setLayout(null);
		
		//panel pathTest ends
		
		

		//panel graph begins
		
		
		
			
		//graph.repaint();
		patDetails.repaint();
		

		
		//History button visuals action handler 
		JButton btnHistory = new JButton("HISTORY");
		btnHistory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnHistory.setBounds(0, 127, 148, 116);
		patDetails.add(btnHistory);
				
		JButton btnCondition = new JButton("<html>PATIENT<br> PROFILE</html>");
		btnCondition.setIcon(new ImageIcon("E:\\Joy\\Programming\\codes\\Java\\final\\icons\\profile-icon.png"));
		btnCondition.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCondition.setHorizontalTextPosition(SwingConstants.CENTER);

		btnCondition.setToolTipText("");
		btnCondition.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnCondition.setBounds(0, 0, 148, 116);
		patDetails.add(btnCondition);
		
		
		
		JButton btnTest = new JButton("TEST");
		btnTest.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnTest.setBounds(0, 258, 148, 105);
		patDetails.add(btnTest);
		
		JButton btnReport = new JButton("REPORT");
		
		btnReport.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReport.setBounds(0, 374, 148, 105);
		patDetails.add(btnReport);
		
		JButton btnLogOut_1 = new JButton("LOG OUT");
		
		btnLogOut_1.setBounds(0, 604, 148, 47);
		patDetails.add(btnLogOut_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnBack.setBounds(1144, 609, 107, 36);
		patDetails.add(btnBack);
		
		JButton btnGraph = new JButton("GRAPH");
		
		btnGraph.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGraph.setBounds(0, 490, 148, 105);
		patDetails.add(btnGraph);
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				int DID = Integer.parseInt(textField.getText());
				String pass = textField_1.getText();
				
				System.out.println(DID);
				System.out.println(pass);
				
				if(DataProvider.checkDoc(DID, pass)){
					docLogin.setVisible(false);
					patLogin.setVisible(true);
					patDetails.setVisible(false);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(false);
				}
				
				else{
					docLogin.setVisible(false);
					patLogin.setVisible(false);
					patDetails.setVisible(false);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(false);
				}
			
				
				
			}
		});
		btnNewButton.setBounds(339, 389, 89, 23);
		docLogin.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\med.jpg"));
		lblNewLabel.setBounds(0, 0, 475, 449);
		docLogin.add(lblNewLabel);
		
		
		
		
		
		
		
		JLabel lblWelcomeToPatient = new JLabel("WELCOME TO PATIENT CARE SYSTEM");
		lblWelcomeToPatient.setFont(new Font("Tahoma", Font.PLAIN, 38));
		lblWelcomeToPatient.setBounds(321, 0, 676, 43);
		patLogin.add(lblWelcomeToPatient);
		
		JLabel lblNewLabel_1 = new JLabel("PLEASE INSERT THE PATIENT ID ...");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNewLabel_1.setBounds(379, 54, 508, 34);
		patLogin.add(lblNewLabel_1);
		
		JLabel lblPatientId = new JLabel("PATIENT ID :");
		lblPatientId.setForeground(Color.BLACK);
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPatientId.setBounds(379, 223, 109, 23);
		patLogin.add(lblPatientId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(498, 223, 114, 23);
//		patID = textField_2.getText();
		patLogin.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSubmit.setForeground(Color.BLUE);
		btnSubmit.setBounds(664, 223, 127, 23);
		patLogin.add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int PID = Integer.parseInt(textField_2.getText());
				
				patID = Integer.toString(PID);
					
				System.out.println(PID);
				
				if(DataProvider.checkPat(PID)){
					docLogin.setVisible(false);
					patLogin.setVisible(false);
					patDetails.setVisible(true);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(true);
					report.setVisible(false);
					graph.setVisible(false);
					
					pat = DataProvider.createPatOb(PID);
					//for patient profile
					//DataProvider.checkPat(102);
					lblNewLabel_3Name.setText(pat.getName());
					lblAge_2.setText(Integer.toString(pat.getAge()));
					lblSex_1.setText(pat.getSex());
					lblMstatus.setText(pat.getMartialStatus());
					lblReligion_1.setText(pat.getReligion());
					lblOccupation_1.setText(pat.getOcupation());
					lblWeight_1.setText(Integer.toString(pat.getWeight()));
					lblHeight_1.setText(pat.getHeight());
					lblComplaint.setText(pat.getchiefComplaint());
					lblDrugHistory_1.setText(pat.getdrug_usage());
					lblContact.setText(Integer.toString(pat.getContact()));
					lblPhoto.setIcon(new ImageIcon(pat.getImg()));
					//patient_profile.repaint();
					
					//patient history
					
					chckbxIllLooking.setSelected(pat.getill_Looking());
					chckbxLathergic.setSelected(pat.getLethargic());
					chckbxCachexia.setSelected(pat.getCachexia());
					chckbxObesity.setSelected(pat.getObesity());
					chckbxPale.setSelected(pat.getPale());

					chckbxUnconscious.setSelected(pat.getUnconscious());
					chckbxUphoric.setSelected(pat.getUphoric());
					chckbxPathetic.setSelected(pat.getPathetic());
					chckbxVolent.setSelected(pat.getViolent());
					chckbxCalmCooperative.setSelected(pat.getCalmnCoOp());

					lblResp.setText(Integer.toString(pat.getRp())); 
					lblTemp.setText(Double.toString(pat.getTemp()));
					lblPulse.setText(Integer.toString(pat.getPulse()));
					lblBp.setText(Integer.toString(pat.getSys())+"/"+Integer.toString(pat.getDia()));
					
					
					
					
					chckbxNewCheckBox.setSelected(pat.getEdema());// new JCheckBox("EDEMA");
					chckbxCynisis.setSelected(pat.getCyanosis());
					
					
					//Systematic findings
					
					 chckbxNewCheckBox_1.setSelected(pat.getAlimnentary());;
					 chckbxRespiratorySystem.setSelected(pat.getRespiratory());
					 chckbxNewCheckBox_2.setSelected(pat.getCardiovascular());
					 chckbxNewCheckBox_4.setSelected(pat.getLocmotor());
					 chckbxNewCheckBox_3.setSelected(pat.getNervous());
					 
					 
					 //PathTest
					 lblPatname.setText(pat.getName());
					 lblPatage.setText(Integer.toString(pat.getAge()));
					 lblSex_2.setText(pat.getSex());
					 lblPatid.setText(Integer.toString(pat.getPID()));
					 
					 //report
					 //comboboxTestPicker.removeAllItems();
						ArrayList<String> testlist = DataProvider.getAvailableTest(pat.getPID());
					
						for(String tests : testlist){
								comboboxTestPicker.addItem(tests);
								System.out.println("Added "+tests);
						}
				}
				
				else{
					docLogin.setVisible(false);
					patLogin.setVisible(true);
					patDetails.setVisible(false);
					pathTest.setVisible(false);
					HISTORY.setVisible(false);
					patient_profile.setVisible(false);
				}
				
				
			}			
			
		});
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(true);
				patDetails.setVisible(false);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				graph.setVisible(false);
				report.setVisible(false);
				
				comboboxTestPicker.removeAllItems();
				comboBoxDatePicker.removeAllItems();
			
			}
		});
		
		comboboxTestPicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String selectedTest = (String) comboboxTestPicker.getSelectedItem();
				System.out.println(selectedTest);
				if(selectedTest != null){
					comboBoxDatePicker.removeAllItems();
					ArrayList<String> Dates = DataProvider.getTestDates(pat.getPID(), selectedTest);
					for(String Date : Dates){
						comboBoxDatePicker.addItem(Date);
						System.out.println(Date);
					}
				}
			}
		});
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				docLogin.setVisible(true);
				patLogin.setVisible(false);
				patDetails.setVisible(false);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				graph.setVisible(false);
				report.setVisible(false);
				
				
				
				
			}
		});
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 16));
	
		btnLogOut.setBounds(10, 606, 138, 34);
		patLogin.add(btnLogOut);
		
		JLabel label = new JLabel("");
		label.setIcon(null);
		label.setBounds(0, 0, 1274, 651);
		patLogin.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		patLogin.add(panel);
		

		

btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				HISTORY.setVisible(true);
				patient_profile.setVisible(false);
				report.setVisible(false);
				graph.setVisible(false);
				pathTest.setVisible(false);

				
				
				
				
			}
		});

btnCondition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(true);
				report.setVisible(false);
				graph.setVisible(false);
				
			}
		});

btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				pathTest.setVisible(true);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				report.setVisible(false);
				graph.setVisible(false);
			}
		});

btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				patient_profile.setVisible(false);
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				graph.setVisible(false);
				report.setVisible(true);
				
//				comboboxTestPicker.addItem("-select Test-");
//				comboBoxDatePicker.addItem("-select Date-");
//				
			}
		});


btnLogOut_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				docLogin.setVisible(true);
				patLogin.setVisible(false);
				patDetails.setVisible(false);
				
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				patient_profile.setVisible(false);
				graph.setVisible(false);
				report.setVisible(false);
			}
		});

btnGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				docLogin.setVisible(false);
				patLogin.setVisible(false);
				patDetails.setVisible(true);
				
				patient_profile.setVisible(false);
				pathTest.setVisible(false);
				HISTORY.setVisible(false);
				report.setVisible(false);
				graph.setVisible(true);
			}
		});
JButton btnBloodPressure = new JButton("Blood Pressure");
btnBloodPressure.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		getData cp = new getData("bloodpressure");
		cp.getDataSet();
	}
});
btnBloodPressure.setBounds(61, 105, 178, 75);
graph.add(btnBloodPressure);

JButton btnPulse = new JButton("Pulse");
btnPulse.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		getData cp = new getData("pulse");
		getData.getDataSet();
	}
});
btnPulse.setBounds(293, 105, 184, 75);
graph.add(btnPulse);

JButton btnRespiratory = new JButton("Respiratory");
btnRespiratory.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		getData cp = new getData("respiratory");
		getData.getDataSet();
	}
});
btnRespiratory.setBounds(531, 105, 178, 75);
graph.add(btnRespiratory);

JButton btnTemperature = new JButton("Temperature");
btnTemperature.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		getData cp = new getData("temp");
		getData.getDataSet();
	}
});
btnTemperature.setBounds(800, 105, 165, 75);
graph.add(btnTemperature);
patDetails.repaint();
patDetails.repaint();
patDetails.repaint();

		
	}
}
