package gradle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-config.xml"})
public class ContextTests {
	@SuppressWarnings("SpringJavaAutowiringInspection")
	@Autowired
	protected ApplicationContext ac;
	
	/*@Test
	public void testUserNotNull() {
	UserStory story = (UserStory) ac.getBean("userStory");
	assertNotNull(story.getUser());	
	}*/

	// Not using ApplicationContext
	// Regular non-Spring instantiation
	// Instantiating our own UserStory, you can see that the user
	// is null.
	@Test
	public void testUserStoryNotFromContext() {
	UserStory story = new UserStory();
	assertNull(story.getUser());
	}

	// Not using ApplicationContext
	// Regular non-Spring instantiation
	// The default role if you just call the constructor
	// is "User".
	@Test
	public void testNonSpringUserDefaultRole()
	{
	User u = new User();
	assertEquals(u.getRole(), "User");
	}

	// Using ApplicationContext
	// Since Spring instantiated this according to the property
	// from spring-config.xml, it overrode the default "user"
	// role with "SuperGenius User". (This presumably
	// is Wile E. Coyote.)
	/*@Test
	public void testUserRoleIsAsExpected() {
	UserStory story = (UserStory) ac.getBean("userStory");
	assertEquals(story.getUser().getRole(), "SuperGenius User");
	}*/
 
}
