public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        List<String> show = new ArrayList<>();
        for (String s:strs
             ) {
            show.add(s);
        }
        List<String> copy = new ArrayList<>();
        List<String> ret = new ArrayList<>();
        //将所有的字符串进行排序，排序完成后存在拷贝copy中
        for (String s:show
             ) {
            char[] sorting = s.toCharArray();
            Arrays.sort(sorting);
            String str = String.valueOf(sorting);
            copy.add(str);
        }
        int index_count = 0;
        for (int i = 0 ; i < copy.size();i++){
            int flag = 0;//用来做是否有相同的string项的标记
            for (int j = i + 1; j < copy.size(); j++){
               if (copy.get(i).equals(copy.get(j))){
                   flag = 1;
                   ret.add(show.get(j));
                   copy.remove(j);
                   show.remove(j);
                   j = j - 1;
               }
            }
            if (flag == 1){
                ret.add(show.get(i));
                show.remove(i);
                copy.remove(i);
                i = -1;
            }
        }
        return ret;
    }
}
