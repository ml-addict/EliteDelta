import java.util.List;

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

    public OrderedStream(int n) {
        this.n = n;
    }

    public List<String> insert(int id, String value) {
        return null;
    }
}
