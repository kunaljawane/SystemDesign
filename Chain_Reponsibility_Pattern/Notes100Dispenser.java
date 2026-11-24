public class Notes100Dispenser extends CashDipenser{

    @Override
    public void dispense(int amt){
        int notes=amt/100;
        int rem=amt%100;

        if(notes>0){
            System.out.println("100 Notes: "+notes);
        }
        if(rem>0 ){
            System.out.println("Cannot Dispense: "+rem);
        }
        
    }
}