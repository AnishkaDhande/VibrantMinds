public class AppendVowelAlsttoWord {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String a[]=s1.split(" ");
        StringBuilder sb=new  StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            String temp=a[i];
          sb.append(temp.replaceAll("(?i)[aeiou]",""));
          sb.append(temp.replaceAll("(?i)[^aeiou]",""));
          sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
