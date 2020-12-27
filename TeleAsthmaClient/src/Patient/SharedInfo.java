/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author anaco
 */
public class SharedInfo {

    private Data data;
    private Patient patient;
    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    private static SharedInfo si;
    private UserLogin ul;

    private SharedInfo() {
        data = new Data();
        patient = new Patient();
        socket = new Socket();
        ul = new UserLogin();
        }

    public UserLogin getUl() {
        return ul;
    }

    public void setUl(UserLogin ul) {
        this.ul = ul;
    }

    public ObjectOutputStream getOos() {
        return oos;
    }

    public void setOos(ObjectOutputStream oos) {
        this.oos = oos;
    }

    public ObjectInputStream getOis() {
        return ois;
    }

    public void setOis(ObjectInputStream ois) {
        this.ois = ois;
    }

    public static SharedInfo getInstance() {
        if (si == null) {
            si = new SharedInfo();
        }

        return si;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public static SharedInfo getSi() {
        return si;
    }

    public static void setSi(SharedInfo si) {
        SharedInfo.si = si;
    }

}
