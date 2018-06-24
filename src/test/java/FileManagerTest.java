import org.junit.Assert;

public class FileManagerTest {
    FileManager test;



    @org.junit.Before
    public void before(){
        test = new FileManager();
        test.addDir("ROOT", "a", "asd");
        test.addDir("ROOT", "b", "asd");
        test.addFile("ROOT", "fa", 123, "asd");
        test.addDir("a", "c", "asd");
        test.addDir("b", "d", "asd");
        test.addDir("a", "e", "asd");
        test.addFile("d", "fb", 123, "asd");
        test.addDir("ROOT", "f", "asd");
    }


    @org.junit.Test
    public void findDirectory() {

       // test.ROOT.printTree(0);
        Assert.assertEquals("",test.findDirectory(test.getROOT(),"b").getName() , "b");
        Assert.assertEquals(test.findDirectory(test.getROOT(),"b").getName() , "b");
        Assert.assertNotEquals(test.findDirectory(test.getROOT(),"a").getName() , "r");
        Assert.assertNull(test.findDirectory(test.getROOT(),"t"));

    }

    @org.junit.Test
    public void deleteDirectory() {
        Assert.assertEquals(test.findDirectory(test.getROOT(),"b").getName() , "b");
        test.deleteDirectory("b");
        Assert.assertNull(test.findDirectory(test.getROOT(),"b"));
    }

    @org.junit.Test
    public void findFile() {
        Assert.assertEquals(test.findFile(test.getROOT(),"fa").getName() , "fa");
        Assert.assertEquals(test.findFile(test.getROOT(),"fb").getName() , "fb");
        Assert.assertNotEquals(test.findFile(test.getROOT(),"fa").getName() , "fb");
        Assert.assertNull(test.findFile(test.getROOT(),"t"));
    }

    @org.junit.Test
    public void deleteFile() {
        Assert.assertEquals(test.findFile(test.getROOT(),"fa").getName() , "fa");
        test.deleteFile("fa");
        Assert.assertNull(test.findFile(test.getROOT(),"fa"));
    }

    @org.junit.Test
    public void addFile() {
        Assert.assertNull(test.findFile(test.getROOT(),"ft"));
        test.addFile("d", "ft", 123, "asd");
        Assert.assertNotNull(test.findFile(test.getROOT(),"ft"));

    }

    @org.junit.Test()
    public void addDir() {
        Assert.assertNull(test.findDirectory(test.getROOT(),"test"));
        test.addDir("ROOT", "test", "asd");
        Assert.assertNotNull(test.findDirectory(test.getROOT(),"test"));
    }

    @org.junit.Test
    public void main() {

    }
}