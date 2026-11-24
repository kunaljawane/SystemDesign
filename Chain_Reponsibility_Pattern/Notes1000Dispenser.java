public class Notes1000Dispenser extends CashDipenser{

    @Override
    public void dispense(int amt){
        int notes = amt/1000;
        int rem = amt%1000;

        if(notes>0){
            System.out.println("Thousand Notes: "+notes);
        }

        if(rem>0 && next!=null){
            next.dispense(rem);
        }
    }

}