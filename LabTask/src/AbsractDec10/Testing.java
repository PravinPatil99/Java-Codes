package AbsractDec10;
import java.util.*;

public class Testing 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Food menu:");
		System.out.println("Egg");
		System.out.println("Bread");
		System.out.println("Exit");
		
		System.out.println("Enter the choice:");
		 String choice=sc.nextLine();
		 
		 if(choice.equals("Egg")||choice.equals("EGG")||choice.equals("egg"))
		 {
          Egg e = new Egg(6.2, 5.1, 0);
           System.out.println("Egg is:"+e.type);
			 e.getMacroNutrients();
			 System.out.println("test Score :"+e.tatsyScore);
		 }
		 else if(choice.equals("BREAD")||choice.equals("Bread")||choice.equals("bread"))
		 {
			 Bread b=new Bread(4.0,1.1,13.8);
			 System.out.println("Bread type:"+b.type);
			 b.getMacroNutrients();
			System.out.println("Taste  Score :"+b.tastyScore2);
		 }
		 else if(choice.equals("EXit")||choice.equals("exit"))
		 {
			 System.exit(0);
		 }
		 else {
			 System.out.println("Invalid choice");
		 }
		sc.close();
	}

}

/*
Program 2:
----------
Nutrition in food can be broken down into proteins, fats, and carbohydrates. Implement the following classes about food and nutrition to complete this challenge:

1. abstract class Food with the following properties:

double proteins
double fats
double carbs
double tastyScore
void getMacroNutrients [Abstract Method]

2. class Egg which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 7
String type = "non-vegetarian"
void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")

3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")
 

Create an ELC class Testing
The first line contains an integer, n, the number of food items.

Every food item takes input in the next 4 lines where the first line is the name of the food and the next three lines are method calls (getType, getTaste, and getMacros) 

Input :-
1
Bread
getType
getMacros
getTaste
Output :-

Bread is vegetarian
A slice of bread has 4.0 gms of protein, 1.1 gms of fats and 13.8 gms of carbohydrates.
Taste: 8
*/