public class File extends Node {
    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    long size;

    public File(long size, String name, String date, Directory pdir) {
        super(name, date, pdir);
        this.size = size;

    }
}
