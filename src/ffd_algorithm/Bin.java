package ffd_algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William
 */
public class Bin {

    private int id;
    private int capacity;
    private int currentSize;
    private List<Integer> items;

    public Bin(int capacity, int id) {
        this.capacity = capacity;
        this.id = id;
        this.items = new ArrayList<Integer>();
    }

    public boolean put(Integer item) {

        if (this.currentSize + item > this.capacity) {
            return false;
        }

        this.items.add(item);
        this.currentSize += item;

        return true;
    }

    public String toString() {
        String contentOfBin = "Items in bin #" + this.id + ": ";
        Integer cont = 0, sum = 0;
        Double aprov;
        for (Integer item : this.items) {
            cont++;
            sum += item;
        }
        aprov = Math.round((Double.valueOf(sum) * 100) / Double.valueOf(this.capacity)) / 1.0;

        for (Integer item : this.items) {
            contentOfBin += item + " ";
        }
        return contentOfBin + cont + "pzs. " + " - aprov " + aprov + "%";
    }

}
