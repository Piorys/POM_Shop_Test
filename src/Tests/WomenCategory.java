package Tests;

import Execute.Main;

import static junit.framework.TestCase.assertEquals;

public class WomenCategory {
    public static void checkTittle(){
        String pageTittle = Main.driver.getTitle();
        System.out.println("Asserting page tittle");
        System.out.println("Expected: Women - My Store, found: " + pageTittle);
        try{
            assertEquals("Women - My Store",pageTittle);
            System.out.println("Assertion succeded");
        } catch (Exception e) {
            System.out.println("Exception occured");
            System.out.println("Trace log is: " + e);
        }
    }
}