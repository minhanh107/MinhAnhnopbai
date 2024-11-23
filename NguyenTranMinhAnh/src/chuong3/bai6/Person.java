package chuong3.bai6;
import java.util.Scanner;
public class Person {
       private String name;
       private int age;
       private char gender;
       Scanner sn= new Scanner(System.in);
       public Person() {
    	   
       }
       public Person(String name, int age, char gender) {
    	   this.name= name;
    	   this.age = age;
    	   this.gender= gender;
    }
       public void setName(String name) {
    	   this.name= name;
       }
       public String getName() {
    	   return name;
       }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
       
	public String toString() {
		return this.name+" "+this.age+" "+this.gender;
	}
	public void nhapThongtin() {
		System.out.println("nhập tên: ");
	    this.name = sn.nextLine();
		System.out.println("nhập tuổi: ");
		this.age= sn.nextInt();
		sn.nextLine();
		System.out.println("nhập giới tính: ");
		this.gender=sn.nextLine().charAt(0);
	}
	public void xuatThongtin() {
		System.out.println(this.toString());// in thông tin
	}
}
