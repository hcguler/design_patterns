package behavioral.strategy.example_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class BeanToFileStrategy implements Strategy {
    @Override
    public void save(Bean bean) {
        try {
            final StringBuilder temp = new StringBuilder();
            temp.append("counter: ").append(
                    bean.getCounter()).append("\n");
            temp.append("name: ").append(
                    bean.getName()).append("\n");
            File file = new File(BundleUtils.getOutputDir()+"/bean.txt");
            if (file.exists()) {
                file.delete();
                file = new File(BundleUtils.getOutputDir()+"/bean.txt");
            }
            Writer output = null;
            try {
                output = new BufferedWriter(
                        new FileWriter(file));
                output.write(temp.toString());
            } finally {
                if (output != null) {
                    output.close();
                }
            }
            System.out.println("bean.txt oluşturuldu.");
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

}
