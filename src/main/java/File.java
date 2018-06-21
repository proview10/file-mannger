public class File extends  Node{
    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    long size;

    public File(long size, Directory PDir) {
        this.size = size;
    }
}
