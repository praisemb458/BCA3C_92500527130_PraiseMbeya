public class TestMultipleCatch {
	public static void main(String args[]) {
	
		try {
			int[] jacksonScores = new int[3];
			jacksonScores[0] = 95;
			jacksonScores[1] = 90;
			jacksonScores[2] = 85;
			
			jacksonScores[5] = 100;
			}
		
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Error Occurred");
			}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Error: Jackson accessed an invalid index!");
			}
			
		catch (Exception e) {
			System.out.println("General Exception Handler: " + e);
			}
		}
	}