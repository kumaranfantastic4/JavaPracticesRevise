package com.java.misc;

public class GenericWildCardsApp {

	public static void main(String[] args) {
		
		StudentUtil<CompareStudent> studentA
         = new StudentUtil<CompareStudent>(new CompareStudent("Kumaran K", 2));
		
		StudentUtil<CompareStudent> studentB
         = new StudentUtil<CompareStudent>(new CompareStudent("Raj Kumar L", 1));
		
		StudentUtil<CompareStudent> studentC
         = new StudentUtil<CompareStudent>(new CompareStudent("Karthikeyan B", 1));
		
		System.out.println("Is Student's rank same? Kumaran and Raj Kumar :: "+studentA.isRankEqual(studentB));
		System.out.println("Is Student's rank same? Kumaran and Karthikeyan :: "+studentA.isRankEqual(studentC));
		System.out.println("Is Student's rank same? Raj Kumar and Karthikeyan :: "+studentB.isRankEqual(studentC));
		
	}
	
	/**
	 * output
	 * 
	 *  Is Student's rank same? Kumaran and Raj Kumar :: false
	 *	Is Student's rank same? Kumaran and Karthikeyan :: false
	 *	Is Student's rank same? Raj Kumar and Karthikeyan :: true
	 *	
	 */

}

class StudentUtil<T extends Student>{
	private T student;
	
	public StudentUtil(T object){
	  student = object;
	}
	
	public int getRank(){
		return student.getRank();
	}
	
	public boolean isRankEqual(StudentUtil<?> otherStudent){
		return student.getRank() == otherStudent.getRank() ;
	}
}

class CompareStudent extends Student{

	public CompareStudent(String name, int rank) {
		super(name, rank);
	}
	
}

class Student{
	
	private String name;
	private int rank;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public Student(String name, int rank) {
		
		this.name = name;
		this.rank = rank;
	}
	
}


