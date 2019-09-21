import java.util.List;

public class CSVBuilder {

    public void downloadCSV(){

        //勤怠テーブルからデータを取得するSQL
        String query = "SELECT * FROM kintai";

        //SQLを実行結果を取得
        SQL sql = new SQL();
        List<List<String>> recordList = sql.executeQuery(query);

        //会社にいた時間から、休憩時間（１時間）を引く
        for (List<String> record : recordList) {
            int workTime = Integer.parseInt(record.get(2));
            workTime = workTime - 1;
            record.set(2, Integer.toString(workTime));
        }

        //CSVファイルを作成しダウンロードさせる
        CSV csv = new CSV();
        csv.download(recordList);
    }
}