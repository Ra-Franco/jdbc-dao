package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findAll ===");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("=== TEST 2: Department findById ===");
		System.out.println(depDao.findById(2));
		
		System.out.println("=== TEST 3: Department Insert===");
		Department newDep = new Department(null, "Games");
		depDao.insert(newDep);
		System.out.println("Inserted new Department id: " + newDep.getId());
		
		
		System.out.println("=== TEST 4: Department deleteById===");
		System.out.println("Insira o id para deletar");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete Completed");
		
		System.out.println("=== TEST 5: Department Update===");
		Department dep = new Department(2,"Jorge");
		depDao.update(dep);
		System.out.println("Update Completed");
		
		
		sc.close();
	}
	
	

}
