/* Given n frinds, each one can remain single or can be paired up with some other friend. 
Each friend can be paired only once. Find out the total number of ways in which 
friends can remain single or can be paired up. */
public class FriendsPairingProblem {
    public static int friendPairing(int n){
        if (n == 1 || n == 2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendPairing(n-1);

        //pair

        int fnm2 = friendPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //total ways
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(friendPairing(2));
        System.out.println(friendPairing(3));
        System.out.println(friendPairing(4));
        System.out.println(friendPairing(5));

    }
    
}
