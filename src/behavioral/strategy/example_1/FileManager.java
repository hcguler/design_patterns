package behavioral.strategy.example_1;

import java.util.ResourceBundle;

public class FileManager {
    private Strategy strategy;
    public static final FileManager manager = new FileManager();
    private FileManager() {
        final String strategy =
                ResourceBundle.getBundle(
                        "behavioral/strategy/example_1/app")
                        .getString("strategy");
        try {
            setStrategy(((Strategy) Class.forName(
                    strategy).newInstance()));
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static FileManager instance() {
        return manager;
    }
    public Strategy getStrategy() {
        return strategy;
    }
    public void setStrategy(final Strategy strategy) {
        this.strategy = strategy;
    }
    public void saveBean(final Bean bean) {
        getStrategy().save(bean);
    }
}
