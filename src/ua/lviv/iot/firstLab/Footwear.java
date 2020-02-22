package ua.lviv.iot.firstLab;

public class Footwear {

	public static final String DEFAULT_DESCRIPTION = "very comfortable footwear";
	
	public static int NumberInTheGroup;

	private String makerName;

	private double priceInDollars;

	private int number;

	private String type;
	
	private static String color;

	protected String productionCountry;

	protected String description;

	public Footwear(String makerName, double priceInDollars, int number, String type, String productionCountry,
			String description) {
		this.makerName = makerName;
		this.priceInDollars = priceInDollars;
		this.number = number;
		this.type = type;
		this.productionCountry = productionCountry;
		this.description = description;
	}

	public Footwear(String makerName, double priceInDollars, int number, String type, String productionCountry) {
		this(makerName, priceInDollars, number, type, productionCountry, DEFAULT_DESCRIPTION);
	}

	public Footwear(String makerName, double priceInDollars, int number, String type) {
		this(makerName, priceInDollars, number, type, null);
	}

	public String getMakerName() {
		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public double getPriceInDollars() {
		return priceInDollars;
	}

	public void setPriceInDollars(double priceInDollars) {
		this.priceInDollars = priceInDollars;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String colour) {
		this.description = colour;
	}
	
	public static void setColor(String color) {
		Footwear.color = color;
	}

	@Override
	public String toString() {
		return "Footwear [makerName=" + makerName + ", priceInDollars=" + priceInDollars + ", number=" + number
				+ ", type=" + type + ", productionCountry=" + productionCountry + ", colour=" + description + " ***Static color*** " + Footwear.color + "]";
	}
	
	public static void printstaticNumberInTheGroup() {
		System.out.println(" One group contain " + NumberInTheGroup + " pairs ");

	}

	public void printNumberInTheGroup() {
		System.out.println(" One group contain" + NumberInTheGroup + " pairs ");

	}
	
	public void resetValues(double price, String name, String country ) {
		makerName = name;
		priceInDollars = price;
		productionCountry = country;
		
	}

}
