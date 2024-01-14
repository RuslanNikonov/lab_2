import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Текст со списком цен: 23.78 USD, 1500 RUR, 50 EU, 22 UDD, 0.002 USD, 100 GBP, 500 JPY, 8000 RUR.";

        Pattern pattern = Pattern.compile("\\b\\d+\\.\\d+\\s+(USD|RUR|EU)\\b|\\b\\d+\\s+(GBP|JPY)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
