
import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.lang.Math.*;

public class Pupil
{
    private String vName;
    private String vSurname;
    private String vScore;
    
    public Pupil()
    {
        vName = "";
        vSurname = "";
        vScore = "";
        
    }
    
    public void readDetails (String dataItems)
    {
        String[] rowItems = dataItems.split(",");
        
        vName = rowItems[0];
        vSurname = rowItems[1];
        vScore = rowItems[2];
        
    }
    
    public String writeDetails()
    {
        String pupilData = "";
        pupilData = pupilData.concat(vName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(vSurname);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(vScore);
        return pupilData;
    } 
     
   
}   
       