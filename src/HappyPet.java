import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
			String pet= JOptionPane.showInputDialog("What kind of pet do you want");
			int happinessLevel = 0;
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			
		int	task = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "fortnite", "homework", "Big Baller Brand" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(pet.equalsIgnoreCase("dog")) {
				dog();
			}
			else if(pet.equalsIgnoreCase("cat")) {
				cat();
			}
			
			else if(pet.equalsIgnoreCase("lavar ball")) {
				LavarBall();
			}
				
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	private static void LavarBall() {
		// TODO Auto-generated method stub
		
	}

	private static void cat() {
		// TODO Auto-generated method stub
		
	}

	private static void dog() {
		// TODO Auto-generated method stub
		
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void dog(int d){
		if(d==0) {
			JOptionPane.showMessageDialog(null, "wroof");

		}
	}
		public static void cat(int d) {
			if(d==1) {
			JOptionPane.showMessageDialog(null, "meow");
			}
		}
		public static void LavarBall(int d){
			if(d==2) {
			JOptionPane.showMessageDialog(null, "Stay in your Lane!");
			}
			
}
}