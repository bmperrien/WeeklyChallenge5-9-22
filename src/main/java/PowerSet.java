public class PowerSet {
    /*
    2) Power Set: Write a method to return all subsets of a set.

     */
    public static void powerSet(String str){
        String sub = "";
        for(int i = 0; i < str.length(); i++){
            sub = "";
            for(int j = i; j < str.length(); j++){
                sub = sub + str.charAt(j);
                System.out.println(sub);
            }
        }
    }
}
