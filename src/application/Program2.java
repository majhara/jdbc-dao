package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.print(dep);

		System.out.println("\n=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: Department insert ===");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("INSERTED! New id: " + newDep.getId());
		
		System.out.println("\n=== TEST 4: Department Update ===");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("UPDATED SUCCESSFULLY DONE!"); 
		
		System.out.println("\n=== TEST 4: Department deleteById ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("DELETE SUCCESSFULLY DONE!");
				
		sc.close();
	}

}
