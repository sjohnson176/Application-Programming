package programmingEx1;

public class Exercise04_03 {

	public static void main(String[] args) {
		// city coordinates
		double xAtl = 33.7489954;
		double yAtl = -84.3879824;
		
		double xChar = 35.2270869;
		double yChar = -80.8431267;
		
		double xSav = 32.0835407;
		double ySav = -81.0998342;
		
		double xOrl = 28.5383355;
		double yOrl = -81.3792365;
		
		// get sides of triangle 1 and compute area
		double t1S1 = 6371.01 * Math.acos(Math.sin(Math.toRadians(xAtl)) 
				* Math.sin(Math.toRadians(xChar)) + Math.cos(Math.toRadians(xAtl)) 
				* Math.cos(Math.toRadians(xChar)) 
				* Math.cos(Math.toRadians(yAtl - yChar)));
		
		double t1S2 = 6371.01 * Math.acos(Math.sin(Math.toRadians(xChar)) 
				* Math.sin(Math.toRadians(xOrl)) + Math.cos(Math.toRadians(xChar))
				* Math.cos(Math.toRadians(xOrl)) 
				* Math.cos(Math.toRadians(yChar - yOrl)));
		
		double t1S3 = 6371.01 * Math.acos(Math.sin(Math.toRadians(xOrl)) 
				* Math.sin(Math.toRadians(xAtl)) + Math.cos(Math.toRadians(xOrl))
				* Math.cos(Math.toRadians(xAtl)) 
				* Math.cos(Math.toRadians(yOrl - yAtl)));
		double t1S = (t1S1 + t1S2 + t1S3) / 2;
		double t1Area = Math.sqrt(t1S * (t1S - t1S1) * (t1S - t1S2) * 
				(t1S - t1S3));
		
		// get sides of triangle 1 and compute area
		double t2S1 = 6371.01 * Math.acos(Math.sin(Math.toRadians(xChar)) 
				* Math.sin(Math.toRadians(xSav)) + Math.cos(Math.toRadians(xChar))
				* Math.cos(Math.toRadians(xSav)) 
				* Math.cos(Math.toRadians(yChar - ySav)));
		double t2S2 = 6371.01 * Math.acos(Math.sin(Math.toRadians(xSav))
				* Math.sin(Math.toRadians(xOrl)) + Math.cos(Math.toRadians(xSav))
				* Math.cos(Math.toRadians(xOrl)) 
				* Math.cos(Math.toRadians(ySav - yOrl)));
		double t2S3 = 6371.01 * Math.acos(Math.sin(Math.toRadians(xOrl)) 
				* Math.sin(Math.toRadians(xChar)) + Math.cos(Math.toRadians(xOrl))
				* Math.cos(Math.toRadians(xChar)) 
				* Math.cos(Math.toRadians(yOrl - yChar)));
		double t2S = (t2S1 + t2S2 + t2S3) / 2;
		double t2Area = Math.sqrt(t2S * (t2S - t2S1) * (t2S - t2S2) * 
				(t2S - t2S3));
		
		// compute total area
		double area = t1Area + t2Area;
		
		// display results
		System.out.println("The area enclosed by 4 cities is " + area + 
				" km^2");
	}

}