package epam.com.middle;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import epam.com.middle.Buttons;

public class Panel {



	public JTextField jf;
	public JPanel jp;
	Buttons b;
	
	Panel(){
		jp=new JPanel();
		b=new Buttons();
		
	}
	
	public void addtextfield(JFrame f) {
		jf=new JTextField(11);
		jp.add(jf);
		f.getContentPane().add(jp);
	}

	public void addbuttons(JFrame f) {
		b.add(jp,f,jf);
	}


}
