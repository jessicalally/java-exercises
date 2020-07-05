import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PigLatin {

  private static List<String> getWords(String input) {
    List<String> splitText = new ArrayList<>();
    String word = "";
    for (int i = 0; i < input.length(); i++) {
      if (Character.isLetterOrDigit(input.charAt(i))) {
        word += input.charAt(i);
      } else {
        if (word.length() > 0) {
          splitText.add(word);
          word = "";
        }
        splitText.add(Character.toString(input.charAt(i)));
      }
    }
    return splitText;
  }

  private static String toPigLatin(List<String> words) {
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      if (!Character.isLetter(word.charAt(0))) {
        sb.append(word);
      } else {
        sb.append(translateWord(word));
      }
    }
    return sb.toString();
  }

  private static String translateWord(String word) {
    if (isVowel(word.charAt(0))) {
      return word + "way";
    } else {
      String subString = word.substring(1);
      return subString + word.charAt(0) + "ay";
    }
  }

  private static Boolean isVowel(char chr) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    for (int i = 0; i < vowels.length; i++) {
      if (Character.toLowerCase(chr) == vowels[i]) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String line = input.readLine();
    StringBuilder sb = new StringBuilder();
    while (!line.equals("end")) {
      sb.append(toPigLatin(getWords(line)));
      line = input.readLine();
    }
    System.out.print(sb);
  }

}
