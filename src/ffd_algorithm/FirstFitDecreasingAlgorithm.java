package ffd_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author William
 */
public class FirstFitDecreasingAlgorithm {

    private List<Bin> bins = new ArrayList<Bin>();
    private List<Integer> items;
    private int binCapacity;
    private int binCounter = 1;

    public FirstFitDecreasingAlgorithm(List<Integer> items, int binCapacity) {
        this.items = items;
        this.binCapacity = binCapacity;
    }

    public void solveBinPackingProblem() {

        Collections.sort(items, Collections.reverseOrder());

        if (this.items.get(0) > this.binCapacity) {
            System.out.println("No feasible Solution");
            return;
        }

        this.bins.add(new Bin(binCapacity, binCounter)); //First bin

        for (Integer currentItem : items) {
            boolean isOK = false; // track wether we have put the item into a bin or not
            int currentBin = 0;

            while (!isOK) {
                if (currentBin == this.bins.size()) { // Item does not fit in the last bin -> try a new bin
                    Bin newBin = new Bin(binCapacity, ++binCounter);
                    newBin.put(currentItem);
                    this.bins.add(newBin);
                    isOK = true;
                } else if (this.bins.get(currentBin).put(currentItem)) // current item fits in the current bin 
                {
                    isOK = true;
                }
                else{
                    currentBin++; // trying the next bin
                }
            }
        }
    }
    
    public void showResults(){
        for (Bin bin : this.bins) {
            System.out.println(bin);
        }
    }
}
