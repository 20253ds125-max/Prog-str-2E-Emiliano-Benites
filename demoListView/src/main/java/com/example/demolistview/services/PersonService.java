package com.example.demolistview.services;

import com.example.demolistview.repositories.PersonFileRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonService {

    PersonFileRepository repository= new PersonFileRepository();

    public List<String> loadDataForListView() throws IOException {
        List<String> lines=repository.readAllLines();
        List<String> result=new ArrayList<>();

        for (String line:lines){
            if (line==null || line.isBlank())continue;
            String [] parts=line.split(",");
            String name=parts[0];
            String email=parts[1];
            String edad=parts[2];
            result.add("Nombre: "+name+" - Email: "+email + " - Edad: "+edad);
        }
        return result;
    }

    public void addPerson(String name, String email, String edad) throws IOException {
        validate(name, email, edad);
        repository.appendNewLine(name+ " , "+email +" , " +edad);
    }

    private void validate(String name, String email, String  edad){
        if (name==null || name.isBlank() || name.length()<3){
            throw new IllegalArgumentException("El nombre es incorrecto");
        }

        String em=(email==null) ? "" : email.trim();
        if (em.isBlank()|| !em.contains("@")|| !em.contains(".") ){
            throw new IllegalArgumentException("El email es incorrecto");
        }
        String edadNotNull=(edad==null) ? "" : edad.trim();
        int parsEdad = Integer.parseInt(edadNotNull);
        if (parsEdad > 0){
            throw new IllegalArgumentException("No pueden ser numeros negativos ");
        }else {
           if (parsEdad > 120 || parsEdad < 18) {
                throw new IllegalArgumentException("La edad es ivalida ");
            }
        }

    }
}
