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
import pruebaJFrame.windowAlert;

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
        /*OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;

        //Patient[] patients = new Patient[3];
        //patients[0] = new Patient();
        Data data = BitalinoDemo.BITalinoMethod();
        System.out.println(data);
        try {
            socket = new Socket("localhost", 9000);
            outputStream = socket.getOutputStream();
        } catch (IOException ex) {
            System.out.println("It was not possible to connect to the server.");
            System.exit(-1);
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(data);   
            objectOutputStream.flush();
        } catch (IOException ex) {
            System.out.println("Unable to write the objects on the server.");
            Logger.getLogger(TeleAsthmaClient.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            releaseResources(objectOutputStream, socket);

        }*/

    }

    private static void releaseResources(ObjectInputStream objectInputStream,OutputStream outputStream,InputStream inputStream,ObjectOutputStream objectOutputStream, Socket socket) {
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

    public static void socketClient(Object object) throws ClassNotFoundException {
        try {
            //SharedInfo.getInstance().getOos().reset();
            //socket = new Socket("localhost", 9000);
            //socket= SharedInfo.getInstance().getSocket();
            socket = new Socket("localhost", 9000);
            SharedInfo.getInstance().setSocket(socket);
            objectOutput = new ObjectOutputStream(socket.getOutputStream());
            SharedInfo.getInstance().setOos(objectOutput);
            objectOutput = SharedInfo.getInstance().getOos();
            //objectInput = new ObjectInputStream(input);
            objectOutput.writeObject(object);
            //objectOutput.flush();

            SharedInfo.getInstance().setIs(socket.getInputStream());
            SharedInfo.getInstance().setOis(new ObjectInputStream(socket.getInputStream()));
            input = SharedInfo.getInstance().getIs();

            int i = input.read();
            System.out.println(i);
            //reg.windowRegister(i);
            //wa.window(i);
           
            if (i == 4) {
                System.out.println("User already exists");
                Login log = new Login();
                log.setVisible(true);

            } else if (i == 5) {
                System.out.println("User registered");
                MainPage main = new MainPage();
                main.setVisible(true);
                
            }
           
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
        } finally{
            releaseResources(objectInput, output,input,objectOutput, socket);
        }
        
    }

}
