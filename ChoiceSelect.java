import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myFrame extends JFrame{
	private Choice lol;
	private Label sel;

	public myFrame(){

		String arr[] = {"first","second","third","fourth"};

		setTitle("Bars");
		setSize(500,500);
		setLocation(10,10);

		lol = new Choice();
		sel = new Label("Selected Choice",Label.CENTER);
		for(int i = 0; i < arr.length; i++) lol.add(arr[i]);

		
		lol.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				sel.setText(lol.getSelectedItem());
			}
		});

		Container my = getContentPane();
		my.setLayout(new GridLayout(2,1));
		add(lol);
		add(sel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
public class ChoiceSelect{
	public static void main(String args[]){
		myFrame temp = new myFrame();
		temp.show();

	}
}