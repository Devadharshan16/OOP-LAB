abstract class DataProcessor {
    public final void process() {
        fetchData();
        processData();
        saveData();
    }

    abstract void fetchData();
    abstract void processData();
    void saveData() {
        System.out.println("Data saved to default location.");
    }
}

class CSVDataProcessor extends DataProcessor {
    @Override
    void fetchData() {
        System.out.println("Fetching CSV data...");
    }

    @Override
    void processData() {
        System.out.println("Processing CSV data...");
    }

    @Override
    void saveData() {
        System.out.println("CSV data saved to /csv/output.csv");
    }
}

public class CSVDataProcessorExample {
    public static void main(String[] args) {
        DataProcessor processor = new CSVDataProcessor();
        processor.process();
    }
}