package work;
public class Holding {
  private Company[] companies;
    private int companyBudget;
    private String managersName;

    public Holding() {
        companies = new Company[10];
    }


    public Holding(int companyBudget, String managersName) {
        this.companyBudget = companyBudget;
        this.managersName = managersName;
    }


    public int getCompanyBudget() {
        return companyBudget;
    }

    public void setCompanyBudget(int companyBudget) {
        this.companyBudget = companyBudget;
    }

    public String getManagersName() {
        return managersName;
    }

    public void setManagersName(String managersName) {
        this.managersName = managersName;
    }

    public Holding(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }
        }
        return false;
    }

    public void showCompanies() {
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company.getName() + " | " + company.getCompanyBudget() + " | " + company.getManagersName());
            }
        }
        System.out.println();
    }

    public void Search(Holding holding) {
        Company[] companies = this.companies;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getName().equals(managersName)) {
                System.out.println(companies[i].getManagersName() + companies[i].getCompanyBudget());
            }
        }
    }

    public void deleteCompany(String nameCompany) {
        for (int i = 0; i < companies.length; i++) {
            if (this.companies[i] != null && this.companies[i].getName().equals(nameCompany)) {
                System.out.println(this.companies[i].getName() + " больше не с нами");
                this.companies[i] = null;
            }
        }
    }

    public void holdingBudget() {
        Company[] companies = this.companies;
        double count = 0;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                count = count + companies[i].getCompanyBudget();
            }
        }
        System.out.println(count);
    }

    public Company getCompanyByName(String name) {
        Company[] company = this.companies;
        for (int i = 0; i < company.length; i++) {
            if (company[i] != null && company[i].getName().equals(name)) {
                System.out.println("Есть такая компания: " + company[i].toString());
                return company[i];
            }
        }
        return null;
    }

    public void getEmployeeList(Employee[] employees) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count++;
            } else {
                count2++;
            }
        }
        System.out.println("Число рабочих мест : " + count);
        System.out.println("Число вакантных мест : " + count2);
    }

    @Override
    public String toString() {
        return "Holding{" +
                "companies=" + Arrays.toString(companies) +
                ", companyBudget=" + companyBudget +
                ", managersName='" + managersName + '\'' +
                '}';
    }
}
