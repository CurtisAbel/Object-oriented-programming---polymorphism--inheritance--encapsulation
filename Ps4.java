
public class Ps4 extends Bundle {
	
	private String addItemPS4BundleName;
	private double addItemPS4BundlePrice;
	
	
	public Ps4() {
		super("Playstation4", 200, 1, 0,12);
		super.AddItem("Controller", 40);
	 super.AddItem2("Turtle beach Gaming Headset", 70);
		
	
		
		
		
		
	}
	
	public void addPs4Items(String addItemPS4BundleName, double addItemPS4BundlePrice ) {
		
		this.addItemPS4BundleName = addItemPS4BundleName;
		this.addItemPS4BundlePrice=addItemPS4BundlePrice;
		
		
	}


	@Override
	public double itemizeBundle() {
	
		double bundlePrice = super.itemizeBundle();
		
		if(this.addItemPS4BundleName !=null) {
			bundlePrice+=addItemPS4BundlePrice;
			System.out.println("Item: " + this.addItemPS4BundleName + " has been added for a price of: " + this.addItemPS4BundlePrice);
			
		}
		return bundlePrice;
	}
	
}
