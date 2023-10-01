public class TowerOfHanoi {
    // Function to solve Tower of Hanoi problem
    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}

/*
In this Java code:

    towerOfHanoi is a recursive function that solves the Tower of Hanoi problem.

    It takes four parameters: n (the number of disks to be moved), source (the source peg), auxiliary (the auxiliary peg), and destination (the destination peg).

    The base case is when n is 1, in which case it simply moves the top disk from the source peg to the destination peg.

    For larger values of n, it recursively moves n-1 disks from the source peg to the auxiliary peg, then moves the remaining disk from the source peg to the destination peg, and finally moves the n-1 disks from the auxiliary peg to the destination peg.

    In the main method, we call towerOfHanoi with an example of 3 disks, using pegs 'A', 'B', and 'C' as source, auxiliary, and destination, respectively
    
*/