package cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CycleMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Louzai1 louzai1 = applicationContext.getBean(Louzai1.class);
        louzai1.test1();
    }
}
