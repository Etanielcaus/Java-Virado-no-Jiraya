package academy.devdojo.devdojoacademy.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatchTest01 {
    public static void main(String[] args) {

        Path path = Paths.get("/pasta2/subpasta/file.txt");
        Path path1 = Paths.get("/pasta2/subpasta/file.java");
        Path path2 = Paths.get("/pasta2/subpasta/file.bkp");

        matches(path, "glob:**.txt");
        matches(path, "glob:**/*.txt");
        matches(path, "glob:**/*.{bko,txt,java}");
        matches(path, "glob:**/*.???");
        matches(path, "glob:file.???");
    }
    private static void matches(Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " -> " + pathMatcher.matches(path));
    }
}
