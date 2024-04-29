class Banks {
    public void Loan() {
        System.out.println("Local mom and pop banks have less reserves");
    }
}

class JPM extends Banks {
    @Override
    public void Loan() {
        System.out.println("At JPM we have internationally competetive rates for your loans");
    }
}

class CreditUnion extends Banks {
    @Override
    public void Loan() {
        System.out.println("At the credit union you are part owner and can get competetive rates for your loans");
    }
}


public class Main {
    public static void main(String[] args) {
        Banks localBank = new Banks();
        localBank.Loan(); // Output: Animal makes a sound

        JPM jpmBank = new JPM();
        jpmBank.Loan();

        CreditUnion FederalCredit = new CreditUnion();
        FederalCredit.Loan();
    }
}

