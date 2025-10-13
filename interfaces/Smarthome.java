package interfaces;

public class Smarthome{
	static class Ac implements Smart_device_control{
		public void turnOn() {
			System.out.println("Ac turn on.");
		}
		public void turnOff() {
			System.out.println("Ac turn off.");
		}
	}
	static class Tv implements Smart_device_control{
		public void turnOn() {
			System.out.println("TV turn on.");
		}
		public void turnOff() {
			System.out.println("TV turn off.");
		}
	}
	static class Light implements Smart_device_control{
		public void turnOn() {
			System.out.println("Light turn on.");
		}
		public void turnOff() {
			System.out.println("Light turn off.");
		}
	}
}