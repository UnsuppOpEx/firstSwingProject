package swingProject.json;

import org.json.JSONException;
import org.json.JSONObject;
import swingProject.entities.computerComponents.PowerSupply;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;

public class JsonTest {

    private String path = "jsonFile";
    private FileWriter writer;
    private JSONObject object;

    public JsonTest() {

        try {
            File jsonFile = new File(path);
            String jsonText = new String(Files.readAllBytes(jsonFile.toPath()));
            System.out.println(jsonText);
            object = new JSONObject(jsonText);

//            Iterator<String> iterator = object.keys();
//
//            System.err.println("-----------------------------------------");


        } catch (IOException | JSONException e) {
            System.err.println("Ошибка чтения фала: " + path);
            createNewFile();
            object = new JSONObject();
        }
    }

    public JSONObject getObject() {
        return object;
    }

    public void addComponent(PowerSupply powerSupply) {

//        String year = String.valueOf(component.getYearRelease());
//        String watt = String.valueOf(component.getNominalWatt());

//        object.put(); //TODO Узнать назначение

//        writeJSONObject();

    }

    private void createNewFile() {

        File f = new File(path);
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.err.println("Ошибка создания файла: " + path);
        }
        System.err.println("Создан новый файл: " + path);

    }

    private void writeJSONObject() {

        try {

            writer = new FileWriter(path);
            writer.write(object.toString());
            writer.flush();
            writer.close();

        } catch (IOException e) {
            System.err.println("Ошибка записи сотояния видимости абонента в файл: " + path);
        }

    }

    public static void main(String[] args) {

        JsonTest jsonTest = new JsonTest();

//        jsonTest.addComponent(
//                new PowerSupply("Chiftec", "Chiftec650", 2012, 650, true, false)
//        );

//        jsonTest.addComponent(
//                new PowerSupply("Chiftec", "Chiftec650", 2012, 650, true, false)
//        );
//
//        jsonTest.addComponent(
//                new PowerSupply("Chiftec", "Chiftec650", 2012, 650, true, false)
//        );
//
//        Iterator<String> iterator = jsonTest.object.keys();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

    }

}
