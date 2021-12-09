package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier {
    public static void main(String[] args) {
        Pattern p= Pattern.compile("[a]+");
        Matcher m=p.matcher("aab");
        while (m.find())
        {
            System.out.println("sfv");
        }
        System.out.println(m.matches());
    }
}
