/*
 * calculates earth volume in km^3 and miles^3
 */
public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm / 1.609; // Convert km to miles
		
		// Volume calculation of earth in km and miles
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
