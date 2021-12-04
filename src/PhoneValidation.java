import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidation {
    public static void main(String[] args) {
//        String target = "baabberererbbbrtrt";
//        Pattern p = Pattern.compile("[b]?");
        String target = "9&98q87*&ab";
//        Pattern p = Pattern.compile("\\D");
//        Pattern p = Pattern.compile("\\s");
//        Pattern p = Pattern.compile("\\S");
        Pattern p = Pattern.compile("\\W");

        int ctr=0;
//        String target="09876543218abc gla#919876543218";
//        Pattern p= Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(target);
        while(m.find())
        {
            ctr++;
            System.out.println(m.start()+" "+m.end()+" "+m.group());
            System.out.println(m.group());
        }
        System.out.println(ctr);

        String s1 = "9876543210";
      //   System.out.println(s1.matches( regex: "(0|91)?[7-9][0-9]{9}"));
    }
}
