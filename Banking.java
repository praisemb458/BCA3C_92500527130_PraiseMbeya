class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.2;
    }
}

public class Banking {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();

        System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + b2.getRateOfInterest() + "%");
    }
}