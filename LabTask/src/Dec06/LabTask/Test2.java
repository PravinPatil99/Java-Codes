package Dec06.LabTask;

class Mammal
{
void eat(Mammal m)
{
System.out.println("Mammal eats food");
}
}

class Cattle extends Mammal
{
void eat(Cattle c)
{
System.out.println("Cattle eats hay");
}
}

class Horse extends Cattle
{
void eat(Horse h)
{
System.out.println("Horse eats hay");
}
}
public class Test2
{
public static void main(String[] args)
{
Mammal h = new Horse();
h.eat(h);
Cattle c = new Horse();
c.eat(c);

 
}
}
	