import java.util.*;
class string{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 strings:");
String s1=sc.nextLine();
String s2=sc.nextLine();
System.out.println("Before case change");
System.out.println(s1);
System.out.println(s2);
s1=s1.toUpperCase();
s2=s2.toUpperCase();
System.out.println("After case change");
System.out.println(s1);
System.out.println(s2);
if(s1.equals(s2)){
System.out.println("Both strings are equal");
}
else{
System.out.println("Strings are not equal");
}
}
}
