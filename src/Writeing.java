import java.io.FileWriter;
import java.io.IOException;

public class Writeing {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("natraj.pdf");
            fileWriter.write("soni gadi wale bahiya");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
