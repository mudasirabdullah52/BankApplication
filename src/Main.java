package src;

public class Main {
    public static void main(String[] args) {

        Jkbank b1 = new Jkbank("Mudasir", 20064,1000);
        Jkbank b2 = new Jkbank("Sachin", 20065,2000);
        b1.accInformation(20064);
        b2.accInformation(20065);
        b1.credit(500,20064, 20065);
        b1.accInformation(20064);
        b2.accInformation(20065);
//        b1.credit(500,);
    }
}
