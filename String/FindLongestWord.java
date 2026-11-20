public class FindLongestWord {
    public static void main(String[] args) {
        String s1="hello i am java Developer";
        String a[]=s1.split(" ");
        int leng=0;
        for(int i=0;i<a.length;i++)
        {
            
            StringBuilder temp=new StringBuilder(a[i]);
            if(temp.length()>leng)
             {
                leng=temp.length();
             }
        }
        System.out.println(leng);
    }
}
