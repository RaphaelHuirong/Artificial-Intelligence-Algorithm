public class Main {
    public static void main(String[] args){
        int[][] testCase = {{1,3,5,7},{2,4,8,9},{3,5,11,15},{6,8,13,18}};
        int k = 9;
        BestFirstSearch test = new BestFirstSearch();
        System.out.println(test.kthSmallest(testCase, k));
        int n = 4;
        Nqueens test2 = new Nqueens();
        System.out.println(test2.nqueens(n));
    }
}
