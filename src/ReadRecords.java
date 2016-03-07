import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadRecords {
    private final String fileName;

    public ReadRecords(String file) {
        this.fileName = file;
    }

    public List readGuest() throws IOException {
        BufferedReader readBuffer;
        List<ArrayList<String>> list = new ArrayList<>();
        String eachLine;
        readBuffer = new BufferedReader(new FileReader(this.fileName));
        while ((eachLine = readBuffer.readLine()) != null)
            list.add(crunchifyArrayList(eachLine));
        return list;
    }

    private ArrayList<String> crunchifyArrayList(String crunchifyString) {
        ArrayList<String> crunchifyResult = new ArrayList<>();
        if (crunchifyString != null) {
            String[] splitData = crunchifyString.split(",");
            Collections.addAll(crunchifyResult, splitData);
        }
        return crunchifyResult;
    }
}
