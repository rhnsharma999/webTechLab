import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame{
    private Label nameLabel,rollLabel,infoLabel;
    private TextField nameField,rollField;
    private Button doneButton;
    private TextArea infoBox;

    public myFrame(){

        setTitle("Hello World");
        setSize(300,500);
        setLocation(10,10);

        nameLabel = new Label("Enter name",JLabel.CENTER);
        rollLabel = new Label("Enter reg number",JLabel.CENTER);
        infoLabel = new Label("Following Info was entered",JLabel.CENTER);
    
        nameField = new TextField(12);
        rollField = new TextField(12);

        infoBox = new TextArea();

        doneButton = new Button("Done");
        doneButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                infoBox.setText("Name : " + nameField.getText() + "\n" + "Reg No : " + rollField.getText());
            }
        });
        

        Container pane = getContentPane();
        pane.setLayout(new FlowLayout());
        pane.add(nameLabel);
        pane.add(nameField);
        pane.add(rollLabel);
        pane.add(rollField);
        pane.add(infoLabel);
        pane.add(infoBox);
        pane.add(doneButton);


        setDefaultCloseOperation(EXIT_ON_CLOSE);

   }
}
public class GUI
{
    public static void main(String args[]){
        JFrame guiframe = new myFrame();  
        guiframe.show();
    }
}