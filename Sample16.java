class Sample16 {
  public static void main(String[] args) {
    int print1 = sum(2, 3);
    System.out.println("print1:" + print1);

    double print2 = sum(1.2, 1.3);
    System.out.println("print2:" + print2);

    int print3 = sum(2, 3, 4);
    System.out.println("print3:" + print3);
  }

  static int sum(int num1, int num2) {
    int calcResult = num1 + num2;
    return calcResult;
  }

  static double sum(double num1, double num2) {
    double calcResult = num1 + num2;
    return calcResult;
  }

  static int sum(int num1, int num2, int num3) {
    int calcResult = num1 + num2 + num3;
    return calcResult;
  }
}