// Fred Luartes, 2/23/2016
// Choose your own Adventure: This program uses nested if statements to create a text-based adventure game with eight different endings. 

import java.util.Scanner;

public class Adventure1 {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String kitchenOrLiving, kitchenOrLivingAns1, kitchenOrLivingAns2, 
		inspectOrEat, inspectOrEatAns1, inspectOrEatAns2, 
		yesOrNo, yesOrNoAns1, yesOrNoAns2, 
		answerOrIgnore, answerOrIgnoreAns1, answerOrIgnoreAns2, 
		prepareOrIgnore, prepareOrIgnoreAns1, prepareOrIgnoreAns2, 
		callOrLeave, callOrLeaveAns1, callOrLeaveAns2, 
		changeOrOff, changeOrOffAns1, changeOrOffAns2;
		
		kitchenOrLivingAns1 = "kitchen";
		kitchenOrLivingAns2 = "living";
		inspectOrEatAns1 = "inspect";
		inspectOrEatAns2 = "eat";
		yesOrNoAns1 = "yes";
		yesOrNoAns2 = "no";
		answerOrIgnoreAns1 = "answer";
		answerOrIgnoreAns2 = "ignore";
		prepareOrIgnoreAns1 = "prepare";
		prepareOrIgnoreAns2 = "ignore";
		callOrLeaveAns1 = "call";
		callOrLeaveAns2 = "leave";
		changeOrOffAns1 = "change";
		changeOrOffAns2 = "off";
		
		System.out.println("Welcome to your own Adventure! ");
		System.out.println("You wake up in your room. You are hungry and bored. Would you go into your \"kitchen\" or your \"living\" room? ");
		kitchenOrLiving = keyboard.next();
		
		if (kitchenOrLiving.equals(kitchenOrLivingAns1)) {
			System.out.println("You go get food at the refrigerator, when you heard a loud noise outside. Do you \"inspect\" what is it, or just \"eat\"? ");
			inspectOrEat = keyboard.next();
			
			if (inspectOrEat.equals(inspectOrEatAns1)) {
				System.out.println("You go to your main door and listen through the door. The noise gets closer. Do you open the door? (\"yes\" or \"no\") ");
				yesOrNo = keyboard.next();
				
				if (yesOrNo.equals(yesOrNoAns1)) {
					System.out.println("You see zombies, and they run to you and eat you. You lose!");
					System.out.println("Thanks for playing! ");
				}
				
				else if (yesOrNo.equals(yesOrNoAns2)) {
					System.out.println("The noise disappears. You get some more food, and eat your meal for the day. You win! ");
					System.out.println("Thanks for playing! ");
				}
			}
			
			else if (inspectOrEat.equals(inspectOrEatAns2)) {
				System.out.println("You eat your food, but you hear people outside knocking on the door. Do you \"answer\" or \"ignore\" them? ");
				answerOrIgnore = keyboard.next();
				
				if (answerOrIgnore.equals(answerOrIgnoreAns1)) {
					System.out.println("Men with suits tell you that you are the heir to millions, and they take you to your rich parents. You win!");
					System.out.println("Thanks for playing! ");
				}
				
				else if (answerOrIgnore.equals(answerOrIgnoreAns2)) {
					System.out.println("Mobs bang your door, then destroy your house. You lose! ");
					System.out.println("Thanks for playing! ");
				}
			}
		}

		else if (kitchenOrLiving.equals(kitchenOrLivingAns2)) {
			System.out.println("You turn on the TV, and see that there's a super typhoon coming. Do you \"prepare\" for it, or \"ignore\" the warning? ");
			prepareOrIgnore = keyboard.next();
			
			if (prepareOrIgnore.equals(prepareOrIgnoreAns1)) {
				System.out.println("You prepare your emergency stuff, when the typhoon suddenly hits your town. Do you \"call\" your loved ones, or \"leave\" alone. ");
				callOrLeave = keyboard.next();
				
				if (callOrLeave.equals(callOrLeaveAns1)) {
					System.out.println("You learn that they are safe, and are waiting for you at the evacuation center. You win!");
					System.out.println("Thanks for playing! ");
				}
				
				else if (callOrLeave.equals(callOrLeaveAns2)) {
					System.out.println("You go to the evacuation center alone, but you are flash flooded en route. You lose! ");
					System.out.println("Thanks for playing! ");
				}
			}
			
			else if (prepareOrIgnore.equals(prepareOrIgnoreAns2)) {
				System.out.println("You stay at home and learn that its a false alarm. Do you \"change\" the channel or turn \"off\" the TV? ");
				changeOrOff = keyboard.next();
				
				if (changeOrOff.equals(changeOrOffAns1)) {
					System.out.println("You see a TV series you like and get addicted, watching non-stop. You lose!");
					System.out.println("Thanks for playing! ");
				}
				
				else if (changeOrOff.equals(changeOrOffAns2)) {
					System.out.println("You realize that you want to do something more productive, and do it. You win! ");
					System.out.println("Thanks for playing! ");
				}
			}
		}	
	}
}