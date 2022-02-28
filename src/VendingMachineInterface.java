public interface VendingMachineInterface {

    void displayProducts();

    void selectProduct(int i);

    void displayEnterCoinsMessage();

    int enterCoins(int[] coins);

    void displayChangeMessage();
    
   boolean SuffiecientAmount(String Product);
   
    void refund(int action);
}
