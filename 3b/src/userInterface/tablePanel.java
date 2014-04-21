package userInterface;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;


public class tablePanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public tablePanel() {
		//setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setBackground( new Color(193, 4, 53) );
		
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		table = new JTable();
		table.setRowHeight(18);
		table.setRowMargin(3);
		table.setPreferredScrollableViewportSize(new Dimension(600, 400));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 13));
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Subject", "CRN", "Days", "Hours", "ID", "Notes"
			}
		));
		scrollPane.setViewportView(table);

	}

}
