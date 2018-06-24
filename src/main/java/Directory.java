import java.util.ArrayList;
import java.util.List;

public class Directory extends Node {

    public List<File> getFileList() {
        return FileList;
    }

    public List<Directory> getCildrens() {
        return cildrens;
    }

    private List<File> FileList;
    private List<Directory> cildrens;

    public Directory(String name, String date, Directory PDir) {
        super(name, date, PDir);
        FileList = new ArrayList<File>();
        cildrens = new ArrayList<Directory>();
    }

    void AddFile(File newF) {
        FileList.add(newF);
    }

    void AddDir(Directory newD) {
        cildrens.add(newD);
    }

    void printTree(int level) {

        for (int i = 1; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println("dir:" + name);
        for (File child : this.getFileList()) {
            for (int i = 1; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println("file:" + child.name);

        }
        for (Directory child : this.getCildrens()) {
            child.printTree(level + 1);
        }


    }
}
