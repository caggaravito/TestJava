package TestPackage;

public class TeacherReport {
	
	public static void main(String[] args) {
		 
		DataSet Student1 = new DataSet();
		DataSet Student2 = new DataSet();
		DataSet Student3 = new DataSet();
		DataSet Student4 = new DataSet();
		DataSet Student5 = new DataSet();
		DataSet Student6 = new DataSet();
		DataSet Student7 = new DataSet();
		DataSet Student8 = new DataSet();
		DataSet Student9 = new DataSet();
		DataSet Student10 = new DataSet();
		
		DataSet[] Students = {Student1,Student2, Student3, Student4, Student5, Student6, Student7,Student8, Student9, Student10};
		
		Students[0].name = "Toni";
		Students[0].score = 87;
		Students[1].name = "Bryan";
		Students[1].score = 90;
		Students[2].name = "Chris";
		Students[2].score = 80;
		Students[3].name = "Shelby";
		Students[3].score = 100;
		Students[4].name = "Alex";
		Students[4].score = 95;
		Students[5].name = "Tyler";
		Students[5].score = 70;
		Students[6].name = "Erin";
		Students[6].score = 65;
		Students[7].name = "Ben";
		Students[7].score = 100;
		Students[8].name = "Tiffany";
		Students[8].score = 72;
		Students[9].name = "Sarah";
		Students[9].score = 56;
		
		int l = Students.length;
		float sum =0f;
		int highest;
		String nameHigh="";
		int lowest;
		String nameLow;
				
		int aStudent = 0;  //Variable to count the number of students that got A
		int bStudent = 0;  //Variable to count the number of students that got B
		int cStudent = 0;  //Variable to count the number of students that got C
		int fStudent = 0;  //Variable to count the number of students that got F
		
		highest = Students[0].score;
		
		for (DataSet Student: Students) {
			sum +=Student.score;  //to calculate average of Scores
		
		 if (Student.score > highest) {
			 highest = Student.score;
			 nameHigh = Student.name;
			 
			 }
			
			
		//Loop to know how the grade of the students and how many per grade.	
			if(Student.score >= 90) {
				aStudent++;
			}
			if ((Student.score >= 80) && (Student.score <= 89)) {
				bStudent++;
			}
			
			if ((Student.score >= 70) && (Student.score <= 79)) {
				cStudent++;
			}
			
			if ((Student.score <= 69)) {
				fStudent++;
			}
		}
		
		System.out.println("The Average of the class is : "+sum/l); //average of scores
		System.out.println();
		System.out.println("Highest Score " +highest + " belongs to : "+nameHigh);
		System.out.println();
		System.out.println("Students with A Score: " +aStudent);
		System.out.println("Students with B Score: " +bStudent);
		System.out.println("Students with C Score: " +cStudent);
		System.out.println("Students that failed: " +fStudent);
	}
	
	
}
