import java.util.ArrayList;
import java.util.List;

public class Directory extends  Node{

    public List<File> getFileList() {
        return FileList;
    }

    public List<Directory> getCildrens() {
        return cildrens;
    }

    private List<File> FileList= new ArrayList<File>();
    private List<Directory> cildrens= new ArrayList<Directory>();



    void AddFile(File newF){
        FileList.add(newF);
    }
    void AddDir(Directory newD){
        cildrens.add(newD);
    }

}
