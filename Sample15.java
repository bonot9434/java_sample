class Sample15 {
  static String getName(){
    return "モコ";
  }

  static void printName(String name){
    System.out.println("なまえ:" + name);
  }

  //プログラムは必ずmainメソッドからはじまる
  public static void main(String[] args) {
    String print = getName();

    printName(print);
  }
}