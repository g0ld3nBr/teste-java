package teste;

import java.util.Locale;
import java.util.Scanner;
import utilities.Employees;
import java.util.List;
import java.util.ArrayList;

public class Teste {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        //-----------------------------------------------------------------------------------
        System.out.print("How much employees do u want to register? :");
        int N = in.nextInt();
        Employees[] employees = new Employees[N];
        List<Integer> ids = new ArrayList<>();
        
        
        EmployeesRegister(employees, ids, N, in);
        ShowEmployees(employees, N);
        
        
        IncreaseSalary(employees, ids, in);
        ShowEmployees(employees, N);
        
        
        
        in.close();
    
        }
    
    public static void EmployeesRegister(Employees[] employees, List<Integer> IDS, int N, Scanner in){
        for (int i = 0; i!=N;i++){
            System.out.printf("Enter the ID of the employee number %d:\n", i+1);
            int ID = in.nextInt();
            in.nextLine();
            System.out.printf("Enter the name of the employee number %d:\n", i+1);
            String name = in.nextLine();
            System.out.printf("Enter the salary of the employee number %d:\n", i+1);
            double salary = in.nextDouble();
            employees[i] = new Employees(ID, name, salary);
            IDS.add(ID);
        }
    }
    
    public static void ShowEmployees(Employees[] employees, int N){
        for (int i=0;i!=N;i++){
            System.out.printf("Employee #%d\nID: %d\nName: %s\nSalary: $%.2f\n\n", i+1, employees[i].getId(), employees[i].getName(), employees[i].getSalary());
        }
    }
    
    public static void IncreaseSalary(Employees[] employees, List<Integer> ids, Scanner in){
        System.out.print("Enter the employee's id: ");
        int id = in.nextInt();
        if (ids.indexOf(id)==-1){System.out.printf("\n\n###############################\nError 404\nId not found.\n###############################\n\n");}
        else{
            System.out.println("How many percents do u want to increase? ");
            double percentage = in.nextDouble();
            employees[ids.indexOf(id)].RaiseSalary(percentage);
            System.out.println("Salary successfully increased!");
        }
        
    }
}
