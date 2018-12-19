/**
 * 
 * @author ganesa.vijayakumar
 * 
 * Simple pyramid pattern After 180 degree rotation
 
 		*
      * * 
    * * * 
  * * * * 
* * * * *
 
 *
 */

public class Try {

	public static void main(String[] args) {
		after180DegreeRotation(20);
	}

	public static void after180DegreeRotation(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j <= 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
