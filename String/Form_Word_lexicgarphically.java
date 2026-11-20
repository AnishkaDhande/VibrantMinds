import java.util.Arrays;

public class Form_Word_lexicgarphically {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String s2=s1.replaceAll(" ","");
        char a[]=s2.toCharArray();
        Arrays.sort(a);
        StringBuilder sb=new StringBuilder();
        sb.append(a);
        // System.out.println(sb);
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)==' ')
            {
              sb.insert(i,' '); 
            }
        }
        System.out.println(sb);
    }
}
