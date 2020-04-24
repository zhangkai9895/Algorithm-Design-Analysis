package SingleSource;

public class Main {
    public static void main(String[] args){
        int vnum =5;
        Graph graph =new Graph(vnum);
        Edge[] edges = new Edge[10];
        edges[0] = new Edge(0,1,6);
        edges[1] = new Edge(0,3,7);
        edges[2] = new Edge(1,2,5);
        edges[3] = new Edge(1,3,8);
        edges[4] = new Edge(1,4,-4);
        edges[5] = new Edge(2,1,-2);
        edges[6] = new Edge(3,2,-3);
        edges[7] = new Edge(3,4,9);
        edges[8] = new Edge(4,0,2);
        edges[9] = new Edge(4,2,7);
        for(int i = 0;i<10;i++){
            graph.insertEdge(edges[i]);
        }
        graph.Show();
        boolean success = graph.BELLMAN_FORD(0);
        if(success){
            graph.showResults();
        }else {
            System.out.println("存在负环");
        }
    }
}
