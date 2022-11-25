package githubactions_test;

//import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloJunitTest {	
    @Test
    public void testAppendComma(){
    	HelloJunit sample = new HelloJunit();
        String retValue = sample.appendComma("abc");
        assertEquals("abc,", retValue);
    }
}


//	@Test
//	public void Helloと言う() {
//		HelloJunit helloJunit = new HelloJunit();
//		assertThat(helloJunit.sayHello(), is("Hello"));
//	}
//}