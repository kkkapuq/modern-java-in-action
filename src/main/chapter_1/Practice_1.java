package chapter_1;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Predicate;

public class Practice_1 {
    public static void main(String[] args) {

        // This code is able to convert with method reference
//        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isHidden();
//            }
//        });

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);
    }
}
