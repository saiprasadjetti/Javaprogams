import java.util.*;


public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }
}
class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int len=0;
        for(int i=0;i<n;i++){

            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }


        boolean flag=false;
        int count=0;
        for(Map.Entry<Character,Integer> hmap:map.entrySet()){

            System.out.println(hmap.getKey()+" "+hmap.getValue());
            if(hmap.getValue()%2!=0){
                count=count+hmap.getValue()-1;
                flag=true;
            }
            else{
                count=count+hmap.getValue();
            }
            len=len+hmap.getValue();


        }
        if(flag){
            return count+1;
        }
        return count;
    }
}