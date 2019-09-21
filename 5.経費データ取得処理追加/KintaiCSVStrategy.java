import java.util.ArrayList;
import java.util.List;

public class KintaiCSVStrategy implements CSVStrategy {

    //勤怠テーブルからデータを取得するSQLを取得
    @Override
    public String  getQuery(){
        return "SELECT * FROM kintai";
    }

    @Override
    //会社にいた時間から、休憩時間（１時間）を引く編集処理
    public List<List<String>> editRecord(List<List<String>> recordList){
        for (List<String> record : recordList) {
            int workTime = Integer.parseInt(record.get(2));
            workTime = workTime - 1;
            record.set(2, Integer.toString(workTime));
        }
        //編集したリストを返却
        return new ArrayList<>(recordList);
    }
}