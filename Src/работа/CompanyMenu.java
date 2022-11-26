package work;
public class CompanyMenu {
   private static Company company;

    public static void main(Company args) {
        Scanner in = new Scanner(System.in);
        Company Toyota = new Company();
        Company Mercedes = new Company();
        Company Nissan = new Company();
        while (true) {
            System.out.println("Выберите компанию с которой вы хотите работать: ");
            System.out.println("1 - Toyota");
            System.out.println("2 - Mercedes");
            System.out.println("3 - Nissan");
            System.out.println();
            int command = in.nextInt();
            if (command == 1) {
                ToyotaMenu.toyotaMenu();
            } else if (command == 2) {
                MercedesMenu.mercedesMenu();
            } else if (command == 3) {
                NissanMenu.nissanMenu();
            } else {
                break;
            }
        }
    }
}
