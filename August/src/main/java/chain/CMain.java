package chain;

public class CMain {
    public static void main(String[] args) {
        FirstChain firstChain = new FirstChain();
        SecondChain secondChain = new SecondChain();
        ThirdChain thirdChain = new ThirdChain();
        firstChain.setNext(secondChain);
        secondChain.setNext(thirdChain);
        System.out.println(firstChain.handRequest());
    }
}
