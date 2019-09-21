import java.util.List;
import java.util.stream.Collectors;

public class CSV {

    public void download(List<List<String>> recordList) {
        //引数のレコードをカンマ区切りで接続
        List<String> commaSeparatedList = new ArrayList<>();
        for (List<String> record : recordList) {
            String row = "";
            boolean first = true;
            for (String s : record) {
                if(first){
                    first = false;
                    row = s;
                }
                else{
                    row = row + "," + s;
                }
            }
            commaSeparatedList.add(row);
        }

        //CSVファイル作成＆書き込み＆ダウンロードする(フリして標準出力）
        for (String x : commaSeparatedList) {
            System.out.println(x);
        }
    }
}