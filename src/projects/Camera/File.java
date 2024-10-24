package projects.Camera;

public class File {
    private String fileName;
    private int fileSize;
    private long dateofOrigin;

    public File(String fileName, int fileSize, long dateofOrigin) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.dateofOrigin = dateofOrigin;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public long getDateofOrigin() {
        return dateofOrigin;
    }

    public void setDateofOrigin(long dateofOrigin) {
        this.dateofOrigin = dateofOrigin;
    }

    public String getFileName() {
        return fileName;
    }
}