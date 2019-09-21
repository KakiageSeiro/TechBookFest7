import java.util.ArrayList;
import java.util.List;

public class SQL {

    //sqlを実行し（たフリ）、結果を（捏造して）返却する
    public List<List<String>> executeQuery(String sql){

        //SQL実行結果の捏造
        List<String> record1 = new ArrayList<>();
        record1.add("1");           //ID
        record1.add("パピルス");     //社員名
        record1.add("8");          //会社にいた時間

        List<String> record2 = new ArrayList<>();
        record2.add("2");           //ID
        record2.add("アンダイン");   //社員名
        record2.add("12");         //会社にいた時間

        List<String> record3 = new ArrayList<>();
        record3.add("3");           //ID
        record3.add("サンズ");       //社員名
        record3.add("1");           //会社にいた時間

        List<List<String>> result = new ArrayList<>();
        result.add(record1);
        result.add(record2);
        result.add(record3);

        return result;
    }
}