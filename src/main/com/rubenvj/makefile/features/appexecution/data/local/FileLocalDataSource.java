package main.com.rubenvj.makefile.features.appexecution.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import main.com.rubenvj.makefile.features.appexecution.domain.AppExecution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;

public class FileLocalDataSource {
    private String nameFile = "appconfig.txt";

    private Gson gson = new Gson();

    private final Type type = new TypeToken<>() {
    }.getType();

    public void save(AppExecution appExecution) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(appExecution));
            myWriter.close();
            System.out.println("Bien");
        } catch (IOException e) {
            System.out.println("Problemas");
        }
    }

    public AppExecution obtain() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            if (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, type);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return null;
    }

    public void clear() {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write("");
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
        }
    }
}
