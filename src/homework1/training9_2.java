package homework1;

public class training9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	stock stock1 = new stock("SUNW","Sun MicroSystems Inc.");
    stock1.setPreviousClosingPrice(100);
    stock1.setCurrentPrice(90);
    System.out.println("Previous Closing Price: " +
      stock1.getPreviousClosingPrice());
    System.out.println("Current Price: " +
      stock1.getCurrentPrice());
    System.out.println("Price Change: " +
      stock1.getChangePercent() * 100 + "%");
  }
}

class stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
    public stock(){  
		
	}
    public stock(String newsymbol,String newname) {
	symbol=newsymbol;
	name=newname;
}
    public double getChangePercent() {
    	return (currentPrice - previousClosingPrice) /
    		      previousClosingPrice;
	
}
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
      }
      
      public double getCurrentPrice() {
        return currentPrice;
      }
      
      public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
      }
      
      public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
      }
    }


