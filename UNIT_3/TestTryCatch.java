public class TestTryCatch {
	public static void main(String args[]) {
String studentName = "Jackson";
System.out.println(studentName + "started math calculation...");

try {
	int totalMarks = 100;
	int subjects = 0;
	int result = totalMarks / subjects;
	
	System.out.println("Result: " + result);
	} 
	
	catch (ArithmeticException e) {
		System.out.println("Exception Caught: Division by zero is not allowed for " + studentName + "!");
		System.out.println("System Error Detail: " + e.getMessage());
		}
		
		System.out.println(studentName + "'s program continues execution smoothly");
	}
}