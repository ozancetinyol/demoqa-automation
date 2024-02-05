import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastnama_Email extends BaseTest {


    @Test
    public void setName() {
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.setName("Ozan");
        Assertions.assertEquals("Ozan", practiseFormPage.getName(), "Name value is not correct!");
    }

    @Test
    public void setLastName() {
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.setLastName("ÇETİNYOL");
        Assertions.assertEquals("ÇETİNYOL", practiseFormPage.getLastName(), "Last name value is not correct!");
    }

    @Test
    public void setEmail() {
        PractiseFormPage practiseFormPage = new PractiseFormPage(driver);
        practiseFormPage.setEmail("test@gmail.com");
        Assertions.assertEquals("test@gmail.com", practiseFormPage.getEmail(), "Email value is not correct");
    }

}
