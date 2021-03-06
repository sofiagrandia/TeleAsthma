/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sofia
 */
//ESTE OBJETO LO PASAMOS AL SOCKET
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum SYMPTOMS {
        NO_SYMPTOMS, BREATHING_DIFFICULTY, BREATHING_WHISTLING, CHEST_PREASSURE, INSOMNIA, HEADACHE, OTHERS
    };

    public enum ACTIVITIES {
        EXERCISE, WITH_ANIMAL, AT_HOME, SLEEPING, WORKING, OTHERS
    };

    public enum MEDICATION {
        NO_MEDICATION, RESCUE_INHALER, CONTROL_TREATMENT, ANTIHISTAMINES, IBUPROPHEN, PARACETAMOL, OTHERS
    };
    private ArrayList<Integer> ECG = new ArrayList();
    private ArrayList<Integer> time = new ArrayList();
    private ArrayList<Integer> ACC = new ArrayList();
    private List<SYMPTOMS> symptoms = new ArrayList();
    private List<ACTIVITIES> activities = new ArrayList();
    private List<MEDICATION> medication = new ArrayList();
    float FEM;
    float FEV;
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getFEM() {
        return FEM;
    }

    public void setFEM(float FEM) {
        this.FEM = FEM;
    }

    public float getFEV() {
        return FEV;
    }

    public void setFEV(float FEV) {
        this.FEV = FEV;
    }

    public ArrayList<Integer> getECG() {
        return ECG;
    }

    public void setECG(ArrayList<Integer> ECG) {
        this.ECG = ECG;
    }

    public void addECG(int ecg) {
        this.ECG.add(ecg);
    }

    public ArrayList<Integer> getTime() {
        return time;
    }

    public void setTime(ArrayList<Integer> time) {
        this.time = time;
    }

    public ArrayList<Integer> getACC() {
        return ACC;
    }

    public void setACC(ArrayList<Integer> ACC) {
        this.ACC = ACC;
    }

    public void addACC(int acc) {
        this.ACC.add(acc);
    }

    public List<SYMPTOMS> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<SYMPTOMS> symptoms) {
        this.symptoms = symptoms;
    }

    public void addSymptom(SYMPTOMS symptom) {
        this.symptoms.add(symptom);
    }

    public List<ACTIVITIES> getActivities() {
        return activities;
    }

    public void setActivities(List<ACTIVITIES> activities) {
        this.activities = activities;
    }

    public void addActivity(ACTIVITIES activity) {
        this.activities.add(activity);
    }

    public List<MEDICATION> getMedication() {
        return medication;
    }

    public void setMedication(List<MEDICATION> medication) {
        this.medication = medication;
    }

    public void addMedication(MEDICATION medication) {
        this.medication.add(medication);
    }

    @Override
    public String toString() {
        return "Data{" + "ECG=" + ECG + ", time=" + time + ", ACC=" + ACC + ", symptoms=" + symptoms + ", activities=" + activities + ", medication=" + medication + ", FEM=" + FEM + ", FEV=" + FEV + '}';
    }

}
