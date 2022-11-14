public class Solution {
    public static int solution(String S){
        /* alociram 26 mjesta (broj slova alfabeta) u nizu integera (count) u koji ću spremati frekvenciju
         ponavljanja slova u poslanom stringu S */

        int[] count=new int[26];

        /* prolazim slovo po slovo kroz string S, pretvaram ih u velika slova i od svakog slova oduzimam
        slovo A tj. u ASCII broj 65 tako da na tu poziciju u nizu integera (count) dodajem broj ponavljanja određenog
        slova iz riječi (npr.ako je prvo slovo B u stringu S, a znamo da je za slovo B=66 u ASCII, onda će se oduzimati
        66-65 tj. B-A i na poziciju 1 će se povećati "brojač" za 1 kao znak da postoji jedno slovo B u stringu S */

        for(int i=0;i<S.length();i++){
            count[S.toUpperCase().charAt(i)-'A']+=1;
        }

        // ASCII: B=66, A=65, L=76, O=79, N=78

        /* koristim funkciju Math.min koja od dva poslana integera vraća manji ili ako su brojevi jednaki
        vraća taj isti broj i njoj šaljem frekvencije ponavljanja slova koja me zanimaju tj.koja forme riječ BALLOON s
        tim da slova O i L dijelim sa 2*/

        return Math.min(count[1],Math.min(count[0],Math.min(count[11]/2,Math.min(count[14]/2,count[13]))));
    }

}