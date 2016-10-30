import java.awt.GridLayout;

import javax.swing.JFrame;


public class MazeGUI {
	
		   public static void main (String [] args) {
		      JFrame world = new JFrame();
		      world.setSize(1024, 800);
		      world.setTitle("Maze");
		 //     this.setSize(1024,800);
		      MazePanel p = new MazePanel();
		      p.setLayout(new GridLayout(p.board.length, 31, 3, 3));
		      world.setContentPane(p);
		     
		      world.setVisible(true);
		      Thread gameThread = new Thread(p);
		      gameThread.start();
		   }
		}

