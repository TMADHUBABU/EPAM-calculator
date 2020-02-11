package epam.com.middle;

import javax.swing.JFrame;

import epam.com.middle.Panel;

public class Window {
	JFrame f;
	Panel p;
	public Window(){
		f=new JFrame("calculator");
		Panel p=new Panel();
		
		p.addtf(f);
		p.addb(f);
		
		f.setSize(300,300);
		f.setVisible(true);
	}
}
