package behavioral.strategy.example_1;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeStrategy implements Strategy{
    @Override
    public void save(Bean bean) {
        try {
            final ObjectOutput out = new ObjectOutputStream(
                    new FileOutputStream(BundleUtils.getOutputDir()+"/bean.ser"));
            out.writeObject(bean);
            out.close();
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}
