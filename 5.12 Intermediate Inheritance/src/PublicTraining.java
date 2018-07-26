/*Public Training class*/
public class PublicTraining extends Training{
	
	int participants;
	double getOrderValue;

	PublicTraining()
	{
		
	}
	
	PublicTraining(String ID,String subject,int participants,double fees)			//Constructor
	{
		super(ID,subject,fees);
		this.participants=participants;
		
	}
	
	@Override
	void getOrderValue()
	{
		getOrderValue=fees*participants;
	}
	
	void display()																	//display method
	{
		System.out.println("The total amount for training is " +getOrderValue);
	}

}
