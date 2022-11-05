public class Bai1b {
  public static void main(String[] args) {
    for (int i = 1000000; i <=999999999 ; i++) {
      if (kiemTracochuso6(i) && kiemTracochuso8(i) && kiemTracochuso(i)){
        System.out.println(i);
      }
    }
    }

  public static boolean kiemTracochuso(int d) {
      while (d>0){
        int e =d%10;
        if (e==6){
          return true;
        }
        d/=10;
      }
      return false;
    }
  public static boolean kiemTracochuso6(int n) {
    while (n>0){
      int a =n%10;
      if (a==8){
        return true;
      }
      n/=10;
    }
    return false;
   }
  public static boolean kiemTracochuso8(int b){
    while (b>0){
      int c =b%10;
      if (c==0){
        return true;
      }
      b/=10;
    }
    return false;
  }
}

