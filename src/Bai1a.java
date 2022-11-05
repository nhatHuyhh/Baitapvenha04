public class Bai1a {
    public static void main(String[] args) {
      for (int i = 1000000; i <999999999 ; i++) {
        if (kiemTraSTN(i)){
          System.out.println(i);
        }
      }
    }
    public static boolean kiemTraSTN(int n) {
      int soBanDau = n;
      int temp = 0;

      while (n > 0) {
        temp = temp * 10 + n % 10;
        n = n / 10;
      }
      if (temp == soBanDau) return true;
      return false;
    }
  }

