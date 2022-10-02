package homework;

public class ClientDeposit extends Client {
    double amoutDep;

    public ClientDeposit(String name, double amoutDep) {
        super(name);
        this.amoutDep = amoutDep;
    }

    public String infoClient() {
        String name = getName();
        double resultDepYear = calcDepYear(amoutDep);
        double resultDepFive = calcDepFive(amoutDep);
        double resultDepTen = calcDepTen(amoutDep);
        return  "\nClient: " + name +
                "\nSum of deposit 1 year USD: " + resultDepYear +
                "\nSum of deposit 5 years USD: " + resultDepFive +
                "\nSum of deposit 10 years USD: " + resultDepTen;
    }

    public double calcDepYear(double amoutDep) {
        return amoutDep * 15 / 100 + amoutDep;
    }
    public double calcDepFive(double amoutDep) {
        return (amoutDep * 15 / 100) * 5 + amoutDep;
    }
    public double calcDepTen(double amoutDep) {
        return (amoutDep * 15 / 100) * 10 + amoutDep;
    }






}
