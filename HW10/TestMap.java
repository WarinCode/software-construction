package HW10;
import java.util.Map;
import java.util.HashMap;

public class TestMap {
    public static void main(String []args){
        Map<String, String> countryCode = new HashMap<String, String>();
        countryCode.put("AU", "AUSTRALIA");
        countryCode.put("AW", "ARUBA");
        countryCode.put("BE", "BELGIUM");
        countryCode.put("CG", "CONGO");

        System.out.println(countryCode);
        System.out.println(countryCode.get("AU"));
        System.out.println(countryCode.get("BE"));
    }
}
