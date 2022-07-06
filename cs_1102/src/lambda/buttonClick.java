package lambda;

import java.awt.*;

public class buttonClick {
	
	public static void main(String[] args) {
		Frame frame = new Frame("Java - 8 Action-Listener");
		
		Button b = new Button("click me");
		b.setBounds(40, 80, 60, 40);
		
		b.addActionListener(e -> System.out.println("Hello world. Welcome to Simplilearn"));
		frame.add(b);
		
		frame.setSize(150, 150);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}


