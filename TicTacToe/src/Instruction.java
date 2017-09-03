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
	static JTextField textField_1player2 = new JTextField();
	static JTextField textFieldPlayer1 = new JTextField();
	static String player1;
	static String player2;
	

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
		setBounds(300, 100, 467, 307);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrthisGamePlay = new JTextArea();
		txtrthisGamePlay.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrthisGamePlay.setBackground(Color.LIGHT_GRAY);
		txtrthisGamePlay.setText("1.This Game play between Two Players.\r\n2.First Player Start Game and press on any one Button.\r\n3.after that second Player press on any Button .\r\n4.and its move next and next.\r\n5.which player will make three 0 or x in a row ,column \r\nor triangle .\r\n6.That will be win.");
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

				TicTacToe mainScreen = new TicTacToe();
	            mainScreen.setVisible(true);
	            Instruction.this.dispose();
			}
		});
		btnStart.setBackground(Color.GREEN);
		btnStart.setForeground(Color.BLUE);
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnStart.setBounds(345, 195, 106, 40);
		contentPane.add(btnStart);
		
		JLabel firstPlayer = new JLabel("firstPlayer");
		firstPlayer.setForeground(Color.BLACK);
		firstPlayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		firstPlayer.setBounds(10, 184, 68, 25);
		contentPane.add(firstPlayer);
		
		JLabel secondPlayer = new JLabel("secondPlayer");
		secondPlayer.setForeground(Color.BLACK);
		secondPlayer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		secondPlayer.setBounds(0, 227, 87, 25);
		contentPane.add(secondPlayer);
		
		
		textFieldPlayer1.setForeground(Color.MAGENTA);
		textFieldPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldPlayer1.setBounds(85, 184, 193, 32);
		contentPane.add(textFieldPlayer1);
		textFieldPlayer1.setColumns(10);
		
		
		textField_1player2.setForeground(Color.MAGENTA);
		textField_1player2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1player2.setBounds(85, 224, 193, 32);
		contentPane.add(textField_1player2);
		textField_1player2.setColumns(10);
		ButtonGroup group = new ButtonGroup();
	}
}
