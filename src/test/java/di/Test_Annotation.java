package di;

import com.mycompany.springbasic1109.di.annotation.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans-config-3.xml"}) 
// classpath 指的是 /resource/ 下面
public class Test_Annotation {
    
    @Autowired
    private Users users;
    
    @Test
    public void t1() {
        // 一般模式
        System.out.println(users);
    }
}
