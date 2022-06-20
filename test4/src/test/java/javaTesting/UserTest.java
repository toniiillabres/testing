package javaTesting;

import DomainEntities.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    public UserTest() {
    }

    @Test
    public void constructUserTest() {
        User usuari = new User("Tomeu", "secret");
        Assert.assertTrue(usuari != null);
        Assert.assertEquals(usuari.getName(), "Tomeu");
        Assert.assertTrue(usuari.verifyPassword("secret"));
    }
}
