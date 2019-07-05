import javax.swing.JFrame;

public class Main {
	// coubstructor
	public Main() {

		JFrame frame = new JFrame();
		GamePanel game = new GamePanel();
		frame.add(game);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Snake Game");
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Main();

	}

}
