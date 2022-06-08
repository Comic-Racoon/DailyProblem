package problems.daily_problems.problem_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem11 {

    /*

    Implement an autocomplete system. That is, given a query string
    s and a set of all possible query strings, return all strings in
    the set that have s as a prefix.

    For example, given the query string de and the set of strings
    [dog, deer, deal], return [deer, deal].

    */

    public static void main(String[] args) {

        Trie ds = new Trie();
        ds.insert("dog");
        ds.insert("deer");
        ds.insert("deal");

        System.out.println(ds.search("de"));
    }

    static class TrieNode{
        Map<Character, TrieNode> children;
        boolean endOfWord;

        TrieNode(){
            children = new HashMap<Character, TrieNode>();
            endOfWord = false;
        }
    }

     static class Trie{
        private TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(String s){

            TrieNode current = root;
            for(int i =0; i < s.length(); i++){
                char ch = s.charAt(i);
                TrieNode node = current.children.get(ch);
                if(node == null){
                    node = new TrieNode();
                    current.children.put(ch, node);
                }

                current = node;
            }
            current.endOfWord = true;

        }

        public List<String> search(String s){
            List<String> autoComplete = new ArrayList<String>();

            TrieNode current = root;

            for (int i=0; i< s.length(); i++){
                current = current.children.get(s.charAt(i));

                if(current == null){
                    return autoComplete;
                }
            }

            searchWords(current, autoComplete, s );
            return autoComplete;
        }

    }

    private static void searchWords(TrieNode current, List<String> autoComplete, String word) {

        if(current == null){
            return;
        }

        if(current.endOfWord){
            autoComplete.add(word);
        }

        Map<Character, TrieNode> map = current.children;

        for(Character c : map.keySet()){
            searchWords(map.get(c) , autoComplete, word+String.valueOf(c));
        }
    }
}
