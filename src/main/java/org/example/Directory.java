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
        System.out.println("\nDeleting directory " + directoryName + ":");
        for (FileSystem child : children) {
            System.out.print("  ");
            child.delete();
        }
        System.out.print("\n");
    }

    @Override
    public void printStructure() {
        System.out.println("\nPrinting structure of directory " + directoryName + ":");
        for (FileSystem child : children) {
            System.out.print("  ");
            child.printStructure();
        }
        System.out.print("\n");
    }

    @Override
    public void printSize() {
        System.out.println("\nDirectory: " + directoryName + " [total size=" + getSize() + " bytes]");
        for (FileSystem child : children) {
            System.out.print("  ");
            child.printSize();
        }
        System.out.print("\n");
    }

    public int getSize() {
        int total = 0;
        for (FileSystem child : children) {
            if (child instanceof Directory) {
                total += ((Directory) child).getSize();
            } else if (child instanceof File) {
                total += ((File) child).getSize();
            }
        }
        return total;
    }

    public void add(FileSystem... nodes) {
        children.addAll(Arrays.asList(nodes));
    }
}
