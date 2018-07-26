/*Corporate Training details*/
public class CorporateTraining extends Training{

	
	int days;
	double getOrderValue;
	
	CorporateTraining()
	{
		
	}
	CorporateTraining(String ID,String subject,int days,double fees)				//Constructor
	{
		super(ID,subject,fees);
		this.days=days;
		
	}
	void getOrderValue()
	{
		getOrderValue=fees*days;
	}
	
	void disp()
	{
		System.out.println("The total amount for training is " +getOrderValue);
	}
}
