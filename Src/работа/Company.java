package work;
public class Company {
  private String name;
    private Employee[] employees;

    private int companyBudget;
    private String managersName;


    public Company(String name, Employee[] employees, int holdingBudget, String managersName) {
        this.name = name;
        this.employees = employees;
        this.companyBudget = holdingBudget;
        this.managersName = managersName;
    }

    public Company() {
    }

    public int getCompanyBudget() {
        return companyBudget;
    }

    public void setCompanyBudget(int holdingBudget) {
        this.companyBudget = holdingBudget;
    }

    public String getManagersName() {
        return managersName;
    }

    public void setManagersName(String managersName) {
        this.managersName = managersName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployeesToCompany(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }

    public void deleteEmployees(String employee) {
        for (int i = 0; i < employees.length; i++) {
            if (this.employees[i] != null && this.employees[i].getName().equals(employee)) {
                System.out.println(this.employees[i].getName() + " больше не с нами");
                this.employees[i] = null;
            }
        }
    }

    public void changeManager(Employee newManger) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null && employees[i].getName().equals(name))) {
                employees[i] = newManger;
            }
        }
    }

    public void Searh(Employee company) {
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if (company.getName().equals(managersName)) {
                System.out.println(company.getName() + company.getSalary());
            }
        }
    }


    public Employee getEmployeeByName(String name) {
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getName().equals(name)) {
                System.out.println("Есть такая компания :" + employees[i].toString());
                return employees[i];
            }
        }
        return null;
    }


    public void listEmployees() {
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                System.out.println(employees[i].getName() + " | " + employees[i].getSalary() + " | " + employees[i].getPosition());
            }
    }

    public void salary() {
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                int count = 0;
                count = employees[i].getSalary();
            }
    }


    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", holdingBudget=" + companyBudget +
                ", managersName='" + managersName + '\'' +
                '}';
    }  
}
