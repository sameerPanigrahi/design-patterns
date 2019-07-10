package command_pattern.receiver;

// receiver/subject
public class Light implements Receiver {

	public Light() {
		System.out.println("creating object for Receiver Light...");
	}

	public void turnOn() {
		System.out.println("Lights On!");
	}

	public void turnOff() {
		System.out.println("Lights Off!");
	}

}
