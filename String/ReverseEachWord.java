public class ReverseEachWord {
    public static void main(String[] args) {
       String s1="hello i am java developer";
       String a[]=s1.split(" ");
       StringBuilder sb=new StringBuilder();
      for(int i=0;i<a.length;i++)
      {
        StringBuilder temp=new StringBuilder(a[i]);//hello
         sb.append(temp.reverse());
         sb.append(" ");
      }
      sb.deleteCharAt(sb.length()-1);
      System.out.println(sb);
    }
}
