public class Node {
    String name;
    String date;
    Directory PDir;

    public Node(String name, String date, Directory PDir) {
        this.name = name;
        this.date = date;
        this.PDir = PDir;
    }
    public Node() {


    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }


    public String getDate() {
        return date;

    }

    public void setDate(String date) {
        this.date = date;

    }

    public Directory getPDir() {
        return PDir;
    }

    public void setPDir(Directory PDir) {
        this.PDir = PDir;
    }


}
