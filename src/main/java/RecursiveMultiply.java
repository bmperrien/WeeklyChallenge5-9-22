public class RecursiveMultiply {
    /*
    3) Recursive Multiply: Write a recursive function to multiply two positive integers without using the *operator.
    You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.
     */

    public static int recursiveMult(int a, int b){
       if(b == 0){
           return 0;
       }else if(b == 1) {
           return a;
       }else if(b < 0){
           return -(a + recursiveMult(a, b+1));
       }else{
           return a + recursiveMult(a, b-1);
       }
    }
}
