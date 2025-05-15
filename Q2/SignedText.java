public class SignedText {
  private String first;
  private String last;


  public SignedText(String f, String l) {
    first = f;
    last = l;
  }


  public String getSignature() {
    if (first.length() == 0) {
      return last;
    }
    return first.substring(0, 1) + "-" + last;
  }

  public String addSignature(String word) {
    if (word.indexOf(getSignature()) == 0) {
      return word.substring(getSignature.length()) + getSignature();
    } else if (word.indexOf(getSignature()) > 0) {
      return word;
    } else {
      return word + getSignature()
    }
  }

  
