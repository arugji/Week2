/**
 * @author ${user} - arugji
 * CIS175 - Spring 2021
 * ${date} 17 Feb 2021
 */

package model;

public class Student {
	
	//variables
	private String name;
	private double totalPoints;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, double totalPoints, int age) {
		super();
		this.name = name;
		this.totalPoints = totalPoints;
		this.age = age;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(double totalPoints) {
		this.totalPoints = totalPoints;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
