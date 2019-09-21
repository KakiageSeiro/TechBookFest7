import java.util.ArrayList;
import java.util.List;

public class KeihiCSVStrategy implements CSVStrategy {

    //経費テーブルからデータを取得するSQLを取得
    @Override
    public String  getQuery(){
        return "SELECT * FROM keihi";
    }

    @Override
    //編集処理
    public List<List<String>> editRecord(List<List<String>> recordList){
        //編集した（実際は何もしていない）リストを返却
        return new ArrayList<>(recordList);
    }
}