import java.util.Arrays;
public class Sort_alphabatically {
    public static void main(String[] args) {
        String s1="International";
        char a[]=s1.toCharArray();
        Arrays.sort(a);
        String s2=new String(a);
        //System.out.println(Arrays.toString(a));
        System.out.println(s2);
    }
}
