package userInterface;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SortPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public SortPanel() {
		setPreferredSize(new Dimension(250, 100));
		setBackground(new Color(193, 4, 53));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel sortLabel = new JLabel("Sort By: ");
		sortLabel.setFont(new Font("Serif", Font.BOLD, 16));
		sortLabel.setForeground(Color.WHITE);
		add(sortLabel);
		
		final JComboBox sortComboBox = new JComboBox();
		sortComboBox.setModel(new DefaultComboBoxModel(new String[] {"Instructor", "Courses", "Time"}));
		add(sortComboBox);
		
		//BUTTON FOR TO SORT THE JTABLE AROUND
		JButton sortButton = new JButton("Sort");
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(sortComboBox.getSelectedItem().toString())
				{
					case "Instructor": System.out.println("Instructor"); break;
					case "Courses": System.out.println("Courses"); break;
					case "Time": System.out.println("Time"); break;
				}
			}
		});
		add(sortButton);

	}
}
