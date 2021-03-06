class Sample03{
  public static void main(String[] args) {
    //整数(byte型)
    byte month = 12;    //月
    System.out.println("月:" + month);

    //整数(short型)
    short year = 2018;  //年
    System.out.println("年:" + year);

    //整数(int型)
    int income = 5000000;   //年収
    System.out.println("年収" + income);

    //整数(long型)
    long malePopulation = 3500000000L;    //人口  Lはint型ではなく、Long型の表示
    System.out.println("人口(男性):" + malePopulation);

    //少数点数(double型)
    double acceptanceRateIT = 6.05;   //IT業界の求人倍率（2018年）
    System.out.println("IT業界の求人倍率(2018年):" + acceptanceRateIT);

    //少数点数(float型)
    float tax = 1.08F;   //消費税　Fはdouble型ではなく、Float型の表示
    System.out.println("消費税:" + tax);

    //文字(char型)
    char weekday = '土';   //曜日 ’はchar型、一文字のみ
    System.out.println("曜日:" + weekday);

    //文字列(String型)
    String name = "モコ";   //名前  "はString型、何文字でも大丈夫
    System.out.println("名前:" + name);

    //論理値
    boolean genderMale = false;   //性別が男性
    System.out.println("性別が男性:" + genderMale);
  }
}