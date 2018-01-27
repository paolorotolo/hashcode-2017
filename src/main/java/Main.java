import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<CacheServer> cacheServers = new ArrayList<>();

    public static void main(String[] args) {
        int nVideo;
        int nEndpoints;
        int nRequests;
        int nCacheServer;
        int sizeCacheServer;
        DataCenter dataCenter = new DataCenter();
        List<Endpoint> endpoints = new ArrayList<>();
        String name = "/home/paolorotolo/Downloads/qualification_round_2017.in/streaming/me_at_the_zoo.in.txt";
        DataInputStream fileReader;
            try {
                /*fileReader = new DataInputStream(new FileInputStream(name));

                nVideo =  fileReader.readInt();
                nEndpoints = fileReader.readInt();
                nRequests = fileReader.readInt();
                nCacheServer = fileReader.readInt();
                sizeCacheServer = fileReader.readInt();
                   */
                BufferedReader bufferedReader = new BufferedReader(new FileReader(name));
                String line = bufferedReader.readLine();
                System.out.println(line);
                String[] split = line.split(" ");
                nVideo =Integer.parseInt(split[0]);
                nEndpoints = Integer.parseInt(split[1]);
                nRequests = Integer.parseInt(split[2]);
                nCacheServer = Integer.parseInt(split[3]);
                sizeCacheServer = Integer.parseInt(split[4]);
                System.out.println(nVideo+" / "+nEndpoints+" / "+nRequests+" / "+nCacheServer+" / "+" / "+sizeCacheServer);

                line = bufferedReader.readLine();
                //seconda linea, video con rispettiva dimensione
                Scanner scanner = new Scanner(line);
                for(int i = 0; i<nVideo; i++){
                 dataCenter.addVideo(scanner.nextInt());
                }
                for(int i = 0; i<nEndpoints; i++){
                    line = bufferedReader.readLine();
                    scanner = new Scanner(line);
                    int latenza = scanner.nextInt();
                    Endpoint endpoint = new Endpoint(latenza,endpoints.size());
                    int nCache = scanner.nextInt();
                    for (int k=0; k<nCache; k++){
                        line = bufferedReader.readLine();
                        scanner = new Scanner(line);
                        int idCache = scanner.nextInt();
                        int latency = scanner.nextInt();
                        endpoint.addLatency(idCache,latency);

                    }
                    endpoints.add(endpoint);
                }


                for (int i = 0; i<nRequests; i++){
                    line = bufferedReader.readLine();
                    scanner = new Scanner(line);

                    int videoId = scanner.nextInt();
                    int endpointId = scanner.nextInt();
                    int requests = scanner.nextInt();

                    Endpoint endpoint = endpoints.get(endpointId);
                    endpoint.addRequests(videoId, requests);
                }




            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
    public void addCacheServer(){
        int id = cacheServers.size();
        cacheServers.add(new CacheServer(id));
    }

}
