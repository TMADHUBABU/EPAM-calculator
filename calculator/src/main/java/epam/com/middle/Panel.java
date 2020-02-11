package epam.com.middle;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import epam.com.middle.Buttons;

public class Panel {



	public JTextField jf;
	public JPanel jp;
	Buttons but;
	
	Panel(){
		jp=new JPanel();
		but=new Buttons();
		
	}
	
	public void addtf(JFrame f) {
		jf=new JTextField(11);
		jp.add(jf);
		f.getContentPane().add(jp);
	}

	public void addb(JFrame f) {
		but.add(jp,f,jf);
	}


}
