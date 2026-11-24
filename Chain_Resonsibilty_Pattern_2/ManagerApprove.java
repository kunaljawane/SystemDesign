public class ManagerApprove extends Approver{
    @Override
    public void doApprove(int days){
        if(days<=5){
            System.out.println("Apporved by Manager");
        }else{
            next.doApprove(days);
        }
    }
}