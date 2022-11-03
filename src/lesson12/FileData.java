package lesson12;

public class FileData {
    private final String name;
    private final int sizeBytes;
    private final String filePath;

    public FileData(String name, int sizeBytes, String filePath) {
        this.name = name;
        this.sizeBytes = sizeBytes;
        this.filePath = filePath;
    }

    public int getSizeBytes() {
        return sizeBytes;
    }

    public String getFilePath() {
        return filePath;
    }

}
