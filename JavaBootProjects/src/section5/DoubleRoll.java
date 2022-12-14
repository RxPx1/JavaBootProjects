package section5;

public class DoubleRoll {

	public static void main(String[] args) throws InterruptedException {

		int dice1 = rollDice();
		int dice2 = rollDice();
		System.out.println();
		System.out.println("Dice 1: " + dice1);
		System.out.println("Dice 2: " + dice2);
		System.out.println();

		while (!(dice1 == dice2)) {
			System.out.println();
			System.out.println("Dice 1: " + dice1);
			System.out.println("Dice 2: " + dice2);
			System.out.println();
			dice1 = rollDice();
			dice2 = rollDice();
			Thread.sleep(500);
		}
		System.out.println();
		System.out.println("Dice 1: " + dice1);
		System.out.println("Dice 2: " + dice2);
		System.out.println();
		System.out.println("You rolled doubles!");

	}

	public static int rollDice() {
		int randomNum = (int) (Math.random() * ((6 - 1) + 1) + 1);
		return randomNum;
	}
}
