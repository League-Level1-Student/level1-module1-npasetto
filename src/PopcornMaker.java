import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave m = new Microwave();
	String flavor = JOptionPane.showInputDialog("What flavor do you want the popcorn to be?");
	Popcorn p = new Popcorn(flavor);
	m.putInMicrowave(p);
	String time = JOptionPane.showInputDialog("How much time do you want to cook it?");
	int timeInt = Integer.parseInt(time);
	m.setTime(timeInt);
	m.startMicrowave();
}
}
