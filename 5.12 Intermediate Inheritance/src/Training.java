/*Parent class for training details*/
abstract class Training {

	
	String ID;
	String subject;
	double fees;
	Training()
	{
		
	}
	
	Training(String ID,String subject,double fees)				//Constructor
	{
		this.ID=ID;
		this.subject=subject;
		this.fees=fees;
		
	}
	
	abstract void getOrderValue();
}
