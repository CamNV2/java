package hellojava;

import java.util.Scanner;

public class Student {
	int StudentId;
	String studentName ;
	String numberPhone;
	String address ;
	String Batch ;
	double mark1 ;
	double mark2 ;
	
	public Student(int StudentId , String studentName , String numberPhone, String address , String Batch , double mark1, double mark2) {
		this.StudentId = StudentId;
		this.studentName = studentName ;
		this.numberPhone = numberPhone;
		this.address = address;
		this.Batch = Batch ;
		this.mark1 = mark1  ;
		this.mark2 = mark2 ;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBatch() {
		return Batch;
	}

	public void setBatch(String batch) {
		Batch = batch;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	public void nhapThongtinsv()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter studentid : ");
		StudentId = scanner.nextInt();
		System.out.println("enter studentName : ");
		studentName = scanner.nextLine();
		System.out.println("enter numberPhone : ");
		numberPhone = scanner.nextLine();
		System.out.println("enter address : ");
		address = scanner.nextLine();
		System.out.println("enter Batch : ");
		Batch = scanner.nextLine();
		System.out.println("enter mark1 : ");
		mark1 = scanner.nextDouble();
		System.out.println("enter mark2 : ");
		mark2 = scanner.nextDouble();
		
				
	}
}
