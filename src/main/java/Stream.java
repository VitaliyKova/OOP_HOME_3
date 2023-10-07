import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Stream implements Iterable<StudyGroup>{
    private String nameStream;
//    public Integer count;


    private List<StudyGroup> listStream = new ArrayList<>();

    public Stream(String nameStream) {
        this.nameStream = nameStream;
    }

    public void addGroup(StudyGroup group){
        listStream.add(group);
    }

    public int count() {
        int count = 0;
        Iterator<StudyGroup> iterator = listStream.iterator(); // получаем итератор один раз

        while (iterator.hasNext()) {
            iterator.next();
            count++;
        }
        return count;
    }


    @Override
    public Iterator<StudyGroup> iterator() {
        Iterator<StudyGroup> it = new Iterator<>() {
            private  int index;
            @Override
            public boolean hasNext() {
                return index < listStream.size();
            }

            @Override
            public StudyGroup next() {
                if(hasNext()){
                    index++;
                    return listStream.get(index);
                }
                throw new NoSuchElementException();
            }
        };
        return it;
    }

    @Override
    public String toString() {
        return "nameStream= " + nameStream + ' ' +  listStream;
    }
}
