public class FirstLetterToUpperCase {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        String s[]=s1.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length;i++){
            String temp=s[i];
            char p=Character.toUpperCase(temp.charAt(0));
            sb.append(p);
            sb.append(temp.substring(1));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
