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
        //編集した（実際は何もしていない）リストを返却
        return new ArrayList<>(recordList);
    }
}