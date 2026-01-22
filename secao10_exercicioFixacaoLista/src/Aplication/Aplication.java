package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Employee;

public class Aplication {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		System.out.print("How many employees will be registered?: ");
		int employeeNumber = sc.nextInt();
		
		for (int i=0; i<employeeNumber; i++) {
			System.out.println(); // Quebra de Libga,
			System.out.printf("Employee #%d\n", i+1);
			System.out.print("ID -> ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name -> ");
			String name = sc.nextLine();
			System.out.print("Salary -> R$");
			Double salary = sc.nextDouble();
		
			Employee emp = new Employee(id, name, salary);
			
			employeeList.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase -> ");
		int selectedId = sc.nextInt();
		Integer pos = position(employeeList, selectedId);
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage -> ");
			double percent = sc.nextDouble();
			employeeList.get(pos).increseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee employee : employeeList) {
			System.out.println(employee);
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
