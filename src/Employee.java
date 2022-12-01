import java.util.Objects;
public class Employee {
    private String fullNameEmployee;
    private String department;
    private static int count = 1;
    private int salary;
    private final int ID;

    public Employee( String fullNameEmployee, String department, int salary) {
        this.ID = count++;
        this.fullNameEmployee = fullNameEmployee;
        this.department = department;
        this.salary = salary;

    }
    //Геттеры
    public  String getFullNameEmployee(Employee[] employee){
        return fullNameEmployee;
    }
    public String getDepartment(){
        return department;
    }
    public int getSalary(Employee[] worker1){
        return salary;
    }
    public int getID(Employee[] employee){
        return ID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);

    }


    @Override
    public String toString() {
        return "Сотрудник " + fullNameEmployee + " из отдела " +department+ " имеет зарплату " + salary + " и ID "+ID;
    }

}
