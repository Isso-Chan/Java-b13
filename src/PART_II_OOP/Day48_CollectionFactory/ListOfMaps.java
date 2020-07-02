package PART_II_OOP.Day48_CollectionFactory;

import java.util.*;

public class ListOfMaps {

	public static void main(String[] args) {
		
						
		Map<String,String> emp1Data=new HashMap<>();
		emp1Data.put("ID", "123");
		emp1Data.put("Name", "John");
		emp1Data.put("Title", "SDET");
		emp1Data.put("Salary", "100000");
		
		Map<String,String> emp2Data=new HashMap<>();
		emp2Data.put("ID", "124");
		emp2Data.put("Name", "Mike");
		emp2Data.put("Title", "Dev");
		emp2Data.put("Salary", "80000");
		
		List<Map<String,String>> employees=new ArrayList<>();
		employees.add(emp1Data);
		employees.add(emp2Data);
		
		
		Map<String,String> chief1=new HashMap<>();
		chief1.put("ID", "001");
		chief1.put("Name", "MyChef1");
		chief1.put("Title", "Chef-1");
		chief1.put("Salary", "110000");
		chief1.put("Branch", "Operations");
		
		Map<String,String> chief2=new HashMap<>();
		chief2.put("ID", "002");
		chief2.put("Name", "MyChef2");
		chief2.put("Title", "Chef-2");
		chief2.put("Salary", "120000");
		chief2.put("Branch", "Logistics");
		
		List<Map<String,String>> chiefs=new ArrayList<>();
		chiefs.add(chief1);
		chiefs.add(chief2);
		
		
		List<List<Map<String,String>>> personnel=new ArrayList<>();		
		personnel.add(chiefs);
		personnel.add(employees);
		
		
		
		System.out.println("employees.toString():"+employees.toString());
		System.out.println("Size: "+employees.size());
		System.out.println(employees.get(0));
		System.out.println((employees.get(1)).get("EmpName"));
		
		//print each employee title by using for each loop
		int totalSalary=0;
		for(Map<String,String> map : employees) {  // <String,String> yazmadan da çalışıyor
			System.out.println(map.get("EmpTitle"));
			totalSalary+=Integer.parseInt(map.get("Salary"));
		}
		
		System.out.println("Total Salary ="+ totalSalary);
		
		//print salaries more than 80000 from 2 DIFFERENT GROUPS of personnel
		for(List<Map<String,String>> per: personnel) {
			for(Map<String,String> each: per) {
				if(Integer.parseInt(each.get("Salary"))>80000) {
					System.out.print(each.get("Name")+" - ");
				}	
			}
		}
		System.out.println();
		System.out.println("Personnel.toString(): "+personnel.toString());
	}
}
