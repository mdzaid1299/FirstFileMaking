import java.io.File;
import java.io.IOException;

public class pcFiler {
    public static void main(String[] args) {
        try {
            File obj2 = new File("natraj.pdf");
            System.out.println("obj2 = " + obj2);
            if (obj2.createNewFile()) {
                System.out.println("'file ban gai' = " + obj2.getName());
            } else {
                System.out.println("pahale se hai");

            }
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("am error hai");
            e.printStackTrace();

        }
    }
}
