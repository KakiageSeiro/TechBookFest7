import java.util.List;

public class CSVBuilder {

    public void downloadCSV(String target) {

        //データを取得するSQL
        String query = "";
        if (target.equals("勤怠")) {
            //勤怠テーブル
            query = "SELECT * FROM kintai";
        } else if (target.equals("申請")) {
            //申請テーブル
            query = "SELECT * FROM sinsei";
        }

        //SQLを実行結果を取得
        SQL sql = new SQL();
        List<List<String>> recordList = sql.executeQuery(query);

        if (target.equals("勤怠")) {
            //会社にいた時間から、休憩時間（１時間）を引く
            for (List<String> record : recordList) {
                int workTime = Integer.parseInt(record.get(2));
                workTime = workTime - 1;
                record.set(2, Integer.toString(workTime));
            }
        } else {

            //何もしない

        }

        //CSVファイルを作成しダウンロードさせる
        CSV csv = new CSV();
        csv.download(recordList);
    }
}