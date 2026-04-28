package Step8.lesson6;

public class Main {

    public static void main(String[] args) {

        Directory root = new Directory("root");

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory subDir1 = new Directory("subDir1");
        subDir1.add(new File("file3.txt"));
        subDir1.add(new File("file4.txt"));

        Directory subDir2 = new Directory("subDir2");
        subDir2.add(new File("file5.txt"));

        root.add(file1);
        root.add(file2);
        root.add(subDir1);
        root.add(subDir2);

        root.display("");
    }
}