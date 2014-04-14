import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;


public class titlePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public titlePanel() {
		setBackground( new Color(193, 4, 53) );
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(titlePanel.class.getResource("/resources/logo-header-white.png")));
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setVgap(20);
		add(panel, BorderLayout.NORTH);
		panel.setBackground( new Color(33, 33, 33) );
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(20);
		add(panel_1, BorderLayout.SOUTH);
		panel_1.setBackground( new Color(33, 33, 33) );
		
	}

}
