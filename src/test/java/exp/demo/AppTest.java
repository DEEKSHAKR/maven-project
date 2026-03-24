package exp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
     @Test
        public void testadd(){
                  App app=new App();
                int result=app.add(2,3);
                System.out.println("Addition result of 2+3="+result);
                assertEquals(5,result);
}
                  
}


    
