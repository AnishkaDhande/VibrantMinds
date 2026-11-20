public class CountPalindromString {
    public static void main(String[] args) {
        String s1="hello i NayaN am java developer";
        String a[]=s1.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++){
            String temp=a[i];
          StringBuilder sb=new StringBuilder(temp);
           String p=sb.reverse().toString();
           if(temp.equals(p))
             count++;
        }
        System.out.println(count);
    }
}
