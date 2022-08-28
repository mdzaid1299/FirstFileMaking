import java.io.File;
import java.io.IOException;
public class filer {
    public static void main(String[] args) {
        try {
            File obj1 = new File("3rdOne.txt");
            obj1.createNewFile();
                System.out.println("file created = " + obj1.getName());
                System.out.println(" path " + "= " + obj1.getPath());
//           } else {
//                System.out.println("diktat aa agi");

        } catch (IOException e) {
            System.out.println("error hai");
            e.printStackTrace();
        }
    }
}
