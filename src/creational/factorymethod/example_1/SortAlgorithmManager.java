package creational.factorymethod.example_1;

import structural.decorator.example_3.I;

import static creational.factorymethod.example_1.SortAlgorithmType.*;
import static creational.factorymethod.example_1.SortAlgorithmType.SELECTION;

public class SortAlgorithmManager {
    // Factory method
    public static SortingAlgorithm getSortingAlgorithm(SortAlgorithmType sortAlgorithmType){
        switch(sortAlgorithmType) {
            case BUBBLE:
                return new BubbleSort();
            case SELECTION:
                return new SelectionSort();
            case INSERTION:
                return new InsertionSort();
            default:
                throw new UnsupportedOperationException("This algorithm not support");
        }
    }
}
