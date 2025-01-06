package SankeGame;

import javax.swing.JFrame;




public class GameFrame extends JFrame{

	//constructor for the GameFrame 
	GameFrame(){
//		GamePanel panel = new GamePanel();
//		this.add(panel);
		
		this.add(new GamePanel());
		this.setTitle("SnakeGame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	
}
