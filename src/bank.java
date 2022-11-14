package src;

public interface bank {

    public void accInformation(int accNumber);

    public void credit(int balence, int accNumber1, int accNumber2);

    public void debit(int accNumber, int balence);

    public void ratOfIntrest();

}
