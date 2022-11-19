package application;


import java.awt.FocusTraversalPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;




public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
	
		System.out.print("How many will be employee registered? ");
		int n = sc.nextInt();
	
		System.out.println();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #"+ (i +1) +":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increasy salary: ");
		int idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
			if (pos == null) {
				System.out.println("This id does not exist!");
			} 
			
			else {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				list.get(pos).increaseSalary(percent);
			}
		
			System.out.println();
			System.out.println("List of employees: ");
			
			for (Employee emp : list) {
				System.out.println(emp);
			}
		
		sc.close();
	}
	public static Integer position(List<Employee> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
				
		}
		return null;
	}

}
