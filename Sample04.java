class Sample04 {
  public static void main(String[] args) {
    //演算子
    int numberX = 8;
    int numberY = 4;
    int numberZ = 5;
    String stNumberX = "1";
    String stNumberY = "2";

    int answer1 = numberX + numberY;
    System.out.println("answer1:" + answer1);

    int answer2 = numberX - numberY;
    System.out.println("answer2:" + answer2);

    int answer3 = numberX * numberY;
    System.out.println("answer3:" + answer2);

    int answer5 = numberX / numberY;
    System.out.println("answer4:" + answer2);

    // 割り切れない場合
    int answer5 = numberX / numberY;
    System.out.println("answer5:" + answer2);

    int answer6 = numberX % numberY;
    System.out.println("answer6:" + answer2);

    int answer7 = -answer6;
    System.out.println("answer7:" + answer7);

    int answer8 = numberX++; //number8に代入後++の処理が実行される
    System.out.println("answer8:" + answer8);
    System.out.println("(numberX:" + numberX + ")");

    int answer9 = number++Y;
    System.out.println("answer9:" + number9);
    System.out.println("(numberY:" + numberY + ")");

    int answer10 = numberZ + 1;
    System.out.println("answer10:" + answer10);
    System.out.println("(numberZ:" + numberZ + ")");

    int answer11 = numberZ--;
    System.out.println("answer11:" + answer11);
    System.out.println("(numberZ:" + numberZ + ")");

    String answer12 = stNumberX + stNumberY;
    System.out.pirintln("answer12:" + answer12);
  }
}