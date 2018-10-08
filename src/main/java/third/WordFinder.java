package third;

import java.net.URL;
import java.util.HashSet;

public interface WordFinder {
    HashSet<String> getSentence(URL source);

    boolean checkIfWordInSentence(String sentence, String word);

    void writeSentenceToResult(String sentence);

}
