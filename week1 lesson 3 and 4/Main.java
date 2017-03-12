package week1lesson3;

public class Main {

	public static void main(String[] args) {
		Customer[] customer = new Customer[3];
		customer[0] = new Customer("haben", "zaid", "123456");
		customer[1] = new Customer("Filmon", "Semere", "654321");
		customer[2] = new Customer("aman", "estifanos", "789102");
		Adress[] billingAdress = new Adress[3];
		billingAdress[0] = new Adress("1209 East st", "Seattle", "WA", "88124");
		billingAdress[1] = new Adress("6754 bort st", "Chicago", "IL", "8897");
		billingAdress[2] = new Adress("1302 weat st", "Seattle", "WA", "98724");
		Adress[] shippingAdress = new Adress[3];
		shippingAdress[0] = new Adress("879 west st", "Kirkland", "CA", "87654");
		shippingAdress[1] = new Adress("6754 bort st", "Filorida", "IL", "8897");
		shippingAdress[2] = new Adress("879 west st", "Fairfield", "ia","87687");
		customer[0].setBillingAdress(billingAdress[0]);
		customer[0].setShipingAdress(shippingAdress[0]);
		customer[1].setBillingAdress(billingAdress[1]);
        customer[1].setShipingAdress(shippingAdress[1]);
        customer[2].setBillingAdress(billingAdress[2]);
        customer[2].setShipingAdress(shippingAdress[2]);
        for(Customer cus:customer){
        	if(cus.getBillingAdress().getCity()=="Chicago")
        	System.out.println(cus);
        }
	}

}
