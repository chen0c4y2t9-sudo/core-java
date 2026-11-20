package homework.test3;

import java.lang.reflect.Method;

public class RunMethodDemo {

    public static void main(String[] args) throws Exception {

        Class<Task> clazz = Task.class;
        Task task = clazz.getDeclaredConstructor().newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunMethod.class)) {
                System.out.print("[" + method.getName() + "] ");
                method.invoke(task);
            }
        }
    }
}
