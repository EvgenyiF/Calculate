package mypack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
    String log(String scaner) throws IOException {
        File output = new File("log.txt");
        FileWriter writer = new FileWriter(output,true);

        writer.write(String.valueOf(scaner));
        writer.write("\n");
        writer.flush();
        writer.close();

        return scaner;
    }
}
