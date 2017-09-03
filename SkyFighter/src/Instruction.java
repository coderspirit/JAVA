import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Instruction extends JFrame {

	private JPanel contentPane;
	static JTextField textFieldPlayer1 = new JTextField();

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Instruction frame = new Instruction();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */ public void askForClose(){
		 int coice = JOptionPane.showConfirmDialog(this, "Do You want to close", "Game One", JOptionPane.YES_NO_OPTION);
	     if(coice==JOptionPane.YES_OPTION){
	    	 this.dispose();
	    	 this.setVisible(false);
	     }
	     if(coice == JOptionPane.NO_OPTION) {
	    	 return;
	     }
	 }
	public Instruction() {
          
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
				
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(450, 100, 479, 307);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 50, 204));
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrthisGamePlay = new JTextArea();
		txtrthisGamePlay.setEditable(false);
		txtrthisGamePlay.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrthisGamePlay.setBackground(Color.LIGHT_GRAY);
		txtrthisGamePlay.setText("1.Mainly Three button used in this game.\r\n2.Press spaceBar for missile.\r\n3.press upArrow key for moving up.\r\n4.Press downArrow for Moving Down.\r\n5.press left arrow for left move and right \r\n  arrow for right move.");
		txtrthisGamePlay.setBounds(10, 23, 451, 150);
		contentPane.add(txtrthisGamePlay);
		
		JLabel lblNewLabel = new JLabel("INSTRUCTIONS");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(155, 0, 123, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				GameScreen mainScreen = new GameScreen();
	            mainScreen.setVisible(true);
	            Instruction.this.dispose();
			}
		});
		btnStart.setBackground(new Color(30, 144, 255));
		btnStart.setForeground(new Color(0, 128, 0));
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStart.setBounds(189, 227, 106, 40);
		contentPane.add(btnStart);
		
		JLabel firstPlayer = new JLabel("playerName");
		firstPlayer.setForeground(Color.BLACK);
		firstPlayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		firstPlayer.setBounds(34, 187, 80, 25);
		contentPane.add(firstPlayer);
		textFieldPlayer1.setBackground(new Color(65, 105, 225));
		
		
		textFieldPlayer1.setForeground(new Color(255, 0, 0));
		textFieldPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPlayer1.setBounds(124, 184, 270, 32);
		contentPane.add(textFieldPlayer1);
		textFieldPlayer1.setColumns(10);
		ButtonGroup group = new ButtonGroup();
	}
}
