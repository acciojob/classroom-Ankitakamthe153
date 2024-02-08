package com.driver;

public class Teacher {

    private String teachername;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }

	public Teacher(String name, int numberOfStudents, int age) {
		super();
		this.teachername = name;
		this.numberOfStudents = numberOfStudents;
		this.age = age;
	}

	public String getName() {
		return teachername;
	}

	public void setName(String name) {
		this.teachername = name;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + teachername + ", numberOfStudents=" + numberOfStudents + ", age=" + age + "]";
	}
	
	
}