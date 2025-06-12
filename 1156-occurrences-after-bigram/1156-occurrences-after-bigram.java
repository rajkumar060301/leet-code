class Solution {
    public String[] findOcurrences(final String text, final String first, final String second) {
        final List<String> matches = new ArrayList<>();
        final String[] words = text.split(" ");

        for(int i = 0; i < words.length - 2; i++)
            if(words[i].equals(first) && words[i + 1].equals(second))
                matches.add(words[i + 2]);

        return matches.toArray(new String[0]);
    }
}