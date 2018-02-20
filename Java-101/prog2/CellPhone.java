package prog2;

/**
 * The CellPhone class creates a cellphone
 * object based on three fields
 * manufaturer, model, and retailPrice
 * 
 * @author Charles Graven
 *
 */
public class CellPhone {

	private String manufact;
	private String model;
	private double retailPrice;
	
	/**
	 * Constructor for Cellphone
	 * Sets the below params for the Cellphone class
	 * 
	 * @param manufact
	 * @param model
	 * @param retailPrice
	 */
	public CellPhone(String manufact, String model, double retailPrice){
		this.setManufact(manufact);
		this.setModel(model);
		this.setRetailPrice(retailPrice);
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufact() {
		return manufact;
	}

	/**
	 * @param manufact, the manufacturer to set
	 */
	public void setManufact(String manufact) {
		this.manufact = manufact;
	}

	/**
	 * @return the model 
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model, the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the retailPrice
	 */
	public double getRetailPrice() {
		return retailPrice;
	}

	/**
	 * @param retailPrice, the retailPrice to set
	 */
	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
}
