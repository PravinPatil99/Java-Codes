package inheritance_exam_Task;

class CalculationBase1
{
	protected int num1;
	protected int num2;
	
	public CalculationBase1(int num1,int num2)
	{
		super();
		this.num1=num1;
		this.num2=num2;
		}
	public void performCalculation()
	{
		System.out.println("aadition:"+num1+num2);
	}
/*
class AdvancedCalculation extends CalculationBase1
{
	protected double additionalNum;
	protected String 
}
	*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
