package Assignment3;
 class Address{

	String AddressLine,city;
public
	Address(String AL, String c)
	{
		this.AddressLine = AL;
		this.city = c;
	}
	void getAddressLine(String line)
	{
		this.AddressLine=line;
		
	}
	String setAddressLine()
	{
		return AddressLine;
	}
	void getCity(String city)
	{
		this.city=city;
	}
	String setCity()
	{
		return city;
	}
	void getAddressDetails()
	{
		System.out.print( AddressLine + ", " + city);
	}
	public void get(String line, String cit) {
		// TODO Auto-generated method stub
		this.AddressLine=line;
		this.city=cit;
	}		
}
class Customer {
private 
	String customerName;
	Address address;
	
public 
		void getCustomerName(String name) 
	{
		this.customerName = name;
	}
	String setCustomerName() 
	{
		return customerName;
	}
	void getAddress(Address ad) 
	{
		this.address = ad;
	}
	String setAddress() 
	{
		return (address.AddressLine)+ "," +(address.city);
	}
	

	Customer() 
	{  //Default constructor
	}
	Customer(String name, Address address, Address Oaddress) 
	{
		this.customerName = name;
		this.address = address;
	
	}
	void getCustomerDetails()
	{
		System.out.println("Customer : " + customerName);
		System.out.print("Residenstial Address : " + address.AddressLine + ","+ address.city);
		
	}
}
public class TestCustomer {

public static void main(String[] args) 
{
Address ad = new Address("1st Main HSR Layout","Banglore");
Customer c2 = new Customer("John",ad, ad);
Customer c1 = new Customer();
c2.getCustomerDetails();
c1.getCustomerName("shiva");
c1.getAddress(ad);
System.out.print("\n");
System.out.println("Customer Name : " + c1.setCustomerName());
System.out.println("Address : " + c1.setAddress());
}
}


