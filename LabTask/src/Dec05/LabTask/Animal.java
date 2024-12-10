package Dec05.LabTask;

 class Animal
{
	protected String species;

	public Animal(String species) {
		super();
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	public void makeSound()
	{
		System.out.println("Generic  animal sound");
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}
	public void reproduce()
	{
		System.out.println("Generic reproduction method for all animals.");
	}
	
}
 
 class Mammal extends Animal
 {
	 protected boolean hasFur;

	public Mammal(String species, boolean hasFur) {
		super(species);
		this.hasFur = hasFur;
	}
	@Override
	public void makeSound()
	{
		System.out.println("Generic  animal sound");
	}
	@Override
	public String toString() {
		return "Mammal [hasFur=" + hasFur + "]";
	}
	@Override
	public void reproduce()
	{
		System.out.println("Mammals give birth to live young");
	}
	public void nurseYoung()
	{
		System.out.println("mammals nursing their young");
	}
	 
 }
 class Bird extends Animal
 {
	 protected boolean canFly;

	/**
	 * @param species
	 * @param canFly
	 */
	public Bird(String species, boolean canFly) {
		super(species);
		this.canFly = canFly;
	}
	@Override
	public void makeSound()
	{
		System.out.println("Generic  animal sound");
	}
	@Override
	public String toString() {
		return "Bird [canFly=" + canFly + "]";
	}
	@Override
	public void reproduce()
	{
		System.out.println("Birds lay eggs as a means of reproduction");
	}
	public void buildNest()
	{
		System.out.println("birds building nests for their eggs.");
	}
	
	 
 }
