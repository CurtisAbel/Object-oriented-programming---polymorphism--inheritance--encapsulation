
public class xboxOne extends Bundle {
	
	private String addItemXboxName;
	private double addItemXboxPrice;

	public xboxOne() {
		super("Xbox one", 300, 2, 2, 3);
		
	}

	public void addXboxItems(String addItemXboxName,double addItemXboxPrice ) {
		
		this.addItemXboxName=addItemXboxName;
		this.addItemXboxPrice=addItemXboxPrice;
		
		
	}

	@Override
	public double itemizeBundle() {
	double	bundlePrice = super.itemizeBundle();
	
	if(this.addItemXboxName !=null) {
		bundlePrice+=addItemXboxPrice;
		System.out.println("Item: " + this.addItemXboxName + " for a price of: " + this.addItemXboxPrice );
		
	}
	return bundlePrice;
	}
	

}
