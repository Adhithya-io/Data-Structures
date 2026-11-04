class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(String s:strs){
            char[] x = s.toCharArray();
            Arrays.sort(x);
            String index = new String(x);
            hm.putIfAbsent(index,new ArrayList<>());
            hm.get(index).add(s);
        }
        for(String s:hm.keySet()){
            arr.add(hm.get(s));
        }
    return arr;
    }
}
