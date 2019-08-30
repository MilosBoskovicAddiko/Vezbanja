package Lekcija_33.JavaToJsonObject;

import Lekcija_33.JavaToJsonStream.Product;

import javax.json.*;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class JavaToJsonObject {
    public static void main(String[] args) {

        Product prd1 = new Product(777,"Gucci Handbag",1000.0);

        /*try (OutputStream fos = new FileOutputStream("product_from_object.json");
             JsonWriter jsonWriter = Json.createWriter(fos);) {

            JsonObjectBuilder prdBuilder = Json.createObjectBuilder();
            prdBuilder.add("id", prd1.id)
                      .add("description", prd1.description)
                      .add("price", prd1.price);
            JsonObject prdJsonObject = prdBuilder.build();
            System.out.println("prdJsonObject: " + prdJsonObject);
            jsonWriter.writeObject(prdJsonObject);

            // Ocitavanje i analiziranje novokreirane datoteke
            JsonReader jsonReader= Json.createReader(new FileReader("product_from_object.json"));
            JsonObject jsonObject = jsonReader.readObject();
            System.out.println(jsonObject);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }*/

        try (OutputStream fos = new FileOutputStream("product_from_object.json");
             JsonWriter jsonWriter = Json.createWriter(fos);) {

            JsonObjectBuilder prdBuilder = Json.createObjectBuilder();
            prdBuilder.add("id",prd1.id)
                      .add("description",prd1.description)
                      .add("price", prd1.price);
            JsonObject prdJsonObject = prdBuilder.build();
            System.out.println("prdJsonObject: " + prdJsonObject);
            jsonWriter.writeObject(prdJsonObject);

            JsonReader jsonReader = Json.createReader(new FileReader("product_from_object.json"));
            JsonObject jsonObject = jsonReader.readObject();
            System.out.println(jsonObject);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
