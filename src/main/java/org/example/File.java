package org.example;

public final class File implements FileSystem {
    private final String filename;

    public File(String filename) {
        if (filename == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        this.filename = filename;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + filename);
    }
}
