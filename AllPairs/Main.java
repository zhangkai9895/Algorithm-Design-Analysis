package AllPairs;

public class Main {
    private static int INF = Integer.MAX_VALUE;
    private int[][] dist;

    public Main(int size){
        this.dist=new int[size][size];
    }

    public void floyd(int[][] matrix){
        int size = matrix.length;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                dist[i][j]=matrix[i][j];
            }
        }

        for(int k=0;k<size;k++){
            for(int i=0;i<size;i++){
                for (int j=0;j<size;j++){
                    if(dist[i][k]!=INF&&
                            dist[k][j]!=INF&&
                            dist[i][k]+dist[k][j]< dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
        }

    }


    public static void main(String[] args){
        Main graph = new Main(5);
        int[][] matrix ={
                {0,3,8,INF,-4},
                {INF,0,INF,1,7},
                {INF,4,0,INF,INF},
                {2,INF,-5,0,INF},
                {INF,INF,INF,6,0},
        };
        graph.floyd(matrix);
        for(int i=0;i<graph.dist.length;i++){
            for (int j=0;j<graph.dist[i].length;j++){
                System.out.print(graph.dist[i][j]+"\t");
            }
            System.out.println();
        }
    }





}
