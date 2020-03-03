
public class nintendoSwitch extends Bundle{

	public nintendoSwitch() {
		super("Nintentod Switch", 300, 0, 3, 12);
		super.AddItem("super Mario Odssey", 50);
		super.AddItem2("Protector Case", 15);
		
	}

	@Override
	public void AddItem(String addItemName, double addItemPrice) {
		System.out.println("Not possible to add another item");
	}

	@Override
	public void AddItem2(String addItemName2, double addItemPrice2) {
		System.out.println("Not possible to add another Item");
	}
	

}
