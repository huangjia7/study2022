package chain;

public abstract class AbstractChain {
    protected AbstractChain abstractChain;

    protected void setNext(AbstractChain abstractChain){
        this.abstractChain = abstractChain;
    }

    public abstract int handRequest();
}
