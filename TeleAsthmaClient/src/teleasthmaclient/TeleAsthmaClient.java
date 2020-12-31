/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teleasthmaclient;

import BITalino.BITalinoException;
import BITalino.BitalinoDemo;
import Patient.Data;
import Patient.Patient;
import Patient.SharedInfo;
import Patient.UserLogin;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pruebaJFrame.Login;
import pruebaJFrame.MainPage;
import pruebaJFrame.Register;

/**
 *
 * @author Sofia
 */
public class TeleAsthmaClient implements Serializable {

    private static final long serialVersionUID = 1L;
    public static OutputStream output = null;
    public static ObjectOutputStream objectOutput = null;
    public static InputStream input = null;
    public static ObjectInputStream objectInput = null;
    static Socket socket = null;
    

    public static void main(String args[]) throws BITalinoException, Throwable {
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;

        //Patient[] patients = new Patient[3];
        //patients[0] = new Patient();
        Data data = BitalinoDemo.BITalinoMethod();
        System.out.println(data);
        try {
            socket = new Socket("localhost", 9000);
            //añadido nuevo sofia
            SharedInfo.getInstance().setSocket(socket);
            outputStream = SharedInfo.getInstance().getSocket().getOutputStream();
            //outputStream = socket.getOutputStream();
        } catch (IOException ex) {
            System.out.println("It was not possible to connect to the server.");
            System.exit(-1);
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            objectOutputStream = new ObjectOutputStream(outputStream);
            //nuevo
            SharedInfo.getInstance().setOos(objectOutputStream);
            
            SharedInfo.getInstance().getOos().writeObject(data);
            //objectOutputStream.writeObject(data);   
            //objectOutputStream.flush();
        } catch (IOException ex) {
            System.out.println("Unable to write the objects on the server.");
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            releaseResources(objectOutputStream, socket);

        }

    }

    private static void releaseResources(ObjectOutputStream objectOutputStream, Socket socket) {
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

    public static void socketClient(Object object) throws ClassNotFoundException {

        Register reg = new Register();
        try {
            SharedInfo.getInstance().getOos().reset();
            SharedInfo.getInstance().setOos(objectOutput);
           
            objectOutput = SharedInfo.getInstance().getOos();
            //objectInput = new ObjectInputStream(input);
            SharedInfo.getInstance().getOos().writeObject(object);
            //objectOutput.writeObject(object);
            //objectOutput.flush();
            input = SharedInfo.getInstance().getIs();

            int i = input.read();
            System.out.println(i);
            reg.windowRegister(i);
            
            if (i == 4) {
                System.out.println("User already exists");
                
            } else if (i == 5) {
                System.out.println("User registered");
            }
            SharedInfo.getInstance().setOis(new ObjectInputStream(socket.getInputStream()));
            objectInput = SharedInfo.getInstance().getOis();
            
            Object obj = objectInput.readObject();
            System.out.println(i);

            if (obj instanceof Patient) {
                System.out.println("Login correct");
                SharedInfo.getInstance().setPatient((Patient) obj);
                //reg.windowRegister(i);
            } else if (obj instanceof UserLogin) {
                System.out.println("User does not exist");
                //reg.windowRegister(5);

            }
        } catch (IOException ex) {
            System.out.println("Unable to write the objects on the server");
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
