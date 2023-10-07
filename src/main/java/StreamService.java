import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamService {
    public List<Stream> stream = new ArrayList<>();


    void addStream(Stream stream){
        this.stream.add(stream);
    }

    public void SortStream(){
        stream.sort(new StreamComparator());
    }

    public List<Stream> getStream() {
        return stream;
    }

    @Override
    public String toString() {
        return "Поток" + stream;

    }
}
