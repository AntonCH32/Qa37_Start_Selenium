import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp()
    {
        wd = new ChromeDriver();
        wd.get("http://telranedu.web.app/login");
    }

    @Test
    public void cssLocators()
    {
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));

        WebElement el1= wd.findElement(By.tagName("div"));
        WebElement element1 = wd.findElement(By.cssSelector("div"));

        WebElement el2= wd.findElement(By.tagName("h1"));
        WebElement element2 = wd.findElement(By.cssSelector("h1"));

        WebElement el3= wd.findElement(By.tagName("a"));
        WebElement element3 = wd.findElement(By.cssSelector("a"));

        WebElement el4= wd.findElement(By.tagName("form"));
        WebElement element4 = wd.findElement(By.cssSelector("form"));

        WebElement el5= wd.findElement(By.tagName("input"));
        WebElement element5 = wd.findElement(By.cssSelector("input"));

        WebElement el6= wd.findElement(By.tagName("a"));
        WebElement element6 = wd.findElement(By.cssSelector("a"));

        WebElement el7= wd.findElement(By.tagName("body"));
        WebElement element7 = wd.findElement(By.cssSelector("body"));


        //by class
        WebElement el8 =wd.findElement(By.className("container"));
        WebElement element8 =wd.findElement(By.cssSelector(".container"));

        WebElement el9 =wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element9 =wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement el10 =wd.findElement(By.className("active"));
        WebElement element10 =wd.findElement(By.cssSelector(".active"));

        //by id
        WebElement el12 = wd.findElement(By.id("root"));
        WebElement element12 = wd.findElement(By.cssSelector("#root"));


        //by attribute
        WebElement meta = wd.findElement(By.cssSelector("[charset='utf-8']"));
        WebElement metaName = wd.findElement(By.cssSelector("[name='viewport']"));
        WebElement metaName1 = wd.findElement(By.cssSelector("[name='theme-color']"));
        WebElement metaName2 = wd.findElement(By.cssSelector("[name='description']"));
        WebElement metaNameContent = wd.findElement(By.cssSelector("[content='width=device-width,initial-scale=1']"));
        WebElement metaNameContent1 = wd.findElement(By.cssSelector("[content='#000000']"));
        WebElement metaNameContent2 = wd.findElement(By.cssSelector("[content='Web site created using create-react-app']"));
        WebElement ReactApp = wd.findElement(By.cssSelector("[href='/static/css/main.2e306ff7.chunk.css']"));
        WebElement ReactAppStyleType = wd.findElement(By.cssSelector("[css='1']"));
        WebElement div = wd.findElement(By.cssSelector("[id='root']"));
        WebElement div2 = wd.findElement(By.cssSelector("[class='container']"));
        WebElement div3 = wd.findElement(By.cssSelector("[class='navbar-component_nav__1X_4m']"));
        WebElement divClass = wd.findElement(By.cssSelector("[class='active']"));
        WebElement divClass1 = wd.findElement(By.cssSelector("[class='login_login__3EHKB']"));
        WebElement divClass2 = wd.findElement(By.cssSelector("[class='login_login__3EHKB']"));
        WebElement divClassForm = wd.findElement(By.cssSelector("[name='email']"));
        WebElement divClassForm1 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement divClassForm2 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement divClassForm3 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement divClassForm4 = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement divClassForm5 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement divClassForm6 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement Style = wd.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));

        WebElement element24 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement element25 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement element26 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement element27 = wd.findElement(By.cssSelector("[placeholder *='ma']"));


    }
}

