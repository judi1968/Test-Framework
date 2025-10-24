// fichier : judi/package/Main.java
package judi;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import judi.annotation.Controller;
public class Main {
    public static void main(String[] args) throws Exception {
        List<Class<?>> classes = findClassesWithAnnotation("judi", Controller.class);
        System.out.println("Classes annote avec @Controller :");
        for (Class<?> cls : classes) {
            System.out.println(cls.getName());
        }
    }

    public static List<Class<?>> findClassesWithAnnotation(String packageName, Class<Controller> annotationClass) throws Exception {
        List<Class<?>> result = new ArrayList<>();
        String path = packageName.replace('.', '/');
        URL packageURL = Thread.currentThread().getContextClassLoader().getResource(path);
        if (packageURL == null) return result;
        File folder = new File(packageURL.toURI());
        File[] files = folder.listFiles();
        if (files == null) return result;

        for (File file : files) {
            if (file.isDirectory()) {
                result.addAll(findClassesWithAnnotation(packageName + "." + file.getName(), annotationClass));
            } else if (file.getName().endsWith(".class")) {
                String className = packageName + "." + file.getName().replace(".class", "");
                Class<?> cls = Class.forName(className);
                if (cls.isAnnotationPresent(annotationClass)) {
                    result.add(cls);
                }
            }
        }
        return result;
    }
}