package org.example;

import java.nio.charset.StandardCharsets;

public final class File implements FileSystem {
    private final String filename;
    private final String contents;

    public File(String filename, String contents) {
        if (filename == null) {
            throw new IllegalArgumentException("filename cannot be null");
        }
        this.filename = filename;
        this.contents = contents;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + filename);
    }

    @Override
    public void printStructure() {
        System.out.println("File: " + filename);
    }

    public void printContents() {
        System.out.println("\nContents of: " + filename + ": " + contents);
        System.out.print("\n");
    }

    public int getSize() {
        int nameBytes = filename.getBytes(StandardCharsets.UTF_8).length;
        int contentBytes = contents != null
                ? contents.getBytes(StandardCharsets.UTF_8).length
                : 0;
        return nameBytes + contentBytes;
    }

    @Override
    public void printSize() {
        System.out.println("File: " + filename + " [size=" + getSize() + " bytes]");
    }
}
