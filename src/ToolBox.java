public class ToolBox {

    public static void allEmployeeList(Employee[] employee) {
        for (Employee worker : employee) {
            if (worker != null) {
                System.out.println(worker);

            }
        }

    }

    public static int calcSumSalaryPerMonth(Employee[] employee) {
        int sumSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                sumSalary += employee[i].getSalary(employee);
            }
        }
        System.out.println("Сумма затрат на заработную плату сотрудников " + sumSalary + " рублей в месяц");
        return sumSalary;

    }

    public static int findLowSalary(Employee[] employee) {
        int minSalary = employee[0].getSalary(employee);
        String nameEmployee = employee[0].getFullNameEmployee(employee);
        for (int i = 0; i < employee.length; i++)
            if (employee[i] != null && minSalary > employee[i].getSalary(employee)) {
                minSalary = employee[i].getSalary(employee);
                nameEmployee = employee[i].getFullNameEmployee(employee);
            }
        System.out.println("Минимальная зарплата составляет " + minSalary + " рублей в месяц и ее имеет сотрудник " +nameEmployee);
        return minSalary;

    }

    public static int findHighSalary(Employee[] employee) {
        int minSalary = employee[0].getSalary(employee);
        String nameEmployee = employee[0].getFullNameEmployee(employee);
        for (int i = 0; i < employee.length; i++)
            if (employee[i] != null && minSalary < employee[i].getSalary(employee)) {
                minSalary = employee[i].getSalary(employee);
                nameEmployee = employee[i].getFullNameEmployee(employee);
            }
        System.out.println("Максимальная зарплата составляет " + minSalary + " рублей в месяц и ее имеет сотрудник "+nameEmployee);
        return minSalary;

    }
    public static int findMaxID(Employee[] employee) {
        int maxID = employee[0].getID(employee);
        for (int i = 0; i < employee.length; i++)
            if (employee[i] != null && maxID < employee[i].getSalary(employee)) {
                maxID = employee[i].getID(employee);
            }
        System.out.println("Максимальный ID "+maxID);
        return maxID;
    }
    public static int findMidlSalary(Employee[] employee) {
        int midSalary = calcSumSalaryPerMonth(employee)/findMaxID(employee);
        System.out.println("Средняя зарплата составляет " + midSalary + " рублей");
        return midSalary;
    }

    public static String allEmployeeFullName(Employee[] employee) {
        String nameEmployee = employee[0].getFullNameEmployee(employee);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null ) {
            nameEmployee = employee[i].getFullNameEmployee(employee);
                System.out.println("ФИО сотрудника " + nameEmployee);
            }
        }

       return nameEmployee;
    }

}
