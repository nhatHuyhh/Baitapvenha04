public class bai2b {
  public static void main(String[] args) {
    for (int i =1000000; i <= 9999999; i++) {
      if (kiemTra(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean kiemTra(int n) {
    while (n>0){
      int a= n%10;
      if (a!=2 && a!=3 && a!=5 && a!=7)
        return false;
      n/=10;
    }
    return true;
    }
  }
