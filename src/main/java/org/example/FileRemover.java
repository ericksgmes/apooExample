package org.example;

import java.util.Objects;

public final class FileRemover {
    public void remove(FileSystem node) {
        Objects.requireNonNull(node, "node cannot be null");
        node.delete();
    }
}
