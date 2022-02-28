
public enum Coin {
	
	penny(1), nickel(5), dime(10), quarter(25);
	private int value;
	
	private Coin(int value){
		this.value=value;
		
	}
	
	public int getcoin()
	{
		return this.value; 
	}
	 public static int[] parseCoins(String coins){
	        String[] numberCoinsInText = coins.split(",");
	        int[] result = new int[numberCoinsInText.length];
	        for(int index=0;index<numberCoinsInText.length;index++){
	            result[index] = Integer.parseInt(numberCoinsInText[index]);
	        }
	        return result;
	    }
	

}
