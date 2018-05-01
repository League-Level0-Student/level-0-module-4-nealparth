import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	int plot=  JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Lakers", "author", "architect" }, null);
	if(plot==0) {
		int next= JOptionPane.showOptionDialog(null, "What do you want to be?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "GM", "Manager", "Player" }, null);
		int next1= JOptionPane.showOptionDialog(null, "What's your descision now", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Retire", "DO it", "Think about it" }, null);
		
		
	}
	
	else if(plot==1) {
		int further= JOptionPane.showOptionDialog(null, "What do you genre to write about?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "fantasy", "mystery", "action" }, null);
		int further1= JOptionPane.showOptionDialog(null, "What do you choose to do know", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Do it", "Quit", "choose a diferent one later" }, null);
	}
	else if(plot==2) {
		int after= JOptionPane.showOptionDialog(null, "What do you want to build", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "building", "bridge", "park" }, null);
		int after1= JOptionPane.showOptionDialog(null, "What do you want to do now", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Keep Building", "Quit", "Take a break" }, null);
		
	}
}
}
