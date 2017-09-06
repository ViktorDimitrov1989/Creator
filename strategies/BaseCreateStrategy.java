package app.strategies;

import java.io.File;

abstract class BaseCreateStrategy implements CreateStrategy{

    protected BaseCreateStrategy() {
    }

    protected static String getPackage(File file) {
        return file.getParentFile().getPath()
                .replace(System.getProperty("user.dir") + "\\src\\main\\java\\", "")
                .replace("\\", ".");
    }
}
