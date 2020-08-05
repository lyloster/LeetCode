package solutions;

import java.util.ArrayList;
import java.util.List;
/**
 * Design a data structure that supports the following two operations:
 *
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 *
 * Example:
 *
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 * */
public class WordDictionary {
    // time limit exceeded, needs to be done with trie
    List<String> words;
    /** Initialize your data structure here. */
    public WordDictionary() {
        this.words = new ArrayList<>();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        if (!words.contains(word)) {
            words.add(word);
        }
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        if (words.contains(word)) {
            return true;
        } else {
            for (int i = 0; i < words.size(); ++i) {
                int matchingLetters = 0;
                //same length
                if (word.length() == words.get(i).length()) {
                    for (int j = 0; j < word.length(); ++j) {
                        //characters match or character is '.'
                        if (word.charAt(j) == '.' || word.charAt(j) == words.get(i).charAt(j)) {
                            ++matchingLetters;
                        }
                    }
                    if (matchingLetters == word.length()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
