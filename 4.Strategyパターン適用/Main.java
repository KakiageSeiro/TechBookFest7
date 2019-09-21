public class Main {

    public static void main(String[] args) {
        //CSVを作成する
        CSVBuilder csvBuilder = new CSVBuilder();

        //勤怠データをダウンロード
        System.out.println("---勤怠データ---");
        csvBuilder.downloadCSV(new KintaiCSVStrategy());

        //申請データをダウンロード
        System.out.println("---申請データ---");
        csvBuilder.downloadCSV(new SinseiCSVStrategy());
    }
}