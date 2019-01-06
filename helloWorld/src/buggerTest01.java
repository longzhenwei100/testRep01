import java.util.HashMap;
import java.util.Map;

public class buggerTest01 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("age","21");
        map.put("name","tom");
        map.put("street","hongshan");
        map.put("gender","male");
        map.put("country","CHINA");

        for (Map.Entry<String,Object> en: map.entrySet()){
            System.out.println(en.getKey()+":  " + en.getValue());
        }

        System.out.println(map.size());
        System.out.println(map.containsKey("name"));
    }
}
