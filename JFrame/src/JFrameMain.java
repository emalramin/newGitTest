import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameMain extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new JFrameMain().setVisible(true);
	}

	private JFrameMain() {
		super("Tek School of America");
		setSize(600, 600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(3, 3));

		JButton button1 = new JButton("My Class Assignment: " + "05/26/2020");
		JButton button2 = new JButton("What I Like About Java");
		JButton button3 = new JButton("Rated From 1 - 5");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.WEST);
		add(button3, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();

		if (name.equals("Click Me, Sana Safi")) {
			System.out.println("Sana Safi is smart");
		} else if (name.equals("Click Me, Sajda Safi")) {
			System.out.println("Sajda Safi is smart");
		}

	}

}
