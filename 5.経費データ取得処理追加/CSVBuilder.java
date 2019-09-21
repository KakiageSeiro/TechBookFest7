import java.util.List;

public class CSVBuilder {

    public void downloadCSV(CSVStrategy strategy) {

        //データを取得するSQL
        String query = strategy.getQuery();

        //SQLを実行結果を取得
        SQL sql = new SQL();
        List<List<String>> recordList = sql.executeQuery(query);

        //編集処理
        List<List<String>> editRecordList = strategy.editRecord(recordList);

        //CSVファイルを作成しダウンロードさせる
        CSV csv = new CSV();
        csv.download(editRecordList);
    }
}