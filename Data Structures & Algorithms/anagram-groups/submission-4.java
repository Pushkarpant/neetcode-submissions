class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> ansMap = new HashMap<>();
        int arr[] = new int[26];

        for(String s: strs){
            Arrays.fill(arr,0);
            for(char ch : s.toCharArray()){
                arr[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();

            for(int i =0;i<26;i++){
                sb.append("#").append(arr[i]);
            }

            String key=sb.toString();
            if(!ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList());
            }
            ansMap.get(key).add(s);

        }
        return new ArrayList(ansMap.values());




    }
}