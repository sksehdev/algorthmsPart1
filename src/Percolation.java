import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
public class Percolation {

    public Percolation(int n)  {
        int sites [];
        sites = new int[n];
        for(int i = 0; i < n;i++){
           sites[i] = i + 1;
        }

    }              // create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)    // open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)  // is site (row, col) open?
//    public boolean isFull(int row, int col)  // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
//
   public static void main(String[] args){
      Percolation p = new Percolation(5);
      System.out.print(p);
   }   // test client (optional)
}
