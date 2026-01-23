package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JavaSwing {
	JTextArea t1=new JTextArea();
	JavaSwing() {
		JFrame j = new JFrame();
		JButton b=new JButton("Submit");
		b.setBounds(50, 50, 120, 80);
		t1.setBounds(200, 200, 160, 100);
		j.add(b);
		j.add(t1);
		j.setSize(160, 100);
		j.setLayout(null);
		j.setVisible(true);
	}
	
	public static void main(String[] args) {
		JavaSwing js=new JavaSwing();
	}
}
