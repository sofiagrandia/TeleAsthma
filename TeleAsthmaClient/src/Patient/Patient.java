/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author Sofia
 */
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum GENDER {
        male, female, other
    }
    private final String id;
    private final String password;

   
    private final String name;
    private final String surname;
    private final Fecha dob;
    private final float weight;
    private final float height;
    private final String asthmaType;
    private final String doctor;

    private GENDER gender;

    public Patient(String id,String password, String name, String surname, Fecha dob, float weight, float height, String asthmaType, String doctor, GENDER gender) {
        this.id = id;
        this.password=password;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.weight = weight;
        this.height = height;
        this.asthmaType = asthmaType;
        this.doctor = doctor;

        this.gender = gender;
    }

    public Patient(String id, String password,String name, String surname, Fecha dob, float weight, float height, String asthmaType, String doctor) {
        this.id = id;
        this.password=password;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.weight = weight;
        this.height = height;
        this.asthmaType = asthmaType;
        this.doctor = doctor;

        this.gender = null;
    }
    
    public Patient(String id, String password) {
        this.id = id;
        this.password = password;
        this.name = null;
        this.surname = null;
        this.dob = Fecha.setFechaComp(14, 12, 2000);
        this.weight = 0;
        this.height = 164;
        this.asthmaType = "Severe";
        this.doctor = "McDreamy";
        this.gender = gender.other;
    }

    public Patient(String id) {
        this.id = id;
        this.password="1";
        this.name = "Juana";
        this.surname = "La loca";
        this.dob = Fecha.setFechaComp(14, 12, 2000);
        this.weight = 40;
        this.height = 164;
        this.asthmaType = "Severe";
        this.doctor = "McDreamy";
        this.gender = gender.other;
    }

    public Patient() {
        this.id = "001";
        this.password="1";
        this.name = "Juana";
        this.surname = "La loca";
        this.dob = Fecha.setFechaComp(14, 12, 2000);
        this.weight = 40;
        this.height = 164;
        this.asthmaType = "Severe";
        this.doctor = "McDreamy";
        this.gender = gender.other;
    }

   

    @Override
    public String toString() {
        return "Patient to String{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", dob=" + dob + ", weight=" + weight + ", height=" + height + ", asthmaType=" + asthmaType + ", doctor=" + doctor + ", gender=" + gender + '}';
    }
    public String toStringEnter() {
        String s= "User Information\n " + "\nID: " + id + "\nName: " + name + "\nSurname: " + surname + ",\nDate of Birth: " + dob + ",\nWeight: " + weight + "\nHeight: " + height + "\nAsthma Type: " + asthmaType + "\nDoctor: " + doctor + "\nGender:" + gender ;
        return s;
    }
    public String getPassword() {
        return password;
    }
    
 
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Fecha getDob() {
        return dob;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getAsthmaType() {
        return asthmaType;
    }

    public String getDoctor() {
        return doctor;
    }

    public GENDER getGender() {
        return gender;
    }

    public static Patient createPatient(String id, String password, String name, String surname, Fecha dob, float weight, float height, String asthmaType, String doctor, String gender) throws FileNotFoundException, IOException {
        GENDER g = GENDER.valueOf(gender);
        Patient patient = new Patient(id, password, name, surname, dob, weight, height, asthmaType, doctor, g);
           
            return patient;
        }


    public static void readPatient(Patient patient) throws FileNotFoundException, IOException, ClassNotFoundException {
        String id=patient.getId();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("paciente"+id+"\\UserInfo.txt"));
        Object aux = ois.readObject();
        System.out.println(aux);

    }
    public static Patient login(String id, String password) throws FileNotFoundException, IOException {
        
        Patient patient = new Patient(id, password);
           
            return patient;
        }

}
