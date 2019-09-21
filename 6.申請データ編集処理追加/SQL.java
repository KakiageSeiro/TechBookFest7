import java.util.ArrayList;
import java.util.List;

public class SQL {

    //sqlを実行し（たフリ）、結果を（捏造して）返却する
    public List<List<String>> executeQuery(String sql){

        if(sql.equals("SELECT * FROM kintai")){

            //勤怠SQL実行結果の捏造
            List<String> record1 = new ArrayList<>();
            record1.add("1");           //ID
            record1.add("パピルス");     //社員名
            record1.add("8");           //会社にいた時間

            List<String> record2 = new ArrayList<>();
            record2.add("2");           //ID
            record2.add("アンダイン");   //社員名
            record2.add("12");          //会社にいた時間

            List<String> record3 = new ArrayList<>();
            record3.add("3");           //ID
            record3.add("サンズ");       //社員名
            record3.add("1");           //会社にいた時間


            List<List<String>> result = new ArrayList<>();
            result.add(record1);
            result.add(record2);
            result.add(record3);

            return result;
        } else if(sql.equals("SELECT * FROM sinsei")) {

            //申請SQL実行結果の捏造
            List<String> record1 = new ArrayList<>();
            record1.add("1");                           //ID
            record1.add("パピルス");                     //社員名
            record1.add("遅刻");                        //申請種別
            record1.add("パズルに熱中してしまったため");    //備考

            List<String> record2 = new ArrayList<>();
            record2.add("2");                   //ID
            record2.add("アンダイン");           //社員名
            record2.add("残業");                //申請種別
            record2.add("ニンゲン追跡のため");    //備考

            List<String> record3 = new ArrayList<>();
            record3.add("3");           //ID
            record3.add("サンズ");       //社員名
            record3.add("");            //申請種別
            record3.add("");            //備考

            List<List<String>> result = new ArrayList<>();
            result.add(record1);
            result.add(record2);
            result.add(record3);

            return result;
        }
        else if(sql.equals("SELECT * FROM keihi")){

            //経費SQL実行結果の捏造
            List<String> record1 = new ArrayList<>();
            record1.add("1");                           //ID
            record1.add("アンダイン");                   //社員名
            record1.add("書籍購入");                     //経費種別
            record1.add("3456");                        //値段
            record1.add("達人プログラマー");              //備考

            List<String> record2 = new ArrayList<>();
            record2.add("2");                           //ID
            record2.add("サンズ");                       //社員名
            record2.add("雑貨購入");                     //経費種別
            record2.add("12000");                       //値段
            record2.add("ちょうどいい形のランプ");         //備考

            List<List<String>> result = new ArrayList<>();
            result.add(record1);
            result.add(record2);

            return result;
        }

        return null;
    }
}