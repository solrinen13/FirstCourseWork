public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee [10];

        Employee worker1 = new Employee("Вадим Дмитриевич Князев","4",50_000);
        Employee worker2 = new Employee("Степан Степанович Бойко","3",55_000);
        Employee worker3 = new Employee("Иван Абрамович Силин","1",110_000);
        Employee worker4 = new Employee("Дмитрий Артемонович Машевский","2",85_000);
        Employee worker5 = new Employee("Александр Иванович Тясто","5",70_000);
        employee [0] = worker1;
        employee [1] = worker2;
        employee [2] = worker3;
        employee [3] = worker4;
        employee [4] = worker5;


        ToolBox.allEmployeeList(employee); //a
        ToolBox.calcSumSalaryPerMonth(employee);//b
        ToolBox.findLowSalary(employee); //c
        ToolBox.findHighSalary(employee);//d
        ToolBox.findMaxID(employee);
        ToolBox.findMidlSalary(employee); //e
        ToolBox.allEmployeeFullName(employee); //f
    }
}