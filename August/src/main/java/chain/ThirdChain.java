package chain;

public class ThirdChain extends  AbstractChain {
    private int score = 90;

    @Override
    public int handRequest() {
        System.out.println("进入 ThirdChain");
        if(score>=90){
            if(null != this.abstractChain){
                return  this.abstractChain.handRequest();
            }
        }else{
            System.out.println("未满足ThirdChain条件， 不能进入下一步");
        }

        return score;
    }
}
