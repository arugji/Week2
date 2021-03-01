package model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Student;


public class TestStudentStatus {
	
	StudentGrade studGRD = new StudentGrade();
	Student student = new Student ("Alma",0,0);;
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testCalculateStudentExcellence() {
		student.setTotalPoints(489);
		double grade = studGRD.calculateStudentExcellence(student);
		assertEquals(300, grade, 0.0);
		}
	
	@Test
	public void testCalculateStudentGrade() {
		
		student.setTotalPoints(8000);
		double points = studGRD.calculateStudentPoints(student);
		assertEquals(96000, points, 0.0);}
	
	
	@Test
	
	public void testStudentIsTeenager() {
		student.setAge(20);
		assertTrue(studGRD.StudentIsTeenager(student));
		}
	
	@Test
	public void testStudentIsNotTeenager() {
		student.setAge(36);
		assertFalse(studGRD.StudentIsTeenager(student));}
	


}

	


