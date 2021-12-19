class Sample02 {
  public static void main(String[] args) {
    int price = 1000;             //定価
    double tax = 1.08;            //消費税
    double amount = price * tax;  //支払い金額
    System.out.println(amount);   //表示
  }
}