package creational.factorymethod.example_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        SortAlgorithmManager.getSortingAlgorithm(SortAlgorithmType.BUBBLE).sort(new int[]{1, 2, 5, 2});
        SortAlgorithmManager.getSortingAlgorithm(SortAlgorithmType.SELECTION).sort(new int[]{1, 2, 5, 2});
        SortAlgorithmManager.getSortingAlgorithm(SortAlgorithmType.INSERTION).sort(new int[]{1, 2, 5, 2});
    }
}
