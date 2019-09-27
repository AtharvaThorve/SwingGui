import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private TextPanel textPanel;
	private JButton btn;

	public MainFrame() {
		super("Hello World");

		setLayout(new BorderLayout());

		textPanel = new TextPanel();
		btn = new JButton("Click me!");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPanel.appendText("Hello\n");
			}
		});

		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
