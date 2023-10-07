import java.util.Comparator;
import java.util.List;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.count(), o2.count());
    }
}
