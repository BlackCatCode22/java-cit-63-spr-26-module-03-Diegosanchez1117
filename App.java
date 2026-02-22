package mystudent;

public class App {

	public static void main(String[] args) {
		Student myStudent = new Student();
		myStudent.firstName = "Mario";
		myStudent.lastName = "Mario";
		myStudent.major = "HVAC";
		myStudent.gpa = 3.4;
		myStudent.age = 22;
		myStudent.onProbation = false;
		
		Student myStudent2 = new Student();
		myStudent2.firstName = "leon";
		myStudent2.lastName = "Kennedy";
		myStudent2.major = "Law Enforcement";
		myStudent2.gpa = 4.2;
		myStudent2.age = 21;
		myStudent2.onProbation = false;
		
		System.out.println(myStudent2.firstName);
		System.out.println(myStudent2.lastName);

	}

}
