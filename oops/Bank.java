package oops;

import java.util.Scanner;
//Encapsulation = Data Hiding + Data Abstraction
class DebitCard {
	// Data Hiding
	private int pinNumber;

	// Data Abstraction
	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

}

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Pin Number ?");
		int pin = sc.nextInt();
		DebitCard visaCard = new DebitCard();
		visaCard.setPinNumber(pin);
		if (visaCard.getPinNumber() == 1234) {
			System.out.println("Welcome ATM Main menu");
		} else {
			System.out.println("Wrong pin number");
		}

	}

}
