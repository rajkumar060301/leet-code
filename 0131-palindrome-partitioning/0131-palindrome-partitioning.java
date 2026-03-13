class Solution {
    List<List<String>> res;
    public void solve(String s, int i, List<String> ans){
        if(i>=s.length()) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int len=1; i+len<=s.length(); len++){ // try every possible part after i in s
            String part = s.substring(i, i+len);
            if(isPalindrome(part)){ // if this part is palindrome => add it
                ans.add(part);
                solve(s, i+len, ans);
                ans.remove(ans.size()-1); // backtrack
            }
        }
    }
    public boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        solve(s, 0, new ArrayList<>());
        return res;
    }
}