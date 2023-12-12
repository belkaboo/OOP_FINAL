package HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group>, Comparable<Stream> {
    private int streamID;
    private List<Group> groupList;

    public Stream(int streamID) {
        this.streamID = streamID;
        this.groupList = new ArrayList<>();
    }


    public int getStreamID() {
        return streamID;
    }

    public void setStreamID(int streamID) {
        this.streamID = streamID;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public void addGroups (Group group){
        groupList.add(group);

    }

    public int GetSize(){
        return groupList.size();
    }
    public void addGroup(Group group){
        groupList.add(group);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "streamID=" + streamID +
                ", groupList=" + groupList +
                '}';
    }

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public int compareTo(Stream o) {
        if (GetSize() > o.GetSize()) return 1;
        if (GetSize() < o.GetSize()) return -1;
        return 0;
    }
}
