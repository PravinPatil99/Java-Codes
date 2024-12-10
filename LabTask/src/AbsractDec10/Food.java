package AbsractDec10;

abstract class Food 
{
	double protein;
	double fat;
	double carbs;
	double tastyScore;
	
	
	public Food(double protein, double fat, double carbs) {
		super();
		this.protein = protein;
		this.fat = fat;
		this.carbs = carbs;
	}


	abstract void getMacroNutrients();

}

 class Egg extends Food
{
	protected  int tatsyScore=7;
	 String type="non-vegetrain";

	public Egg(double protein, double fat, double carbs) {
		super(protein, fat, carbs);
	}


public void getMacroNutrients()
	{
		System.out.println("an eggs has :"+this.protein+"gms of protein");
		System.out.println(this.fat+"gms of fat and "+this.carbs+"gms of carbohydrates");
	 
	}
}
 
 class Bread extends Food
 {
	 int tastyScore2 = 8;
	 String type = "vegetarian";

	 
	public Bread(double protein, double fat, double carbs) {
		super(protein, fat, carbs);
	}

     @Override
	public void getMacroNutrients()
	{
		System.out.println(" A slice of bread has"+ this.protein+ "gms of protein," +this.fat+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		
	}
 }