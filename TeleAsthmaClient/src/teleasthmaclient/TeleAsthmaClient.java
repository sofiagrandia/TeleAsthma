/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teleasthmaclient;

import Patient.Patient;
import Patient.SharedInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import pruebaJFrame.Register;

/**
 *
 * @author Sofia
 */
public class TeleAsthmaClient extends JFrame implements Serializable {

    private static final long serialVersionUID = 1L;
    public static OutputStream output = null;
    public static ObjectOutputStream objectOutput = null;
    public static InputStream input = null;
    public static ObjectInputStream objectInput = null;
    static Socket socket = null;

    public static void main(String args[]) {
    }

    public static void socketClient(Object object) throws ClassNotFoundException {
        try {

            socket = SharedInfo.getInstance().getSocket();
            objectOutput = SharedInfo.getInstance().getOos();
            objectOutput.writeObject(object);
            objectOutput.flush();

            SharedInfo.getInstance().setOis(new ObjectInputStream(socket.getInputStream()));
            objectInput = SharedInfo.getInstance().getOis();

            Object obj = objectInput.readObject();
            System.out.println("receive: " + obj);
            Register reg = new Register();

            if (obj instanceof Integer) {
                if (obj.equals(4)) {
                    System.out.println("User already exists");
                    reg.windowRegister(4);

                } else if (obj.equals(5)) {
                    System.out.println("User registered");
                    reg.windowRegister(5);
                }
            } else if (obj instanceof Patient) {
                System.out.println("Login correct");
                SharedInfo.getInstance().setPatient((Patient) obj);
                reg.windowRegister(6);
            } else if (obj.toString().startsWith("UserInfo")) {
                System.out.println("User does not exist");
                reg.windowRegister(7);
            }
        } catch (IOException ex) {
            System.out.println("Unable to write the objects on the server");
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            releaseResources(objectInput, output, input, objectOutput, socket);
        }
    }

    private static void releaseResources(ObjectInputStream objectInputStream, OutputStream outputStream, InputStream inputStream, ObjectOutputStream objectOutputStream, Socket socket) {
        try {
            outputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            inputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            objectInputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            objectOutputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
