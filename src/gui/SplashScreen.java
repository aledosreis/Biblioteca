package gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

@SuppressWarnings("serial")
public class SplashScreen extends JFrame {

	private JPanel panelsplash;
	private JProgressBar progress;
	private JLabel percent;
	private JLabel image;
	
	public SplashScreen() {
		this.setUndecorated(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(550, 350);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		panelsplash = new JPanel();
		panelsplash.setLayout(null);
		panelsplash.setSize(550,350);
		panelsplash.setBackground(Color.WHITE);
		this.add(panelsplash);
		
		progress = new JProgressBar();
		progress.setBounds(50, 300, 450, 15);
		//progress.setIndeterminate(true);
		panelsplash.add(progress);
		
		percent = new JLabel();
		percent.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		percent.setBounds(250, 275, 40, 15);
		panelsplash.add(percent);
		
		image = new JLabel("");
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/icon.png"));
		image.setIcon(icon);
		image.setBounds(150, 80, 200, 200);
		panelsplash.add(image);
		
	}
	
	public void rodaSplash() {
		try {
			for (int i = 0; i <= 100; i++) {
				percent.setText(i+"%");
				progress.setValue(i);
				Thread.sleep(50);
				if (i == 100) {
					this.dispose();
					Login login = new Login();
					login.setVisible(true);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
