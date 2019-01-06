import java.util.ArrayList;
import java.util.List;

public class HelloWorld01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list = processList(list);
        boolean flag = list.contains("唐三彩");
        System.out.println(list.size());
        System.out.println(list);
    }

    private static List<String> processList(List<String> list){
        list.add("你好世界");
        list.add("美丽中国");
        list.add("孙悟空");
        list.add("沙和尚");
        list.add("猪肝粉质");
        return list;
    }

}
