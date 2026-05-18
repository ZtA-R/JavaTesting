package JavaTesting;

import DomainEntities.User;
import com.sun.source.tree.AssertTree;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void contructUserTest(){
        User usuari1 = new User("Tomeu","secret");

        assertTrue(usuari1 != null);

        assertEquals(usuari1.getName(),"Tomeu");
        //assertEquals(usuari1.getPassword(),"secret");

        assertTrue(usuari1.verifyPassword("secret") );
    }
}
