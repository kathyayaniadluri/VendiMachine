
import java.util.Scanner;

public class VendingMachine {

   // @SuppressWarnings("null")
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // TODO To complete in step3
        VendingMachineInterface machineInterface = new TextBasedVendingMachine();
       

        machineInterface.displayProducts();
        boolean flag=true;
        
       
        		String selectedProduct = scanner.nextLine();
        		machineInterface.selectProduct(Integer.parseInt(selectedProduct));
       
        		machineInterface.displayEnterCoinsMessage();
                      
        		String userEnteredCoins = scanner.nextLine();
        		
        		System.out.println("  Enter 1 for Proceed or 2 for cancel ");
        		System.out.println("                                              ");
        		String action = scanner.nextLine();
        		 

        		
        		
        		    
        			int[] enteredCoins = Coin.parseCoins(userEnteredCoins);
        			int TotalMoney=machineInterface.enterCoins(enteredCoins);
        			  machineInterface.refund(Integer.parseInt(action));
        			       				
        			
        			if(machineInterface.SuffiecientAmount(selectedProduct))
        			{
       
        				machineInterface.displayChangeMessage();
        			
        			}
        			else
        				System.exit(0);
        			
      
       
	   
       
       

    }
}
