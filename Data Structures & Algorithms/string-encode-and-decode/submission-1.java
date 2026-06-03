class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for(String word: strs) {
            result += word.length()+"#"+word;
        }

        //System.out.println("result "+result);
        return result;

    }

    public List<String> decode(String str) {
        int i = 0;
        String temp = ""; 
        List<String> result = new ArrayList<>();
         while(i < str.length()) {
            int wordLen = 0;
            if (str.charAt(i) == '#') {
                wordLen = Integer.parseInt(temp);
                temp = "";
                i++;
                if (wordLen == 0) result.add("");
                else result.add(str.substring(i, i+wordLen));
                i += wordLen;
                //System.out.println("len "+ wordLen);
            } else {
                temp += str.charAt(i);
                i++;
            }
            
            
        }

       //if(result.size() == 0) result.add("");
        return result;

    }
}
