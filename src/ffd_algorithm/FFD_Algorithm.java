
package ffd_algorithm;

import java.util.Arrays;
import java.util.List;

public class FFD_Algorithm {

    public static void main(String[] args) {
        
        MainJFrame main = new MainJFrame();
        main.setVisible(true);
        
    }
    
    public static void calcular(Integer arr[], int capacidad){
        List<Integer> items = Arrays.asList(arr);
        int binCapacity=capacidad;
        
        FirstFitDecreasingAlgorithm algorithm = new FirstFitDecreasingAlgorithm(items,binCapacity);
        algorithm.solveBinPackingProblem();
        algorithm.showResults();
    }
    
}
