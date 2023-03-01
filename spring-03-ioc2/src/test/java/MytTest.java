import com.mei.demo01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mql
 * @date 2023年02月22日 19:17
 */
public class MytTest {
    @Test
    public void testUser(){
//        User user = new User();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = (User)context.getBean("user");

        user.show();
    }
}
