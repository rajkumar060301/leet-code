class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> words = new HashSet<>();
        Map<String,String> lowercaseMap = new HashMap<>();
        Map<String,String> vowelcaseMap = new HashMap<>();
        for(String word:wordlist){
            words.add(word);
            String lower = word.toLowerCase();
            lowercaseMap.putIfAbsent(lower,word);
            vowelcaseMap.putIfAbsent(getVowelCase(lower),word);
        }

        for(int i=0;i<queries.length;i++){
            String word = queries[i];
            if(words.contains(word)) continue;
            String lower = word.toLowerCase();
            if(lowercaseMap.containsKey(lower)){
                queries[i] = lowercaseMap.get(lower);
                continue;
            }
            String vowelcase = getVowelCase(lower);
            if(vowelcaseMap.containsKey(vowelcase))
                queries[i] = vowelcaseMap.get(vowelcase);
            else queries[i] = "";
        }

        return queries;
    }

    public String getVowelCase(String str){
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++)
            if(isVowel(arr[i]))
                arr[i] = '.';
        return String.valueOf(arr);
    }

    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||
        ch == 'i' || ch == 'o' || ch == 'u';
    }
}