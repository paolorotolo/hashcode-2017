import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataCenter {
    List<Video> videos = new ArrayList<>();

    public DataCenter() {
    }

    public void addVideo(int size){
        int id = videos.size();
        System.out.println("added video  " + id + " with size "+ size);

        videos.add(new Video(id,size));
    }

}
