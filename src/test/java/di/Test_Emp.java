package di;

import com.mycompany.springbasic1109.di.bytype.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Emp {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = 
                new ClassPathXmlApplicationContext("beans-config.xml");
        // byType
        Emp emp = ctx.getBean("emp", Emp.class);
        System.out.println(emp);
        ctx.close();
    }
}