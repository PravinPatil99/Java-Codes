package dec_23_functional_interfaceQuestion2;

public class ClassRoom 
{
	private int chairs;

	public int getChairs() {
		return chairs;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}

	@Override
	public String toString() {
		return "ClassRoom [chairs=" + chairs + "]";
	}
	/*
	
	public static adjustChair(ClassRoom)
	{
		 return unaryOperator<ClassRoom>
	}
}*/
}
