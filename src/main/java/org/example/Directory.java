package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Directory implements FileSystem {
    private final String directoryName;
    private final List<FileSystem> children = new ArrayList<>();

    public Directory(String directoryName) {
        if (directoryName == null) {
            throw new IllegalArgumentException("directoryName cannot be null");
        }
        this.directoryName = directoryName;
    }

    @Override
    public void delete() {
        System.out.println("Deleting directory " + directoryName + ":");
        for (FileSystem child : children) {
            child.delete();
        }
    }

    @Override
    public void printStructure() {
        System.out.println(directoryName + "/");
        for (FileSystem child : children) {
            child.printStructure();
        }
    }

    public void add(FileSystem... nodes) {
        children.addAll(Arrays.asList(nodes));
    }
}
