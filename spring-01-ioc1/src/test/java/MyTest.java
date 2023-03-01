import com.mei.dao.UserDaoImpl;
import com.mei.dao.UserDaoMysqlImpl;
import com.mei.service.UserService;
import com.mei.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mql
 * @date 2023年02月14日 21:33
 */
public class MyTest {
    public static void main(String[] args){
        //用户实际调用是业务层，dao层他们不需要接触
//        UserService userService = new UserServiceImpl();
//        UserServiceImpl userService = new UserServiceImpl();
//        利用set进行动态实现值的注入
//        userService.setUserDao(new UserDaoImpl());
//        userService.getUser();


        
        //获取ApplicationContext：拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //拿到容器之后。需要什么就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}
