
public class TextBasedVendingMachine implements VendingMachineInterface{
	private int selectedproduct;
	private CoinBundle change;
	private int Total;

	@Override
	public void displayProducts() {
		 System.out.println(" *********************************************");
	        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
	        System.out.println(" *********************************************");
	        System.out.println("            Products available:               ");
	        System.out.println("                                              ");
	        for(Product product: Product.values()){
	            
	                System.out.println("     " + product.name() +"    "+product.getID()+"  - Price: " + product.getPrice() + "   ");
	           
	        }
	        System.out.println("                                              ");
	        System.out.println(" Please select your product by entering number 1: for coke,2 for pepsi,3 for soda: ");

		
	}

	@Override
	public void selectProduct(int product) {
		this.selectedproduct=product;
		
	}

	@Override
	public void displayEnterCoinsMessage() {
		 System.out.println(" Please enter coins as follows: ");
	        System.out.println(" num of 1 cents coins,num of 5 cents coins,num of 10 cents coins,num of 25 cents coins ");
	        System.out.println("                                              ");
	        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,0,2,0");
	        System.out.println("Plese enter coins:");
		
	}

	@Override
	public int enterCoins(int[] coins) {
		Calculator calc= new SimpleCalculator();
		Product product=Product.valueof(selectedproduct);
		Total=calc.calculateTotal(new CoinBundle(coins));
		
		
		return Total;
		
	}

	@Override
	public void displayChangeMessage() {
		System.out.println("                                              ");
        System.out.println("Your change is :  "+ change.getTotal()+" cents splitted as follows: ");
        System.out.println("                                              ");
       
        System.out.println("    25 cents coins: "+ change.number25CentsCoins);
        System.out.println("    10 cents coins: "+ change.number10CentsCoins);
        System.out.println("    5 cents coins: "+ change.number5CentsCoins);
        System.out.println("    1 cents coins: "+ change.number1CentsCoins);

    }

	@Override
	public boolean SuffiecientAmount(String selectedProduct) {
		Product product=Product.valueof(selectedproduct);
		Calculator calc= new SimpleCalculator();
		
		
		
		 if(Total>=product.getPrice())
			{
			int changeAmount= Total-product.getPrice();
			this.change=calc.calculateChange(changeAmount);
			
			return true;
			}
			else{
				
				System.out.println("Insufficient money");
				
				return false;
				
			}
		
		
	}

	@Override
	public void refund(int action) {
		
		if(action==2){
			System.out.println("Refund     "+Total);
			System.exit(Total);
			
			}
		else
			System.out.println("proceeding");
		
		
        
		
		
	}
		
	}


