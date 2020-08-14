package swingProject.json;

import com.google.gson.GsonBuilder;
import swingProject.entities.computerComponents.PowerSupply;

import java.sql.SQLOutput;

public class Gson {
    private static final com.google.gson.Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {

        PowerSupply powerSupply = new PowerSupply("Chiftec", "Chiftec650", 2012, 650, true, false);
        String json = GSON.toJson(powerSupply);
        System.out.println(json);
        System.out.println();

        System.out.println("Обратная конвертация:");

        PowerSupply powerSupply1 = GSON.fromJson(json, PowerSupply.class);
        System.out.println(powerSupply1);
    }
}
