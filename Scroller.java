import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class myFrame extends JFrame{
	private Scrollbar myBar;
	private Label indicator;

	public myFrame(){
		setTitle("Bars");
		setSize(500,500);
		setLocation(10,10);

		myBar = new Scrollbar();
		myBar.setPreferredSize(new Dimension(100, 200));
		myBar.setMaximum(1000);
		myBar.setMinimum(100);
		indicator = new Label("Sample",Label.CENTER);

		myBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
            	indicator.setText(" " + myBar.getValue() );
            }
         });

		Container my = getContentPane();
		my.setLayout(new FlowLayout());
		my.add(myBar);
		my.add(indicator);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
public class Scroller{
	public static void main(String args[]){
		myFrame temp = new myFrame();
		temp.show();

	}
}