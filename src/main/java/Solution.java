
public class Solution {
    public static int solution(String inputWord, String S){
        int[] count=new int[26];
        int[] countInputWord=new int[26];
        int counter=0;
        boolean bool=true;
        int length=count.length;
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)-'A']+=1;
        }
        for(int i=0;i<inputWord.length();i++){
            countInputWord[inputWord.charAt(i)-'A']+=1;
        }
        while(bool){
            for(int i=0;i<length;i++){
                if(count[i]-countInputWord[i]>=0)
                {
                    count[i]=count[i]-countInputWord[i];
                }
                else{
                    bool=false;
                    break;
                }
                if(length-i==1){
                    counter++;
                }
            }
        }
        return counter;
    }

}