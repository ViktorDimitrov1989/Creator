package app.strategies;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import static app.constants.ClassTemplates.ADD_DTO_CLASS_TEMPLATE;

public class AddDto extends BaseCreateStrategy implements CreateStrategy {

    @Override
    public void execute(List<Class<?>> classes, String destinationPackagePath)
            throws IOException,
            InvocationTargetException,
            ClassNotFoundException,
            InstantiationException,
            NoSuchMethodException,
            IllegalAccessException {
        createAddDtos(classes, destinationPackagePath);
    }

    private static void createAddDtos(List<Class<?>> files, String destinationPackagePath) throws IOException {
        File directoryService = new File(destinationPackagePath + File.separator + "dto" + File.separator + "add");
        if (!directoryService.exists()) {
            directoryService.mkdirs();
        }

        for (Class<?> clazz : files) {
            createAddDtosImplementation(clazz, directoryService.getPath());
        }
    }

    private static void createAddDtosImplementation(Class<?> clazz, String path) throws IOException {
        File service = new File(path + File.separator + "Add" + clazz.getSimpleName() + "Dto.java");
        if (service.exists()) {
            return;
        }
        service.createNewFile();

        try (PrintWriter printWriter = new PrintWriter(service)) {
            printWriter.println(String.format(ADD_DTO_CLASS_TEMPLATE,
                    clazz.getSimpleName(),
                    getPackage(service)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
