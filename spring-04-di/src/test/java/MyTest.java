import com.mei.demo01.Student;
import com.mei.demo01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mql
 * @date 2023年02月22日 20:29
 */
public class MyTest {
    @Test
    public void studentTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
        /**
         *Student{
         *  name='徐伟亮',
         *  address=Address{address='软件园二期'},
         *  book=[红楼梦, 西游记, 三国演义],
         *  hobbies=[吃饭, 睡觉, 打麻将],
         *  card={身份证=123456156767890098, 银行卡=4234214241312, 员工卡=9521},
         *  games=[王者荣耀, 欢乐斗地主],
         *  wife='null',
         *  info={学号=15023454, 姓名=徐伟亮, 年龄=26}
         *  }
         */
    }

    @Test
    public void namespaceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBean.xml");
        User user = (User)context.getBean("user2");
        User user2 = context.getBean("user2", User.class);
//        System.out.println(user.toString());
        System.out.println(user == user2);
    }
}
