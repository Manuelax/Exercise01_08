public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));                     // true
        System.out.println(isPerfectSquare(4));                     // true
        System.out.println(isPerfectSquare(Integer.MAX_VALUE / 100)); 
        System.out.println(isPerfectSquare(255));                   // false
    }

    public static boolean isPerfectSquare(int num) {
        for (int i = 1; i * i <= num; i++) { // changed loop condition to 'i * i <= num' to handle all numbers correctly,
            if (i * i == num) {  // Fixed comparison from '=' to '==' for checking equality,
                return true;
            } else if (i * i > num) {  return false;
            }
        }
        return false; //  added 'return false' at the end to ensure the method always returns a boolean.
    }
}

