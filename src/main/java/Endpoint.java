import java.util.HashMap;

public class Endpoint {
    int dataCenterLatency;
    int id;
    HashMap<Integer, Integer> cacheServerLatency = new HashMap<>();
    HashMap<Integer, Integer> videoRequests = new HashMap<>();

    public HashMap<Integer, Integer> getCacheServerLatency() {
        return cacheServerLatency;
    }

    public Endpoint(int dataCenterLatency, int id) {
        this.dataCenterLatency = dataCenterLatency;
        this.id = id;
    }
    public void addLatency(int id, int latency) {
        cacheServerLatency.put(id, latency);
    }

    public void addRequests(int videoId, int requests){
        videoRequests.put(videoId, requests);
    }

}
