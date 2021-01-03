package BITalino;

import Patient.Data;
import Patient.SharedInfo;
import java.util.ArrayList;
import java.util.Vector;

import javax.bluetooth.RemoteDevice;

public class BitalinoDemo {

    public static Frame[] frame;
    static public Boolean loading = true;

    public static Boolean getLoading() {
        return loading;
    }

    public static void setLoading(Boolean loading) {
        BitalinoDemo.loading = loading;
    }

    public static Data BITalinoMethod() throws InterruptedException, BITalinoException, Throwable {
        BITalino bitalino = new BITalino();
        ArrayList<Integer> time = new ArrayList();
        Data data = SharedInfo.getInstance().getData();

        // Code to find Devices
        //Only works on some OS
        Vector<RemoteDevice> devices = bitalino.findDevices();
        System.out.println(devices);

        //You need TO CHANGE THE MAC ADDRESS
        //You should have the MAC ADDRESS in a sticker in the Bitalino
        String macAddress = "98:D3:51:FD:9C:72";

        //Sampling rate, should be 10, 100 or 1000
        int SamplingRate = 100;
        bitalino.open(macAddress, SamplingRate);

        // Start acquisition on analog channels A2 and A6
        // For example, If you want A1, A3 and A4 you should use {0,2,3}
        int[] channelsToAcquire = {1, 5};
        bitalino.start(channelsToAcquire);

        //Read in total 10000000 times
        for (int j = 0; j < 30; j++) {

            //Each time read a block of 10 samples 
            int block_size = 10;
            frame = bitalino.read(block_size);

            //Print the samples
            for (int i = 0; i < frame.length; i++) {
                time.add(j * block_size + i);
                data.addECG(frame[i].analog[0]);
                data.addACC(frame[i].analog[1]);

            }

        }

        //stop acquisition
        bitalino.stop();
        BitalinoDemo.setLoading(false);
        return data;
    }

}
