package org.example.composite;

import java.util.Objects;

public final class FileRemover {
    public void remove(FileSystem node) {
        Objects.requireNonNull(node, "node cannot be null");
        node.delete();
    }
}
