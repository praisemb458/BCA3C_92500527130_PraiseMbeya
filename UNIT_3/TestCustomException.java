class InvalidStudentMarksException extends Exception {

	public InvalidStudentMarksException(String message) {
		super(message);
		}
	}
	
 public class TestCustomException {
	static void validateJacksonMarks(double marks) throws InvalidStudentMarksException {
		if (marks < 0.0 || marks > 100.0) {
			throw new InvalidStudentMarksException("Marks must be between 0 and 100! Input was:" + marks);
		}
		else {
			System.out.println("Jackson's Marks Validated Successfully: " + marks);
			}
		}
		
		pubic static void main(String[] args) {
			try {
				System.out.println("Submitting Exam Score for Jackson...");
				validateJacksonMarks(105.5);
			}
		catch (InvalidStudentMarksException e) {
			System.out.println("Custom Exception Caught: " + e.getMessage());
			}
		}
	}