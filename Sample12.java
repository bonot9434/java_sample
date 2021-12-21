class Sample12 {
  public static void main(String[] args) {
    int loopCount = 0;

    System.out.println("▼[開始]for文");
    
    for (int i=0; i<4 ; i++) {
      System.out.println("▼[開始]１回分の繰り返し処理");

      loopCount += 1;

      System.out.println(" loopCount:" + loopCount);
      System.out.println(" i(カウンタ変数):" + i);

      System.out.println("▲[終了]１回分の繰り返し処理");
    }
  System.out.println("▲[終了]for文");
  }
}