/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
    private final GENDER gender;

    public Patient(String id, String password, String name, String surname, Fecha dob, float weight, float height, String asthmaType, String doctor, GENDER gender) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.weight = weight;
        this.height = height;
        this.asthmaType = asthmaType;
        this.doctor = doctor;
        this.gender = gender;
    }

    public Patient() {
        this.id = "";
        this.password = "";
        this.name = "";
        this.surname = "";
        this.dob = null;
        this.weight = 0;
        this.height = 0;
        this.asthmaType = "";
        this.doctor = "";
        this.gender = null;
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
        String id = patient.getId();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("paciente" + id + "\\UserInfo.txt"));
        Object aux = ois.readObject();
        System.out.println(aux);

    }

    @Override
    public String toString() {
        return "Patient to String{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", dob=" + dob + ", weight=" + weight + ", height=" + height + ", asthmaType=" + asthmaType + ", doctor=" + doctor + ", gender=" + gender + '}';
    }

    public String toStringEnter() {
        String s = "User Information\n " + "\nID: " + id + "\nName: " + name + "\nSurname: " + surname + ",\nDate of Birth: " + dob + ",\nWeight: " + weight + "\nHeight: " + height + "\nAsthma Type: " + asthmaType + "\nDoctor: " + doctor + "\nGender:" + gender;
        return s;
    }

}
