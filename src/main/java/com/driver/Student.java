package com.driver;

public class Student {

    private String studentname;
    private int age;
    private double averageScore;

    public Student(){

    }

	public Student(String name, int age, double averageScore) {
		super();
		this.studentname = name;
		this.age = age;
		this.averageScore = averageScore;
	}

	public String getName() {
		return studentname;
	}

	public void setName(String name) {
		this.studentname = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + studentname + ", age=" + age + ", averageScore=" + averageScore + "]";
	}
    
    
}
