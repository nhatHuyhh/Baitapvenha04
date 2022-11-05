public class bai1c {
  public static void main(String[] args) {
    for (int i = 1000000; i <=999999999 ; i++) {
      if (kiemTraChiaHet(i)){
        System.out.println(i);
      }
    }
}
  public static boolean kiemTraChiaHet(int n){
    int sum=0;
    while (n>0){
      sum+=n%10;
      n/=10;
    }
    if (sum%10==0) return true;
    return false;
  }
}