package Lekcija_23_Anotacije_Refleksija.HRBrowser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyJDBCExecutor {
    String sqlStatement();
}