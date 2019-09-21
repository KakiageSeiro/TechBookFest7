public class Main {

    public static void main(String[] args) {
        //CSVを作成する
        CSVBuilder csvBuilder = new CSVBuilder();
        //csvBuilder.downloadCSV("勤怠");
        csvBuilder.downloadCSV("申請");
    }
}