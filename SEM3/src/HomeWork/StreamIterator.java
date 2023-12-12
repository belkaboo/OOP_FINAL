package HomeWork;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<Group> {
    private List<Group> streamList;
    private int index;

    public StreamIterator(Stream stream) {
        this.streamList = stream.getGroupList();
        index = 0;
    }

    @Override
    public void remove() {
        streamList.remove(index);
    }

    @Override
    public boolean hasNext() {
        return index < streamList.size();
    }

    @Override
    public Group next() {
        if (hasNext()) return streamList.get(index++);
        return null;
    }
}
