import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TextArea1 implements ActionListener {
	
	JTextArea text;
	
	public static void main(String[] args) {
		TextArea1 gui = new TextArea1();
		gui.go();
	}
	
	public void go() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("click me");
		button.addActionListener(this);
		text = new JTextArea(10, 20);
		text.setLineWrap(true);
		
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ev) {
		text.append("button clicked \n");
	}
}