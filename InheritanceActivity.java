package com.company;


class Employee{
	long employid;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowence;
	double Hra;
	Employee(long id,String name,String address,long phon){
		this.employid=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phon;
	}
	Employee(){
//		System.out.println("This is not a constractor");
	}
	void CalculateSalary(double bs, double spal,double hr) {
		this.basicSalary=bs;
		this.specialAllowence=spal;
		double Salary1=basicSalary+((basicSalary*(specialAllowence/100))+(basicSalary*(Hra/100)));
		System.out.println(Salary1);
	}
}
class Manager extends Employee {

	Manager(long id, String name, String address, long phon,double sal) {
//		super(id, name, address, phon);
		}
	}

class Trainee extends Employee{

	Trainee(long id, String name, String address, long phon,double sal) {
//		super(id, name, address, phon);
		}
	}
public class InheritanceActivity {
	public static void main(String[] args) {
		 Manager m1= new  Manager(126534,"peter", "Chennain India", 237844,65000);
		 Trainee T1= new Trainee(29846, "jack","Mumbai Indai",442085,45000 );
		 System.out.println("This is the salary of Manager");
		 m1.CalculateSalary(65000,250.80,1000.50);
		 System.out.println("this is the salary of Trainee");
		 T1.CalculateSalary(45000,250.80,1000.50);
		 

	}

}
