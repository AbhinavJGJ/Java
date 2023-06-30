class Student_help {
	// Properties || Variable

	int roll_no;
	String name;
	String course;

	int marks1, marks2, marks3;

	// Method || Computation

	public int total() {
		return marks1 + marks2 + marks3;
	}

	public float average() {

		return (float) total() / 3;
	}

	public char grade() {
		if (average() >= 70) {
			return 'A';
		} else if (average() >= 50 && average() <= 69) {
			return 'B';
		} else {
			return 'C';
		}
	}

	public String details() {
		return "Roll No: " + roll_no + "\n" + "Name :" + name + "\n" + "Course: " + course;
	}
}

public class Student {

	public static void main(String[] args) {

		// Object Creation
		Student_help obj1 = new Student_help();
		obj1.roll_no = 200133010;
		obj1.name = "Ram";
		obj1.course = "B-tech";

		obj1.marks1 = 100;
		obj1.marks2 = 80;
		obj1.marks3 = 70;

		System.out.println("Total : " + obj1.total());
		System.out.println("Average : " + obj1.average());
		System.out.println("Grade : " + obj1.grade());
		System.out.println("Deatils : " + "\n" + obj1.details());

	}

}
