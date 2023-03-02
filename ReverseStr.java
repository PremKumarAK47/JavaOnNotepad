import java.util.*;
class StringReverse
{
   public static void revrseString(char[] ch)
{
    int n=ch.length;
    StringBuilder sb= new StringBuilder();
   for(int i=n-1;i>=0;i--)
{
    sb.append(ch[i]);
}
System.out.println(sb.toString());
}
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the String");
String str= sc.next();
char[] ch=str.toCharArray();
revrseString(ch);

}
}