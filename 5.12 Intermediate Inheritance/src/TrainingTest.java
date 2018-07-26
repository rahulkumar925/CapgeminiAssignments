/*Test class for Training*/
public class TrainingTest {

	public static void main(String args[])
	{
		PublicTraining ptraining=new PublicTraining("007","Java Cloud",50,5000);
		CorporateTraining ctraining=new CorporateTraining("009",".net",50,4000);
		
		ptraining.getOrderValue();
		ptraining.display();
		ctraining.getOrderValue();
		ctraining.disp();
		
		
	}
}
