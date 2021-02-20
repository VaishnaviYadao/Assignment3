package Assignment3;

 abstract class PrepaidCard {

	int CardNo=2020;
	double availableBalance =  20000,swipLimit=2000;
	
	public abstract boolean swipCard(int amount);
	public String toString() { 
        return "card no : " + CardNo + " Available Balance : " + availableBalance + "Swip Limit : " + swipLimit; 
    } 
	public void rechargeCard(int amount)
	{
		availableBalance = availableBalance + amount;
	}
}
   class TravelCard extends PrepaidCard implements Rewardable
   {
	double rewardPoint;
	public boolean swipCard(int amount)
	{
		System.out.println("Card no is : " + CardNo);
		System.out.println("Available balance is : " + availableBalance);
		System.out.println("Swipe limit is : " + swipLimit);
		System.out.println("After swaping :--");
		if(amount<swipLimit)
		{
			int amt = amount*60;
			availableBalance = availableBalance - amt;
			double Pcharge = amt *0.5;
			availableBalance = availableBalance - Pcharge;
			System.out.println("Available balance is : " + availableBalance);
		    ReturnRewardpoint(amt);
			return true;
		}
		else
		{
			System.out.println("Available balance is : " + availableBalance);
			return false;
		}	
	}
	public double ReturnRewardpoint(double amount)
	{
		double point = amount /100;
		rewardPoint =  point * 5;
		System.out.println("reward points : " + rewardPoint);
		return rewardPoint;
	}
   }
   interface Rewardable
   {
	   double ReturnRewardpoint(double amount);
	   
   }
public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TravelCard t1 = new TravelCard();  
		t1.swipCard(16);
	}
}
 