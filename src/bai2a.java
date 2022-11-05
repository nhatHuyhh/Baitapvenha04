public class bai2a {
  public static void main(String[] args) {
    for (int i = 1000000; i <=9999999 ; i++) {
      if (kiemTraSNT(i)){
        System.out.println(i);
      }
    }
  }
  public static boolean kiemTraSNT(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
