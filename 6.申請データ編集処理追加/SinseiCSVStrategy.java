import java.util.ArrayList;
import java.util.List;

public class SinseiCSVStrategy implements CSVStrategy {

    //申請テーブルからデータを取得するSQLを取得
    @Override
    public String  getQuery(){
        return "SELECT * FROM sinsei";
    }

    @Override
    //編集処理
    public List<List<String>> editRecord(List<List<String>> recordList){
        //申請種別の末尾に"申請"という文字列を追加する
        for (List<String> record : recordList) {
            String type = record.get(2);
            if(!type.equals("")){
                record.set(2, type +  "申請");
            }
        }
        return new ArrayList<>(recordList);
    }
}