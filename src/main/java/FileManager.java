



public class FileManager {
    private Directory ROOT;
    public Directory getROOT() {
        return ROOT;
    }



    public FileManager() {
        ROOT = new Directory("ROOT", "DATE", null);
    }


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

        }
        return null;
    }


    public void deleteFile(String name) {
        File file = findFile(ROOT, name);
        if (file != null) {
            file.getPDir().getFileList().remove(file);
        }
    }


    public void addFile(String pdir, String name, long size, String date) {
        File file = findFile(ROOT, name);
        if (file == null) {
            Directory dir = findDirectory(ROOT, pdir);
            if (dir != null) {
                File nfile = new File(size, name, date, dir);
                dir.getFileList().add(nfile);

            } else System.out.println("could not get dir");

        } else System.out.println("file olready exist");
    }

    public void addDir(String pdir, String name, String date) {
        Directory cdir = findDirectory(ROOT, name);
        if (cdir == null) {

            Directory dir = findDirectory(ROOT, pdir);
            if (dir != null) {
                Directory ndir = new Directory(name, date, dir);
                dir.getCildrens().add(ndir);
            } else System.out.println("could not get dir");

        } else System.out.println("dir olready exist");

    }


    public static void main(String[] args) {
        FileManager test = new FileManager();
        test.addDir("ROOT", "a", "asd");
        test.addDir("ROOT", "b", "asd");
        test.addFile("ROOT", "fa", 123, "asd");
        test.addDir("a", "c", "asd");
        test.addDir("b", "d", "asd");
        test.addDir("b", "d", "asd");
        test.addDir("a", "e", "asd");
        test.addFile("d", "fb", 123, "asd");
        test.addDir("ROOT", "f", "asd");
        test.ROOT.printTree(0);
        System.out.println("_____________________");
        test.deleteFile("fa");
        test.deleteDirectory("b");
        test.ROOT.printTree(0);

    }


}
