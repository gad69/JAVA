package oops;
//Encapsulation  = data hiding + data abstraction
class DebitCardDemo
{
	private int pinNumber;//data hiding
    //data abstraction
	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		DebitCardDemo visaCard = new DebitCardDemo();
		visaCard.setPinNumber(1234);
		System.out.println(visaCard.getPinNumber());
	}

}
