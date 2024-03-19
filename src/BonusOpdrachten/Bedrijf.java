package BonusOpdrachten;



public class Bedrijf {
    private String companyName;
    private Manager manager = new Manager("John", 30);

    public Bedrijf(String companyName) {
        this.companyName = companyName;
    }

    public void getCompanyInfo() {
        System.out.println("Company name: " + companyName + "\nManager: " + manager.getManagerInfo() );
        ;
    }
}
