package utilities;

public class Employees {
    private Integer id;
    private String name;
    private Double salary;
    
    //constructor
    public Employees(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    //getters and setters
    public Integer getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public Double getSalary(){
        return salary;
    }
    
    //methods
    public void RaiseSalary(double percentage){
        salary += salary*(percentage/100.00);
    }
}
