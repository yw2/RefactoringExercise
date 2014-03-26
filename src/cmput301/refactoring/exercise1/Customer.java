package cmput301.refactoring.exercise1;
import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	/**
	 * @uml.property  name="_name"
	 */
	private String _name;
	/**
	 * @uml.property  name="_rentals"
	 * @uml.associationEnd  multiplicity="(0 -1)" elementType="Rental"
	 */
	private Vector _rentals = new Vector();

	public Customer (String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while(rentals.hasMoreElements()) {
			Rental each = (Rental)rentals.nextElement();

			//determine amounts for each line
			double thisAmount = amountFor(each);

			//add frequent renter points
			if(each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1)
				frequentRenterPoints += 2;
			else
				frequentRenterPoints++;

			//show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" +
			String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}

		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) +
		" frequent renter points";
		return result;
	}

    private double amountFor(Rental aRental) {
        return getCharge(aRental);
    }

    public double getCharge(Rental aRental) {
        double result = 0;
        result = getPriceCodeObject(aRental.getMovie().getPriceCode())
				.getCharge(result, aRental);
        return result;
    }

	private PriceCode getPriceCodeObject(int _priceCode)
	{

		switch (_priceCode)
		{
			case Movie.REGULAR:
				return new Regular();
			case Movie.NEW_RELEASE:
				return new NewRelease();
			case Movie.CHILDRENS:
				return new Childrens();
		}
		return null;
	}
}
