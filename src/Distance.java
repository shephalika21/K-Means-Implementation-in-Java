/*
 * Programmed by Shephalika Shekhar
 * class containing methods to calculate distance between two points with features 
 * based on distance metric
 */
public class Distance {

	public Distance() {
		// TODO Auto-generated constructor stub
	}
	
	public static double eucledianDistance(double[] point1, double[] point2) {
        double sum = 0.0;
        for(int i = 0; i < point1.length; i++) {
        	//System.out.println(point1[i]+" "+point2[i]);
            sum += ((point1[i] - point2[i]) * (point1[i] - point2[i]));
        }
        return Math.sqrt(sum);
    }
    
    public static double manhattanDistance(double point1[], double point2[]){
    	double sum = 0.0;
        for(int i = 0; i < point1.length; i++) {
            sum += (Math.abs(point1[i] - point2[i]));
        }
        return sum;
    }
    

}
