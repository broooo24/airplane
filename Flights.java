package Y;

public class Flights {
	public int price;
	public String from;
	public String to;

	public Flights(int pr, String fr, String t) {
		price = pr;
		from = fr;
		to = t;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int newPrice) {
		this.price = newPrice;
	}

	public String getfrom() {
		return from;
	}

	public void setPrice(String newFrom) {
		this.from = newFrom;
	}
	public String getto() {
		return to;
	}

	public void setto(String newTo) {
		this.to= newTo;
	}
}
