package VarArgs;

class Simple {
    
    public void add(Object... x) 
    {
        for (Object y : x) 
        {
            System.out.println(y);
        }
    }
}

public class Demo1 
{
    public static void main(String[] args) {
        Simple s = new Simple();
        
        s.add(12, 12, 12, "nit");
    }
}
