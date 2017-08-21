import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class App extends Applet{

	Button b1,b2,b3;
	Label my;
//	public changeText 
	public void init(){
		b1 = new Button("yes");
		b2 = new Button("no");
		b3 = new Button("undecided");
		my = new Label("Some text",Label.CENTER);
		
		b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                my.setText("yes pressed");
            }
        });

		b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                my.setText("NO pressed");
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                my.setText("undecided pressed");
            }
        });
		add(b1);
		add(b2);
		add(b3);
		add(my);
	}
	// public void paint(Graphics g){
	// 	g.drawRoundRect(10, 30, 120, 120, 2, 3);
	// }
}