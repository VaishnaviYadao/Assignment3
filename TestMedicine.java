package Assignment3;

  class Medicine {
	 
	String date;
	int P;
	public void getDetails(int P,String date)
	{
		System.out.println("Price");
		System.out.println("Expiry Date");
	}
	public void displayLabel()
	{
		System.out.println("Company: Globex Pharma");
		System.out.println("Address:Banglore");
	}
}
class Tablet extends Medicine
{
	public void displayLabel()
	{
		System.out.println("store in a cool dry place");
	}
}
  class Syrup extends Medicine
  {
	  public void displayLabel()
	  {
		  System.out.println("Consuption as directed by the physician");
	  }
  }
   class Ointment extends Medicine
   {
	   public void displayLabel()
	   {
		   System.out.println("for external use only");
	   }
   }
   public class TestMedicine
   {
	   public static void main(String[] args)
	   {
		   Medicine m[]=new Medicine[5];
		   double i =Math.random()*4;
		   int j = (int) i;
		   System.out.println(j);
		   switch(j)
		   {
		   case 1:m[0]=new Medicine();
		   m[1]=new Tablet();
		   m[0].displayLabel();
		   m[1].displayLabel();
		   break;
		   
		   case 2: m[2] = new Medicine();
		   m[3] = new Syrup();
		   m[2].displayLabel();
		   m[3].displayLabel();
		   break;
		   
		   case 3:m[4] = new Medicine();
		   m[5] = new Ointment();
		   m[4].displayLabel();
		   m[5].displayLabel();
		   break;
		   default:System.out.println("Invalid Choice");
		   }
	   }
   }
		  
