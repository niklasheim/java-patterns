package net.dobl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WRObserver implements IObs {
    public String msg;

    ArrayList<String> msgs = new ArrayList<>();

    @Override
    public void update(Object msg) {
        this.setMsg((String) msg);

        try {
            String filename= "log.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(msg + "\n");//appends the string to the file
            fw.close();
        }
        catch(IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

}
