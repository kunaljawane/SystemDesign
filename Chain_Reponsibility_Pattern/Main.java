public class Main{
    public static void main(String[] args) {
        CashDipenser amt1000 = new Notes1000Dispenser();
        CashDipenser amt500 = new Notes500Dispenser();
        CashDipenser amt100 = new Notes100Dispenser();

        amt1000.setNext(amt500);
        amt500.setNext(amt100);

        int amt = 5600;

        System.out.println("Total Amount:"+amt);

        amt1000.dispense(amt);
    }
}