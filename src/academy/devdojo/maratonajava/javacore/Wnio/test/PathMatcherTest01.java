package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        mathces(path1, "glob:*.bkp");
        mathces(path1, "glob:**.bkp");
        mathces(path1, "glob:**.{bkp,txt,java}");
        mathces(path2, "glob:**.{bkp,txt,java}");
        mathces(path3, "glob:**.{bkp,txt,java}");
        mathces(path1, "glob:**.???");
        mathces(path2, "glob:**.???");
        mathces(path3, "glob:**.???");
        mathces(path3, "glob:**/file.???");
        mathces(path3, "glob:**/file.????");
    }
    private static void mathces(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
