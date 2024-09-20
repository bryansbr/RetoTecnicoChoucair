package co.com.screenplay.project.utils;

import java.io.File;

public class Files {
    private Files() {}

    private static final String PATH = new File("").getAbsolutePath();

    public static String getFilePath(String nameFile) {
        String pathResources = PATH + "/src/test/resources/files/";
        return pathResources + nameFile;
    }
}
