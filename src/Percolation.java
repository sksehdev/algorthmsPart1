import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {
    private int sites [][];
    private int gridSize;
    public Percolation(int n)  {
        gridSize = n;
        sites = new int[n + 1][n + 1];
        for(int i = 1; i < n + 1;i++){
           for(int j = 1;j < n + 1;j++){
               sites[i][j] = 1;
           }
        }
    }// create n-by-n grid, with all sites blocked

    private int[][] getSites(){
        return sites;
    }

    public void open(int row, int col){
        if (sites[row][col] == 1){
            sites[row][col] = 2;
        }
    }    // open site (row, col) if it is not open already
    public boolean isOpen(int row, int col) {
        return sites[row][col] == 2;
    } // is site (row, col) open?

    public boolean isFull(int row, int col) {
       WeightedQuickUnionUF uf = new WeightedQuickUnionUF(gridSize);

    } // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
//
   public static void main(String[] args){
      Percolation p = new Percolation(5);
      p.open(1,2);
      p.getSites();
      boolean a = p.isOpen(1,1);
      System.out.print(a);
   }   // test client (optional)
}
