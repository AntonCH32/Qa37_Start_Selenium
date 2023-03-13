import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp()
    {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators()
    {
        // by tag name
        WebElement el= wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));
        WebElement XPElement = wd.findElement(By.xpath("//button"));

        WebElement el1= wd.findElement(By.tagName("div"));
        WebElement element1 = wd.findElement(By.cssSelector("div"));
        WebElement XPElement1 = wd.findElement(By.xpath("//div"));

        WebElement el2= wd.findElement(By.tagName("h1"));
        WebElement element2 = wd.findElement(By.cssSelector("h1"));
        WebElement XPElement2 = wd.findElement(By.xpath("//h1"));

        WebElement el3= wd.findElement(By.tagName("a"));
        WebElement element3 = wd.findElement(By.cssSelector("a"));
        WebElement XPElement3 = wd.findElement(By.xpath("//a"));

        WebElement el4= wd.findElement(By.tagName("form"));
        WebElement element4 = wd.findElement(By.cssSelector("form"));
        WebElement XPElement4 = wd.findElement(By.xpath("//form"));

        WebElement el5= wd.findElement(By.tagName("input"));
        WebElement element5 = wd.findElement(By.cssSelector("input"));
        WebElement XPElement5 = wd.findElement(By.xpath("//input"));

        WebElement el6= wd.findElement(By.tagName("a"));
        WebElement element6 = wd.findElement(By.cssSelector("a"));
        WebElement XPElement6 = wd.findElement(By.xpath("//a"));

        WebElement el7= wd.findElement(By.tagName("body"));
        WebElement element7 = wd.findElement(By.cssSelector("body"));
        WebElement XPElement7 = wd.findElement(By.xpath("//body"));


        //by class
        WebElement el8 =wd.findElement(By.className("container"));
        WebElement element8 =wd.findElement(By.cssSelector(".container"));
        WebElement XPElement8 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el9 =wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element9 =wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement XPElement9 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el10 =wd.findElement(By.className("active"));
        WebElement element10 =wd.findElement(By.cssSelector(".active"));
        WebElement XPElement10 = wd.findElement(By.xpath("//*[@class='active']"));

        //by id
        WebElement el11 = wd.findElement(By.id("root"));
        WebElement element11 = wd.findElement(By.cssSelector("#root"));

        //*[@attribute=’value’]

        //by attribute
        WebElement meta = wd.findElement(By.cssSelector("[charset='utf-8']"));
        WebElement XPElement12 = wd.findElement(By.xpath("//*[@charset='utf-8']"));
        WebElement metaName = wd.findElement(By.cssSelector("[name='viewport']"));
        WebElement XPElement13 = wd.findElement(By.xpath("//*[@name='viewport']"));
        WebElement metaName1 = wd.findElement(By.cssSelector("[name='theme-color']"));
        WebElement XPElement14 = wd.findElement(By.xpath("//*[@name='theme-color']"));
        WebElement metaName2 = wd.findElement(By.cssSelector("[name='description']"));
        WebElement XPElement15 = wd.findElement(By.xpath("//*[@name='description']"));
        WebElement metaNameContent = wd.findElement(By.cssSelector("[content='width=device-width,initial-scale=1']"));
        WebElement XPElement16 = wd.findElement(By.xpath("//*[@content='width=device-width,initial-scale=1']"));
        WebElement metaNameContent1 = wd.findElement(By.cssSelector("[content='#000000']"));
        WebElement XPElement17 = wd.findElement(By.xpath("//*[@content='#000000']"));
        WebElement metaNameContent2 = wd.findElement(By.cssSelector("[content='Web site created using create-react-app']"));
        WebElement XPElement18 = wd.findElement(By.xpath("//*[@content='Web site created using create-react-app']"));
        WebElement ReactApp = wd.findElement(By.cssSelector("[href='/static/css/main.2e306ff7.chunk.css']"));
        WebElement XPElement19 = wd.findElement(By.xpath("//*[@href='/static/css/main.2e306ff7.chunk.css']"));
        WebElement div = wd.findElement(By.cssSelector("[id='root']"));
        WebElement XPElement20 = wd.findElement(By.xpath("//*[@id='root']"));
        WebElement div2 = wd.findElement(By.cssSelector("[class='container']"));
        WebElement XPElement21 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement div3 = wd.findElement(By.cssSelector("[class='navbar-component_nav__1X_4m']"));
        WebElement XPElement22 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        WebElement divClass = wd.findElement(By.cssSelector("[class='active']"));
        WebElement XPElement23 = wd.findElement(By.xpath("//*[@class='active']"));
        WebElement divClass1 = wd.findElement(By.cssSelector("[class='login_login__3EHKB']"));
        WebElement XPElement24 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        WebElement divClassForm = wd.findElement(By.cssSelector("[name='email']"));
        WebElement XPElement25 = wd.findElement(By.xpath("//*[@name='email']"));
        WebElement divClassForm1 = wd.findElement(By.cssSelector("[name='password']"));
        WebElement XPElement26 = wd.findElement(By.xpath("//*[@name='password']"));
        WebElement divClassForm2 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement XPElement27 = wd.findElement(By.xpath("//*[@placeholder='Email']"));
        WebElement divClassForm3 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement XPElement28 = wd.findElement(By.xpath("//*[@placeholder='Password']"));
        WebElement divClassForm4 = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement XPElement29 = wd.findElement(By.xpath("//*[@type='submit']"));
        WebElement divClassForm5 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement XPElement30 = wd.findElement(By.xpath("//*[@name='login']"));
        WebElement divClassForm6 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement XPElement31 = wd.findElement(By.xpath("//*[@name='registration']"));
        WebElement Style = wd.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));
        WebElement XPElement32 = wd.findElement(By.xpath("//*[@style='border: 1px solid black; background-color: black; color: white;']"));

        WebElement element24 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el13 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        //start
        WebElement element25 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el14 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));

        WebElement element26 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        //WebElement el16 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'il')]"));
        //contains
        WebElement element27 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        // WebElement el15 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'ss')]"));


    }
}

