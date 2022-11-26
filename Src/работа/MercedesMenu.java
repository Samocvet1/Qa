package work;
public class MercedesMenu {
    public static void mercedesMenu() {
        Scanner in = new Scanner(System.in);
        Holding holding = new Holding();
        Employee[] employees = new Employee[0];
        Company company = new Company("Mercedes", employees, 500000, "Elena");

        Company companyMercedes = new Company("Mercedes", employees, 500000, "Elena");
        Employee employeeMercedes = new Employee("Dima", 21000, "Director");

        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информацию о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("6) Поменять руководителя компании");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {
                System.out.println("---------------------------------");
                System.out.println(companyMercedes.getName() + " | " + companyMercedes.getManagersName() + " | " + companyMercedes.getCompanyBudget());
                System.out.println("---------------------------------");
            } else if (command == 2) {
                //Реализуйте вывод списка сотрудников этой компании
                System.out.println("---------------------------------");
                company.listEmployees();
                System.out.println("---------------------------------");
            } else if (command == 3) {
                //Реализуйте подсчет всех зароботных плат сотрудников
                System.out.println("---------------------------------");
                System.out.println(employeeMercedes.getSalary());
                System.out.println("---------------------------------");
            } else if (command == 4) {
                //Реализуйте добавление компании в холдинг
                System.out.println("---------------------------------");
                System.out.println("Работник добавлен!");
                company.addEmployeesToCompany(new Employee("Aman", 21000, "Manager"));
                System.out.println("---------------------------------");
            } else if (command == 5) {
                //Реализуйте удаление компании из холдинга
                System.out.println("---------------------------------");
                company.deleteEmployees(in.next());
                System.out.println("Работник удален!");
                System.out.println("---------------------------------");
            } else if (command == 6) {
                //Реализуйте смену руководителя компании
                System.out.println("Руководитель сменился! ");
                Employee emplyee1 = new Employee("Aman", 10000, "Manager");
                company.changeManager(emplyee1);
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
