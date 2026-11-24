public class DirectorApprove extends Approver{
    @Override
    public void doApprove(int days){
        if(days<=12){
            System.out.println("Director Approved");
        }else{
            System.out.println("Director says Shadi he kya?");
        }
    }
}