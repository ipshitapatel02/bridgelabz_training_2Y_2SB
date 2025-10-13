package interfaces;

public class Home {
	public static void main(String[] args) {
		Smart_device_control ac= new Smarthome.Ac();
		Smart_device_control light= new Smarthome.Light();
		Smart_device_control tv= new Smarthome.Tv();
		ac.turnOn();
		ac.turnOff();
		light.turnOn();
		light.turnOff();
		tv.turnOn();
		tv.turnOff();
	}
}
