public abstract class CashDipenser{

    public CashDipenser next;

    public void setNext(CashDipenser next){
        this.next=next;
    }

    public abstract void dispense(int amt);
}