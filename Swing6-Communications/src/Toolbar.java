import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	
	private JButton helloBtn;
	private JButton goodbyeBtn;
	private TextPanel textPanel;
	
	public Toolbar() {
		helloBtn=new JButton("Hello");
		goodbyeBtn=new JButton("Goodbye");
		
		helloBtn.addActionListener(this);
		goodbyeBtn.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(helloBtn);
		add(goodbyeBtn);
	}
	
	public void setTextPanel(TextPanel textPanel) {
		this.textPanel=textPanel;
	}

	public void actionPerformed(ActionEvent e) {
		JButton clicked=(JButton) e.getSource();
		if(clicked==helloBtn) {
			textPanel.appendText("Hello\n");
		} else if (clicked==goodbyeBtn) {
			textPanel.appendText("Goodbye\n");
		}
	}
	
}
