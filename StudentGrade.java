package model;

public class StudentGrade {

	public double calculateStudentPoints(Student student) {
		double studentPoints = 0;
		int numOfClasses=6;
		studentPoints = student.getTotalPoints() * numOfClasses;
		return studentPoints;
		
	}
	
	public double calculateStudentExcellence(Student student) {
		double excellence = 0;
		
		if(student.getTotalPoints() < 500) {
			excellence = 3;
			} else{
				excellence = 4;}
		return excellence;
		
	}
	
	public boolean StudentIsTeenager(Student student) {
		if(student.getAge() < 21) {
			return true;
		}else {
			return false;
		}
		
	}
}
