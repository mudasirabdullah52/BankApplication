package src;

import java.util.HashMap;
public class Jkbank implements bank{

   static public HashMap<Integer,Pair> hs = new HashMap<>();
    public Jkbank(String name, int accNumber, int balence) {
        Pair data = new Pair(name, balence);
         hs.put(accNumber,data);
    }

    @Override
    public void accInformation(int accNumber) {
        if(hs.containsKey(accNumber)){
            Pair info = hs.get(accNumber);
            String name = info.name;
            int balence = info.balence;
            System.out.println(accNumber+" account is belongs to Mr."+name+" and this account balenc is "+ balence);
        }
        else {
            System.out.println("Invalid Account Number Please give the correct Accout Number");
        }
    }

    @Override
    public void credit(int balence, int accNumber1, int accNumber2) {
       if(hs.containsKey(accNumber1)  ){
           Pair info1 = hs.get(accNumber1);
           int bal1 = info1.balence + balence;
           String name1 = info1.name;
           Pair data1 = new Pair(name1, bal1);
           hs.put(accNumber1,data1);
           System.out.println("Dear "+data1.name+" your accout: " + accNumber1 + " has been crdits by amount" + balence+" and your available balence is  "+ bal1);
           debit(accNumber2,balence);
       }
        else {
           System.out.println("account no does not exits");
       }
    }

    @Override
    public void debit(int accNumber, int balence) {
        if(hs.containsKey(accNumber)){
            Pair info1 = hs.get(accNumber);
            int bal1 = info1.balence - balence;
            String name1 = info1.name;
            Pair data1 = new Pair(name1, bal1);
            hs.put(accNumber,data1);
            System.out.println("Dear "+data1.name+" your accout: " + accNumber + " has been debited by amount" + balence+" and your available balence is  "+ bal1);

        }
        else {
            System.out.println("this is not a Valid account no");
        }
    }

    @Override
    public void ratOfIntrest() {

    }
}
