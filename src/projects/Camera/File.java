package projects.Camera;

public class File {
    public enum size {
        small,
        medium,
        large
    }

    private String fileName;
    private size fileSize;
    private long dateofOrigin;

    public File(String fileName, size fileSize, long dateofOrigin) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.dateofOrigin = dateofOrigin;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public size getFileSize() {
        return fileSize;
    }

    public void setFileSize(size fileSize) {
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