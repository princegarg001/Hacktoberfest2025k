class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch:m.toCharArray())
        {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char s: r.toCharArray())
        {
            if(hm.containsKey(s)&&hm.get(s)>0)
            {
                hm.put(s,hm.get(s)-1);
            }
            else
            return false;
        }
        return true;
    }
}
