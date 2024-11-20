package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Directory directory1 = new Directory("Documents");
        Directory directory2 = new Directory("Photos");

        directory1.addComponent(file1);
        directory1.addComponent(file2);

        directory2.addComponent(file3);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.showDetails();
    }
}
