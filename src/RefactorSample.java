
// Rename the class to Surface Calculator
// Create a new package and move this class to a new package
public class RefactorSample {

	public int field1; // Encapsulate this field.
	
	public double calculateConeSurface(double radius, double height) {
		// Create a constant for PI
		// Extract a method for calculating a circle area 
		double baseArea = 3.1416159 * radius * radius;
		double surface = 3.1416159 * radius * height;
		return  baseArea + surface;
	}
	
	// Change signature to make parameter order consistent
	// Change the name of the method to calculateCylinderSurface
	public double cylinderArea(double height, double radius) {
		double baseArea = 3.1416159 * radius * radius;
		double surface = 2 * 3.1416159 * radius * height;
		return  baseArea + surface;
	}
}
