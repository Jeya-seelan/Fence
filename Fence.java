import java.util.*;
class Fence{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int l,b;
  l = in.nextInt();
  b = in.nextInt();
  System.out.printf("%dm\n%dsqm",2*(l+b),2*l*b);
 }
}