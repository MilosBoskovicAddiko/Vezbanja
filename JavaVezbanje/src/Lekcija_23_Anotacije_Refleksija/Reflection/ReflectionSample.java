package Lekcija_23_Anotacije_Refleksija.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionSample {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Lekcija_23_Anotacije_Refleksija.Reflection.Employee");
            Method[] methods = c.getDeclaredMethods();
            System.out.println("The Employee methods: ");

            for (int i = 0; i < methods.length; i++) {
                System.out.println("***Method signature: " + methods[i].toString());
            }

            System.out.println("----------------------------------------------------------");

            Class superClass = c.getSuperclass();
            System.out.println("The name of the superclass is  " + superClass.getName());

            Method[] superMethods = superClass.getDeclaredMethods();
            System.out.println("The superclass methods: ");

            for (int i = 0; i < superMethods.length; i++) {
                System.out.println("***Method signature: " + superMethods[i].toString());
                System.out.println("***Return type: " + superMethods[i].getReturnType().getName());
            }

            System.out.println("----------------------------------------------------------");

            Field[] fields = c.getDeclaredFields();
            Object obj = new Employee("Milos", "Boskovic", "H.Veljkova 60", 28);
            for (int i = 0; i < fields.length; i++) {
                String name = fields[i].getName();
                String type = fields[i].getType().getName();

                Object value = fields[i].get(obj);
                System.out.println("Field name: " + name + "\nType: " + type + "\nValue: " + value.toString());
                System.out.println("----------------------------------------------------------");
            }

            Class[] parameterTypes = new Class[] {String.class};
            Method myMethod = c.getMethod("changeAddress", parameterTypes);
            Object[] arguments = new Object[1];
            arguments[0] = "Safarikova 9";
            myMethod.invoke(obj,arguments);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
