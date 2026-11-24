public class Main{
    public static void main(String[] args) {
        Approver TlApp = new TlApprove();
        Approver ManApp = new ManagerApprove();
        Approver DirAPpp = new DirectorApprove();

        int days = 13;

        TlApp.setNext(ManApp);
        ManApp.setNext(DirAPpp);

        System.err.println("Your Leave Approve Status");
        TlApp.doApprove(days);
    }
}