package chain;

public class FirstChain extends  AbstractChain {
    private int score = 70;

    @Override
    public int handRequest() {
        System.out.println("进入 FirstChain");
        if(score>=70){
            if(null != this.abstractChain){
                return  this.abstractChain.handRequest();
            }
        }else{
            System.out.println("未满足FirstChain条件， 不能进入下一步");
        }

        return score;
    }
}
