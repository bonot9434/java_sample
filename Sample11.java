class Sample11 {
  public static void main(String[] args) {

    //参照型に格納されているのは場所情報→表示したら？

    int [][] rooms = {{101, 102, 103}, {201, 202, 203}, {301, 302, 303}};

    System.out.println("▼参照型の変数roomsに格納されている値");
    System.out.println("rooms:" + rooms);

    //String型変数同士で関係演算子を用いる際の注意

    String name = "モコ";

    boolean check1 = name == args[0];
    System.out.println("▼『==』を用いたString型の比較");
    System.out.println("check1:" + check1);

    boolean check2 = name.equals(args[0]);
    System.out.println("▼『equals』を用いたString型の比較");
    System.out.println("check2:" + check2);

    //【注意】擬似プリミティブとして生成されたString型変数は扱いがややこしい
    String nameOfficial1 = new String("モコ");
    String nameOfficial2 = new String("モコ");
    String nameGizi1 = "モコ";
    String nameGizi2 = "モコ";

    boolean check3 = nameOfficial1 == nameOfficial2;
    System.out.println("▼『==』を用いた比較（正式⇔正式)");
    System.out.println("check3:" + check3);

    boolean check4 = nameGizi1 == nameOfficial1;
    System.out.println("▼『==』を用いた比較（擬似⇔正式)");
    System.out.println("check4:" + check4);

    boolean check5 = nameGizi1 == nameGizi2;
    System.out.println("▼『==』を用いた比較（擬似⇔擬似)　※注目");
    System.out.println("check5:" + check5);
  }
}