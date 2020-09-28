package behavioral.strategy.example_1;

import java.util.ResourceBundle;

public class BundleUtils {
    public static String getOutputDir(){
        return ResourceBundle.getBundle(
                "behavioral/strategy/example_1/app")
                .getString("outputdir");
    }
    public static String getStrategy(){
        return ResourceBundle.getBundle(
                "behavioral/strategy/example_1/app")
                .getString("strategy");
    }
}
