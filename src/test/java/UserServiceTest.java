import com.upgrad.hirewheels.entities.Users;
import com.upgrad.hirewheels.exceptions.UnauthorizedException;
import com.upgrad.hirewheels.exceptions.UserAlreadyExistsException;
import com.upgrad.hirewheels.exceptions.UserNotFoundException;
import com.upgrad.hirewheels.services.UsersServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    @Test
    public void testCreateUser(){
        Users users7 = new Users("Admin1","Admin1","admin@1234","upGradg@gmail.com","7276802587",1,12000);
        UsersServiceImpl usersService = (UsersServiceImpl)context.getBean("userService");
        try {
            Assert.assertNotNull(usersService.createUsers(users7));
        }
        catch (UserAlreadyExistsException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test(expected = UnauthorizedException.class)
    public void testUserAuthorized() throws UnauthorizedException, UserNotFoundException {
        UsersServiceImpl usersService = (UsersServiceImpl)context.getBean("userService");
        Users user= new Users();
        user.setPassword("xxxx");
        user.setEmailId("upGradg@gmail.com");
        usersService.getUsers(user);
    }
}
