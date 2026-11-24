public class Notes500Dispenser extends CashDipenser{
    @Override
    public void dispense(int amt){
        int notes = amt/500;
        int rem=amt%500;

        if(notes>0){
            System.out.println("500 Notes: "+notes);
        }
        if(rem>0 && next!=null){
            next.dispense(rem);
        }
    }
}