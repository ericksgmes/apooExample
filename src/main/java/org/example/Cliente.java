package org.example;

public final class Cliente {
    public void rmrf(FileSystem node) {
        if (node == null) {
            throw new IllegalArgumentException("node cannot be null");
        }
        node.delete();
    }
}
