import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BinaryConverter implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField answer = new JTextField(20);
JLabel output = new JLabel();
JButton button  = new JButton();
public static void main(String[] args) {
	BinaryConverter convert = new BinaryConverter();
	convert.setup();
}
void setup() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	button.setPreferredSize(new Dimension(100,20));
	button.setText("convert");
	button.addActionListener(this);
	panel.add(answer);
	panel.add(button);
	panel.add(output);
	frame.setPreferredSize(new Dimension(500,30));
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	output.setText(convert(answer.getText()));
	
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
}
