package basic;

public class Genratebill {
	
public static void main(String[] args) {
	int chickenroll=4;
	int rateofchicken=60;
	int vegetablepuffs=3;
	int rateofpuffs=25;
	int discount =50;
	int finalbill;
 
	finalbill=(chickenroll*rateofchicken)+(vegetablepuffs*rateofpuffs)-discount;
	System.out.println("finalbill:"+finalbill);
	System.out.println("chicken roll bill:"+(chickenroll*rateofchicken));
	System.out.println("vegetable puffs bill:"+(vegetablepuffs*rateofpuffs));
}

  }


