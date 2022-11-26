package work;
public class EmployeeMenu {
  public static void main(Employee args) {

        Scanner in = new Scanner(System.in);
        Employee employeeToyota = new Employee("Alisa", 11000, "Tester");
        Employee employeeMercedes = new Employee("Dima", 21000, "Director");
        Employee employeeNissan = new Employee("Farid", 31000, "Gen. Director");
        while (true) {
            System.out.println("1) Вывод информации о сотруднике");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();
            if (command == 1) {//Реализуйте вывод информации о сотруднике} else if (command == 0) {break;
                System.out.println("Работник компании Toyota - " + employeeToyota.getName() + "  | " + employeeToyota.getSalary() + " | " + employeeToyota.getPosition());
                System.out.println("Работник компании Mercedes - " + employeeMercedes.getName() + "  | " + employeeMercedes.getSalary() + " | " + employeeMercedes.getPosition());
                System.out.println("Работник компании Nissan - " + employeeNissan.getName() + "  | " + employeeNissan.getSalary() + " | " + employeeNissan.getPosition());
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}
