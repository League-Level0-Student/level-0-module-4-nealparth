import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("What was your test score?");
				// int score= Integer.parseInt(answer);
				 double score=  Double.parseDouble(answer);
				 if(score< 50) {
					JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!"); 
				 }
}
}