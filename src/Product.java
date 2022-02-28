public enum Product {
   // TWIX(1,100), COKE(2,50), WATER(3,30), SANDWICH(4,150), EMPTY(0,0);
	Coke(1,25), Pepsi(2,35), Soda(3,45);

    private int ID;
    private int price;

    Product(int selectionNumber,int price){
       this.ID = selectionNumber;
        this.price = price;
    }

    
    public int getPrice(){
        return this.price;
    }
    public int getID(){
        return this.ID;
    }
    public static Product valueof(int  Productselected){
    	for(Product product: Product.values()){
    		if(Productselected==product.getID())
    			return product;
    	}
       		return null;
    	}
    }



