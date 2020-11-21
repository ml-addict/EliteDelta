import java.util.List;
import java.util.ArrayList;

/**
 * A stream of size n containing (id, value) pairs is arriving. The
 * pair arrives in an arbitrary order. `id` is an integer between 1
 * and n. `value` is a string.
 *
 * No two pairs have the same id.
 *
 * Design a stream that returns the values in increasing order of their
 * id's by returning a chunk (list of values after each insertion.
 *
 * The concatenation of all the chunks should result in a list of the
 * sorted values.
 *
 * Implement the OrderedStream class:
 * 1. OrderedStream(int n): constructs the stream to take `n` values.
 * 2. String[] insert(int id, String value): inserts the pair (id, value)
 * into the stream, then returns the largest possible chunk of currently
 * inserted values that appear next in the order.
 */
public class OrderedStream {

    private int n;
    private String[] stream;
    private int ptr;

    public OrderedStream(int n) {
        this.n = n;
        this.stream = new String[n];
        this.ptr = 0;
    }

    public List<String> insert(int id, String value) {
        stream[id-1] = value;
        List<String> chunk = new ArrayList<>();
        if (ptr == id-1) {
            // O(n) time complexity.
            // The ptr can extend up to the length of the `stream` array.
            while (ptr < stream.length && stream[ptr] != null) {
                chunk.add(stream[ptr]);
                ptr++;
            }
        }
        return chunk;
    }

    public static void main(String[] args) {
        OrderedStream obj = new OrderedStream(5);
        System.out.println(obj.insert(3, "cccc"));
        System.out.println(obj.insert(1, "aaaa"));
        System.out.println(obj.insert(2, "bbbb"));
        System.out.println(obj.insert(5, "eeee"));
        System.out.println(obj.insert(4, "dddd"));
    }
}
