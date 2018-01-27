import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {
    FileReader fileReader;

    Reader(String name){
        try {
            fileReader = new FileReader(name);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
