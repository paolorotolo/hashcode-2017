import java.util.HashMap;

public class CacheServer {
    HashMap<Integer, Endpoint> endpointLatency = new HashMap<>();
    int size;
    int id;

    public CacheServer(HashMap<Integer, Endpoint> endpointLatency, int size) {
        this.endpointLatency = endpointLatency;
        this.size = size;
    }

    public CacheServer(int id) {
        this.id = id;
    }
}
