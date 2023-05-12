import java.io.*;
import java.util.*;

public class DirectoryPrint {

   public static void main(String[] args) {
   
      String path = "D:\\pixUpload\\2022";
  		File file = new File(path);
		File[] files = file.listFiles();
      for (File f : files) {
      	System.out.println(f.getPath().replace(path + "\\", ""));
      }

   }

}