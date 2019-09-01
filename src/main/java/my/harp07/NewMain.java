
package my.harp07;

import java.io.File;

public class NewMain {

    public static void main(String[] args) {
        String [] dirlist=new File("rename").list();
        System.out.println(dirlist);
        int j=999;
        for (String name: dirlist) {
            File ff=new File("rename/" + name);
            ff.renameTo(new File("rename/" + j + ".jar"));
            System.out.println("rename/" + name + " to rename/" + j + ".jar");
            j--;
        }
    }
    
}
