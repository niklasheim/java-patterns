package net.dobl;


import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.feed.synd.SyndFeedImpl;
import com.rometools.rome.io.SyndFeedOutput;
import com.sun.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WRObserverRSS {

    private WR wr;

    public WRObserverRSS(WR wr) {
        this.wr = wr;

        // Durchführung der Registrierung beim übergebenen Subjekt
        this.wr.addObserver(this);
    }


    public void update(Object o, Object arg) {

        try {
            File fileObj = new File("RssLog.txt");
            FileWriter myWriter = new FileWriter("RssLog.txt", true);

            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
            }

            SyndFeed feed = new SyndFeedImpl();
            feed.setFeedType("atom_1.0");
            feed.setTitle("WR Log");
            feed.setDescription(arg.toString());


            SyndFeedOutput syndFeedOutput = new SyndFeedOutput();
            syndFeedOutput.output(feed, myWriter);
            myWriter.close();

        } catch (Exception e) {
            System.out.println("An error occurred.");
        }


    }

}