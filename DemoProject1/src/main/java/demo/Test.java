package demo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans1.xml");

        BillCollector bc = context.getBean("billCollector", BillCollector.class);
        bc.collectPayment(1400.00);
    }
}

