public class TlApprove extends Approver{

    @Override
    public void doApprove(int days){
        if(days<=2){
            System.out.println("Apporved by TL");
        }else{
            next.doApprove(days);
        }
    }
}