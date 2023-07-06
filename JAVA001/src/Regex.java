
import java.util.Arrays;
import java.util.regex.*;

public class Regex {
//    Regular Expressions
//    the java regex or regulaar expressions  is an api to define a pattern for searching or
//    manipltion of string
public static void main(String[] args) {
//    1st way
    Pattern p=Pattern.compile(".s");
    Matcher m= p.matcher("mas");
    boolean b=m.matches();
//    2nd way
    boolean b2=Pattern.compile(".s").matcher("as").matches();
    boolean b3=Pattern.matches(".s","tas");
//    System.out.println(b+" "+b2+" "+b3);
    String str="hallos";
    System.out.println(b3);
 String regex="^https?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?$";
 String url="hhtps=//www.google.com";
 boolean isMatch=url.matches(regex);
    System.out.println(isMatch);
//    extracting numbers
    String sregex="\\d+";
    String text="I have 108 apples and 5 mangoes";
    Pattern pp=Pattern.compile(sregex);
    Matcher mm=pp.matcher(text);
    while (mm.find()){
        System.out.println(mm.group());
    }
//    Validate email adress
    String rx="^[A-Za-z0-9+_.%-]+@[A-Za-z]+\\.com$";
    String email="htri@gmail.com";
    boolean isValid=email.matches(rx);
    System.out.println(isValid);
//    s
//    plitting string after each
    String rxx="\\s*,\\s*";
    String txt="abc,def,hij,klm,mno";
    String[]letters=txt.split(rxx);
    System.out.println(Arrays.toString(letters));



}

}
