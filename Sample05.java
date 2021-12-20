class Sample05 {
  public static void main(String[] args) {
    //代入演算子

    int number0 = 10;
    number0 += 3;
    System.out.println("number0:" + number0);

    int number1 = 10;
    number1 = number1 + 3;
    System.out.println("number1:" + number1 + "※number0と同じ値になる");

    int number2 = 10;
    number2 -= 3;
    System.out.println("number2:" + number2);

    int number3 = 10;
    number3 *= 3;
    System.out.println("number3:" + number3);

    int number4 = 10;
    number4 /= 3;
    System.out.println("number4:" + number4);

    int number5 = 10;
    number5 %= 3;
    System.out.println("number5:" + number5);

    String stNumber6 = "10";
    stNumber6 += "3";
    System.out.println("stNumber6:" + stNumber6);
  }
}