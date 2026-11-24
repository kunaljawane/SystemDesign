public abstract class Approver{

    public Approver next;

    public void setNext(Approver next){
        this.next=next;
    }

    public abstract void doApprove(int days);

    
}