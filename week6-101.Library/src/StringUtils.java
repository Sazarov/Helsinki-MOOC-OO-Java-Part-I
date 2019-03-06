public class StringUtils {
    public static boolean included(String word, String searched){
        if ( word == null || searched == null) {
            return false;
        } else {
            return word.toUpperCase().contains(searched.toUpperCase().trim());
        }
    }
}
