package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 432);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.NORTH);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panel.setLayout(fl_panel);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		JButton button1 = new JButton("CD Hinzuf\u00FCgen");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_2.add(button1);
		
		JButton button2 = new JButton("Song Hinzuf\u00FCgen");
		panel_2.add(button2);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JButton button3 = new JButton("CD Entfernen");
		panel_1.add(button3);
		
		JButton button4 = new JButton("Song Entfernen");
		panel_1.add(button4);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTree tree = new JTree();
		scrollPane.setViewportView(tree);
	}

}
