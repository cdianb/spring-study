import com.mei.demo01.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mql
 * @date 2023年02月21日 21:47
 */
public class MyTest {
    @Test
    public void testHello(){
//        获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        对象都在spring中管理了，要使用直接去spring中取出就可以
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }

}
