import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import jaco.mp3.player.MP3Player;
import java.awt.SystemColor;

public class GameLauncher<FrontPageGame> extends JWindow {
	private JPanel contentPane;
	JLabel lblIcon = new JLabel("");
	JLabel lblvisible;
	Timer timer;
	boolean visible=false;
	int counter = 0;
	JProgressBar progressBar;
	MP3Player song;
	
	public void playSong(){
		song = new MP3Player(GameLauncher.class.getResource("S.mp3"));
        song.play();	
	}
	
              public static void main(String[] args) {		
            	  GameLauncher frame = new GameLauncher();
					frame.setVisible(true);
					frame.forVisible();
                    frame.playSong();
 }
 
 public void forVisible(){
	 timer = new Timer(130, new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(counter>=101){
				Instruction instruct =new Instruction();
				instruct.setVisible(true);
				GameLauncher.this.dispose();
				GameLauncher.this.setVisible(false);
				timer.stop();
                song.stop();			
			}
	              lblvisible.setVisible(visible);
	              visible = !visible;
	              progressBar.setValue(counter);
	              counter++;
		}
	});
	 timer.start();
 }
 
	public GameLauncher() {
		getContentPane().setBackground(SystemColor.textHighlight);		
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
		lblIcon.setForeground(Color.RED);
		lblIcon.setBackground(Color.CYAN);
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setIcon(new ImageIcon(GameLauncher.class.getResource("intro.gif")));		
		lblIcon.setBounds(10, 65, 580, 462);
		getContentPane().add(lblIcon);		
		progressBar = new JProgressBar();
		progressBar.setBackground(new Color(138, 43, 226));
		progressBar.setForeground(new Color(220, 20, 60));
		progressBar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		progressBar.setIndeterminate(true);
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 558, 580, 31);
		getContentPane().add(progressBar);		
		lblvisible = new JLabel("Start Game");
		lblvisible.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblvisible.setForeground(Color.RED);
		lblvisible.setHorizontalAlignment(SwingConstants.CENTER);
		lblvisible.setBounds(20, 527, 580, 29);
		getContentPane().add(lblvisible);
		
		JLabel lblSkyfighter = new JLabel("SKYFIGHTER 2017");
		lblSkyfighter.setForeground(new Color(255, 0, 0));
		lblSkyfighter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSkyfighter.setBounds(234, 34, 172, 31);
		getContentPane().add(lblSkyfighter);
	}
}
