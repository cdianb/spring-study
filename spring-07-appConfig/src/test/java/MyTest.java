import com.mei.config.MyConfig;
import com.mei.demo01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author mql
 * @date 2023年02月26日 18:40
 */
public class MyTest {
    @Test
    public void test(){
        /**
         *如果完全使用配置类方式去做，就只能通过AnnotationConfig上下文来获取容器
         * 通过配置类的class对象加载
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
    
}
