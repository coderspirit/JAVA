import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class TicTacToe extends JFrame {
	private boolean isXorZero = true;
	private JPanel contentPane;
	JLabel label = new JLabel("");
	JButton oneBt = new JButton(" ");
	JButton twobt = new JButton("");
	JButton threeBt = new JButton("");
	JButton fourBt = new JButton("");
	JButton fiveBt = new JButton("");
	JButton sixBt = new JButton("");
	JButton sevenBt = new JButton("");
	JButton eigthBt = new JButton("");
	JButton nineBt = new JButton("");
	private boolean isNotBlank(JButton button){
		if(button.getText().trim().length()==0){
			return false;
		}
		else
		{
			return true;
		}
	}
	private boolean isRowNotBlank(JButton b1 , JButton b2, JButton b3){
		if(isNotBlank(b1) && isNotBlank(b2) && isNotBlank(b3)){
		return true;
		}
		else
		{
			return false;
		}
	}
	private boolean isRowMatch(JButton b1 , JButton b2, JButton b3){
		if(isRowNotBlank(b1,b2,b3)){
		if(b1.getText().equals(b2.getText()) 
				&& b1.getText().equals(b3.getText())){
			return true;
		}
		else{
			return false;
		}
		}
		else{
			return false;
		}
	}
	
	private boolean isGameOver(){
		if(isRowNotBlank(oneBt,twobt,threeBt)&& isRowNotBlank(fourBt,fiveBt,sixBt)&&isRowNotBlank(sevenBt,eigthBt,nineBt)){
			
			label.setText("Match Draw....");
		}
			if(isRowMatch(oneBt,twobt,threeBt)){
				return true;
			}
			else
				if(isRowMatch(oneBt,fourBt,sevenBt)){
					return true;
				}
				else
					if(isRowMatch(oneBt,fiveBt,nineBt)){
						return true;
					}	
			else
			if(isRowMatch(threeBt,sixBt,nineBt)){
				return true;
			}
			else
				if(isRowMatch(threeBt,fiveBt,sevenBt)){
					return true;
				}
				
		return false;
	}
	private void resetGame(){
		oneBt.setText("");
		twobt.setText("");
		threeBt.setText("");
		fourBt.setText("");
		fiveBt.setText("");
		sixBt.setText("");
		sevenBt.setText("");
		eigthBt.setText("");
		nineBt.setText("");
		
	}
	private void printXorZero(JButton button){
		if(button.getText().trim().length()==0){
		if(isXorZero){
			button.setText("X");
		}
		else{
			button.setText("0");
		}
		isXorZero = !isXorZero;
		if(isGameOver()){
			JOptionPane.showMessageDialog(this
					, "Game Over "+button.getText()+" U Win");
			isXorZero=true;
			resetGame();
		}
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	 public void askForClose(){
		 int coice = JOptionPane.showConfirmDialog(this, "Do You want to close", "Game One", JOptionPane.YES_NO_OPTION);
	     if(coice==JOptionPane.YES_OPTION){
	    	 this.dispose();
	    	 this.setVisible(false);
	     }
	     if(coice == JOptionPane.NO_OPTION) {
	    	 return;
	     }
	 }
	public TicTacToe() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				askForClose();
				
			}
		});
		setTitle("TicTacToe-Game2016");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setBounds(300, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		oneBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(oneBt);
			}
		});
		oneBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		oneBt.setBounds(48, 51, 85, 50);
		contentPane.add(oneBt);
		
		
		twobt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(twobt);
			}
		});
		twobt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		twobt.setBounds(156, 51, 85, 50);
		contentPane.add(twobt);
		
		
		threeBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(threeBt);
			}
		});
		threeBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		threeBt.setBounds(265, 51, 85, 50);
		contentPane.add(threeBt);
		
		
		fourBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(fourBt);
			}
		});
		fourBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		fourBt.setBounds(48, 112, 85, 50);
		contentPane.add(fourBt);
		
		
		fiveBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(fiveBt);
			}
		});
		fiveBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		fiveBt.setBounds(156, 112, 85, 50);
		contentPane.add(fiveBt);
		
		
		sixBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(sixBt);
			}
		});
		sixBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		sixBt.setBounds(265, 112, 85, 50);
		contentPane.add(sixBt);
		
		
		sevenBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(sevenBt);
			}
		});
		sevenBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		sevenBt.setBounds(48, 173, 85, 46);
		contentPane.add(sevenBt);
		
		
		eigthBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(eigthBt);
			}
		});
		eigthBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		eigthBt.setBounds(156, 173, 85, 46);
		contentPane.add(eigthBt);
		
		
		nineBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			printXorZero(nineBt);
			}
		});
		nineBt.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		nineBt.setBounds(265, 173, 85, 46);
		contentPane.add(nineBt);
		label.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		
		
		label.setForeground(Color.RED);
		label.setBounds(221, 0, 213, 22);
		contentPane.add(label);
		
		JButton restart = new JButton("Restart");
		restart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TicTacToe.this.dispose();
				TicTacToe tictac=new TicTacToe();
				tictac.setVisible(true);
				
			}
		});
		restart.setBackground(Color.BLUE);
		restart.setForeground(Color.ORANGE);
		restart.setFont(new Font("Tahoma", Font.PLAIN, 14));
		restart.setBounds(144, 230, 114, 34);
		contentPane.add(restart);
		
		JLabel moveStatus = new JLabel("Note:First move is X.");
		moveStatus.setForeground(Color.DARK_GRAY);
		moveStatus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		moveStatus.setBounds(10, 0, 135, 22);
		contentPane.add(moveStatus);
	}
}
