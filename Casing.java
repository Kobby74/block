public class Casing {
    public static void main(String[] args) {
        String quote = "I love you very much";
        String jadenQuote = toJadenCase(quote);
        System.out.println(jadenQuote);
    }
    
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.length() == 0) {
            return phrase;
        }
        
        String[] words = phrase.split(" ");
        StringBuilder jadenCase = new StringBuilder();
        
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            
            jadenCase.append(firstLetter.toUpperCase());
            jadenCase.append(restOfWord.toLowerCase());
            jadenCase.append(" ");
        }
        
        return jadenCase.toString().trim();
    }
}
