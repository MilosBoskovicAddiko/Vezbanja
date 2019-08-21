package Lekcija_23_Anotacije_Refleksija.TryIt;

public class DBParamProcessor {

    public static void main(String[] args) {

        String anotatedClass = "Lekcija_22.TryIt.MyDBWorker";

        try {
            Class classForIntrospection = Class.forName(anotatedClass);
            DBParam dbParamAnnotation = (DBParam) classForIntrospection.getAnnotation(DBParam.class);

            System.out.println("DB Name: " + dbParamAnnotation.dbName());
            System.out.println("User ID: " + dbParamAnnotation.uid());
            System.out.println("Password: " + dbParamAnnotation.password());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
