public class TestThrow {
	static void checkVotingEligibility(int age, String studentName) {
		if (age < 18) {
		
		throw new Arithmetic Exception(studentName + " is not eligible to vote (Age must be 18+);
		}
		
	else {
		System.out.println(studentName + "is eligible to vote!");
		}
	}
	
	public static void main(String args[]) {
		try {
			System.out.println("Checking registration for Jackson...");
			checkVotingEligibility(16, "Jackson");
			}
		catch (ArithmeticException e) {
			System.out.println("Caught Explicit Exception: " + e.getMessage());
			}
		}
	}