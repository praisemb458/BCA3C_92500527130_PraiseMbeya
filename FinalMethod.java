class JacksonPolicy {
    final void verifyIdentity() {
        System.out.println("Student Jackson Identity verified via Biometrics ");
    }
}

class AdvancedStudent extends JacksonPolicy {

    void verifyIdentity(){
        System.out.println("Check");
    }   
}

public class FinalMethod {
    AdvancedStudent ad = new AdvancedStudent();

    ad.verifyIdentity();
}