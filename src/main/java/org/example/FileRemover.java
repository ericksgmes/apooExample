package org.example;

public final class FileRemover {
    public void remove(FileSystem node) {
        if (node == null) {
            throw new IllegalArgumentException("node cannot be null");
        }
        node.delete();
    }
}
