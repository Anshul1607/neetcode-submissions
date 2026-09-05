class Solution {
    public boolean hasDuplicate(int[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            if(hs.contains(a[i])){
                return true;
            }
            else{
                hs.add(a[i]);
            }
        }
        return false;
    }
}