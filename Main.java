import java.util.List;

public class Main {
    public static void main(String[] args){
        Tuple tuple1 = new Tuple("abc", 10);
        Tuple tuple2 = new Tuple("aaa", 12);
        Tuple tuple3 = new Tuple("bbb", 10);
        Tuple tuple4 = new Tuple("ccc", 4);
        Tuple[] input = new Tuple[] {tuple1, tuple2, tuple3, tuple4};
        FindKSmallest test = new FindKSmallest();
        List<Tuple> result = test.findKSmallest(input, 2);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).id);
        }
    }

}
