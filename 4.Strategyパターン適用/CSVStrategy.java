import java.util.List;

public interface CSVStrategy {

    //テーブルからデータを取得するSQLを取得
    String  getQuery();

    //編集処理
    List<List<String>> editRecord(List<List<String>> recordList);
}