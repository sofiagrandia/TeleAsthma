/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.io.Serializable;

/**
 *
 * @author Sofia
 */
public class Patient implements Serializable {
      private static final long serialVersionUID = 1L;
    
    public enum GENDER{male, female, other}
    private final String id;
    private final String name;
    private final String surname;
    private final int age;
    private final float weight;
    private final float height;
    private final String asthmaType;
    private final String doctor;
    private final Login login;
    
    private GENDER gender;

    public Patient(String id, String name, String surname, int age, float weight, float height, String asthmaType, String doctor, Login login, GENDER gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.asthmaType = asthmaType;
        this.doctor = doctor;
        this.login = login;
        this.gender = gender;
    }

    public Patient() {
        this.id = null;
        this.name = null;
        this.surname = null;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.asthmaType = null;
        this.doctor = null;
        this.login = null;
        this.gender = null;
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

    public int getAge() {
        return age;
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

    public Login getLogin() {
        return login;
    }

    public GENDER getGender() {
        return gender;
    }

   
}
