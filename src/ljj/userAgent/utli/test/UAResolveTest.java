package ljj.userAgent.utli.test;

import ljj.userAgent.utli.enu.Browser;
import ljj.userAgent.utli.enu.OperatingSystem;
import ljj.userAgent.utli.java.UserAgent;

/**
 * Created by lijunjie on 2015/10/26.
 */
public class UAResolveTest {

    public static void main(String[] args) {

        String ua = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.85 Safari/537.36";
        UserAgent userAgent = UserAgent.parseUserAgentString(ua);
        Browser browser = userAgent.getBrowser();
        System.out.println("==================Browser=====================");
        System.out.println("browserName=====>"+browser.getName());
        System.out.println("browserType=====>"+browser.getBrowserType());
        System.out.println("Manufacturer====>"+browser.getManufacturer());
        System.out.println("RenderingEngine======>"+browser.getRenderingEngine());
        System.out.println("Group=====>"+browser.getGroup());


        OperatingSystem os = userAgent.getOperatingSystem();
        System.out.println("==================OperatingSystem====================");
        System.out.println("osName==========>"+os.getName());
        System.out.println("os Group=======>"+os.getGroup().getDeviceType().getName());
        System.out.println("os is mobile=====>"+os.isMobileDevice());
        System.out.println("Manufacturer======>"+os.getManufacturer());
        System.out.println("DeviceType==========>"+os.getDeviceType());
    }
}
