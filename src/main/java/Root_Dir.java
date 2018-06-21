import sun.reflect.generics.tree.Tree;

import java.util.List;
import java.util.TreeSet;

public class Root_Dir {
    private Directory ROOT;

    public Root_Dir(Directory ROOT) {
        this.ROOT = ROOT;
    }
/*
    private static  void printTree(Node node, String appender) {
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each ->  printTree(each, appender + appender));
    }*/


    public Directory findDirectory(Directory d, String name) {
        if (d.name.equals(name)) {
            return d;
        } else {
            for (Directory child : d.getCildrens()) {
                Directory result = findDirectory(child, name);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    public void deleteDirectory(String name) {
        Directory dir = findDirectory(ROOT, name);
        if (dir != null) {
            dir.getPDir().getCildrens().remove(dir);
        }
    }

    public File findFile(Directory d, String name) {
        for (File file : d.getFileList()) {
            if (file.getName().equals(name)) {
                return file;
            }
        }

        for (Directory child : d.getCildrens()) {
            File file = findFile(child, name);
            if (file != null) {
                return file;
        }
        return null;
    }


    public void deleteFile(String name) {
        File file = findFile(ROOT, name);
        if (file != null) {
            file.getPDir().getFileList().remove(file);
        }
    }


        public void addFile(String name) {
            File file = findFile(ROOT, name);
            if (file != null) {
                file.getPDir().getFileList().remove(file);
            }
        }
        public void deleteFile(String name) {
            File file = findFile(ROOT, name);
            if (file != null) {
                file.getPDir().getFileList().remove(file);
            }
        }


    public static void main(String[] args) {


    }


}
