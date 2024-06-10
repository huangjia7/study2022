package chain;

public class SecondChain extends  AbstractChain {
    private int score = 80;

    @Override
    public int handRequest() {
        System.out.println("进入 SecondChain");
        if(score>=80){
            if(null != this.abstractChain){
                return  this.abstractChain.handRequest();
            }
        }else{
            System.out.println("未满足SecondChain条件， 不能进入下一步");
        }

        return score;
    }
}
