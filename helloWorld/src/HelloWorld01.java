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
        list.add("主分支");
        return list;
    }

}
