
public class Baseball {

    public static void main(String[] args) {

        BaseBallTeam team1 = new BaseBallTeam("広島東洋カーブ", 88, 51, 4);
        BaseBallTeam team2 = new BaseBallTeam("阪神タイガース", 78, 61, 4);
        BaseBallTeam team3 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 65, 5);
        BaseBallTeam team4 = new BaseBallTeam("読売ジャイアンツ", 72, 68, 3);
        BaseBallTeam team5 = new BaseBallTeam("中日ドラゴンズ", 59, 79, 5);
        BaseBallTeam team6 = new BaseBallTeam("東京ヤクルトスワローズ", 45, 96, 2);

        team1.report();
        team2.report();
        team3.report();
        team4.report();
        team5.report();
        team6.report();

    }

}
