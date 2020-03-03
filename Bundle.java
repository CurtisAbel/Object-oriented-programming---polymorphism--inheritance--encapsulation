
public class Bundle {
	
	private String consoleName;
	private double priceConsole;
	private int controllers;
	private int numOfGames;
	private int sub;
	
	
	private String addItemName;
	private double addItemPrice;
	
	
	private String addItemName2;
	private double addItemPrice2;
	
	
	public Bundle(String consoleName, double priceConsole, int controllers, int numOfGames, int sub) {
		super();
		this.consoleName = consoleName;
		this.priceConsole = priceConsole;
		this.controllers = controllers;
		this.numOfGames = numOfGames;
		this.sub=sub;
		
	}
	
	
	public void AddItem(String addItemName, double addItemPrice) {
		this.addItemPrice=addItemPrice;
		this.addItemName=addItemName;
		
		
		
	}
	
	public void AddItem2(String addItemName2, double addItemPrice2) {
		this.addItemPrice2=addItemPrice2;
		this.addItemName2=addItemName2;
		
		
		
	}

	public double itemizeBundle(){
		
		double bundlePrice = this.priceConsole;
		System.out.println("Included within bundle: " + this.consoleName + 
				" with " + this.controllers + " additional controllers,  " + this.numOfGames + " games included " +
				"and a " + this.sub + " Monthly subscription.");
		
		if(this.addItemName !=null) {
			bundlePrice+=this.addItemPrice;
			System.out.println("Item: " + this.addItemName + " has been added for a price of: " + this.addItemPrice);
			
		}
		
		if(this.addItemName2 !=null) {
			
			bundlePrice+=this.addItemPrice2;
			System.out.println("Item: " + this.addItemName2 + " has been added for a price of: " + this.addItemPrice2);
	
		}
		
		if(this.sub == 1) {
			
			bundlePrice+= 9.99;
		}
		else if(this.sub == 3) {
			bundlePrice+=19.99;
		
		}
		else if(this.sub == 6) {
			
			bundlePrice+=29.99;
		
		}
		else if(this.sub == 12) {
			
			bundlePrice+=39.99;
	
		}
		
		return bundlePrice;
		
	}
	

}
