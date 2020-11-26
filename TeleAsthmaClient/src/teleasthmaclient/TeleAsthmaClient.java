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
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sofia
 */
public class TeleAsthmaClient implements Serializable {
    public static void main(String args[]) throws BITalinoException, Throwable {
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        Socket socket = null;
        
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
}
