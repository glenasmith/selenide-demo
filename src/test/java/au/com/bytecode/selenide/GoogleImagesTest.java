package au.com.bytecode.selenide;

import com.codeborne.selenide.Screenshots;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

/**
 * Testing out Google images.
 */
public class GoogleImagesTest {
    
    @Test
    public void commenceShockAndAwe() {
      
       open("http://images.google.com.au");
       $("#lst-ib").setValue("glen smith java");
       $("input[name=btnG]").click();
       $$(".rg_l").get(0).shouldBe(present, visible).click();
       $(By.partialLinkText("View image")).click();
       sleep(5000);
       
    }

}
