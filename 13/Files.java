import java.io.File;
import java.util.ArrayList;

public class Files {
    public void printFiles(File file){
        if(file.isDirectory()){
            System.out.println(file);
            // ArrayList<File> folder=new ArrayList<File>();
            // folder.add(file);
            File[] files = file.listFiles();
            for (File f: files){
                printFiles(f);
            }
        }
        else{
            System.out.println(file);
        }
    }
    //saunders version
    public void printFiles2(File file){
        System.out.println(file);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f: files){
                printFiles(f);
            }
        }
    }
    public ArrayList<File> getFiles(File file){
        ArrayList<File> allFiles=new ArrayList<File>();
        allFiles.add(file);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f: files){
                getFiles(f);
            }
        }
        ArrayList<File> allFilesFinal=new ArrayList<File>();
        for (int i=0;i<allFiles.size();i++){
            allFilesFinal.add(allFiles.get(i));
        }
        return allFilesFinal;
    }
    public  ArrayList<File> getFiles2(File file)
    {
        ArrayList<File> filelist = new ArrayList<File>();
        filelist.add(file);
        File[] files = file.listFiles();
       if (files != null) {
           for (File f : files)
           {
               ArrayList<File> filelist2 = getFiles2(f);
               for (File f2 : filelist2)
               {
                   filelist.add(f2);
               }
           }
       }
        return filelist;
    }
    public static void main(String[] args){
        String path = "/Users/amark/Library/CloudStorage/OneDrive-SharedLibraries-MemphisUniversitySchool/Jonathan Saunders - Amar Kanakamedala";
  		File file = new File(path);
        Files test= new Files();
        // test.printFiles(file);
        ArrayList<File> files=test.getFiles2(file);
        for (int i=0;i<files.size();i++){
            System.out.println(files.get(i));
        }
    }
}
