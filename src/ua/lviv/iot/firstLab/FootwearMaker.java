package ua.lviv.iot.firstLab;

public class FootwearMaker {

	public static void main(String[] args) {
		
		Footwear Nikefootwear = new Footwear("Nike", 120, 99, "Sniekers", "Israel");
		
		Footwear Adidasfootwear = new Footwear("Adidas", 110, 199, "Slippers", "China");
		
		Footwear.setColor("black");
		
		
		System.out.println(Nikefootwear);
		System.out.println("---------------------");
		System.out.println(Adidasfootwear);
		System.out.println("---------------------");
		
	}

}
 