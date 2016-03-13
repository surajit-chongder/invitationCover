package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private final String file;

    public Reader(String fileName) {
        this.file = fileName;
    }

    public List<String> read() throws IOException {
        List<String> list = new ArrayList<>();
        String eachLine;
        BufferedReader readBuffer = new BufferedReader(new FileReader(file));
        while ((eachLine = readBuffer.readLine()) != null)
            list.add(eachLine);
        return list;
    }
}
