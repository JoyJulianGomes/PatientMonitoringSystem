package chart;

import java.awt.BorderLayout;
import mehadi.*;

import javax.swing.*;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;

public class chartGenerator {
	public static void showGraph(ChartPanel cpanel){
		
		JFrame frame1 = new JFrame("Graph");
		
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
        jp.add(cpanel, BorderLayout.NORTH);
        
        frame1.add(jp);
        frame1.pack();
        frame1.setVisible(true);
		
		
		
	}
}
