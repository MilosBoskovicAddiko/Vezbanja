package Lekcija_33.JavaToJsonStream;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaToJsonStreaming {
    public static void main(String[] args) {

        Product prd1 = new Product(777, "Gucci Handbag", 1000.0);

       /* try (OutputStream fos = new FileOutputStream("product_from_stream.json");
             JsonGenerator jsonGenerator = Json.createGenerator(fos);){

            jsonGenerator.writeStartObject();
            jsonGenerator.write("id", prd1.id);
            jsonGenerator.write("description", prd1.description);
            jsonGenerator.write("price",prd1.price);
            jsonGenerator.writeEnd();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }*/

       try (OutputStream fos = new FileOutputStream("product_from_stream.json");
            JsonGenerator jsonGenerator = Json.createGenerator(fos);) {

           jsonGenerator.writeStartObject();
           jsonGenerator.write("id", prd1.id);
           jsonGenerator.write("description", prd1.description);
           jsonGenerator.write("price", prd1.price);
           jsonGenerator.writeEnd();
       } catch (IOException ioe) {
           ioe.printStackTrace();
       }
    }
}
