
public class Main {
public static void main(String[] args) {
	
	
	Bundle bundle = new Bundle("PS4 Pro", 250, 2,3,12);
	
	bundle.AddItem("headset", 70);
	bundle.AddItem2("USB cable", 5);
	System.out.println("Making total price: " + bundle.itemizeBundle());
	
	
	Ps4 ps4 = new Ps4();
	ps4.addPs4Items("usb cable", 1.99);
	System.out.println("Making total price: " + ps4.itemizeBundle());
	
	xboxOne xbox = new xboxOne();
	
	xbox.addXboxItems("Xbox headset", 40);
	xbox.AddItem("steering wheel", 150);
	System.out.println("Total price of bundle: " + xbox.itemizeBundle());
	
	nintendoSwitch nintendoswitch= new nintendoSwitch();
	
	nintendoswitch.itemizeBundle();
	
	nintendoswitch.AddItem("headphones", 20);
	
	System.out.println("Total price of bundle: " + nintendoswitch.itemizeBundle());
	}
	
	
	
}

