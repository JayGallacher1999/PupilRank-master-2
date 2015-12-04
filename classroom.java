import javax.swing.JOptionPane;
import java.io.*;
public class classroom
{
    private Pupil pupilList[];
    int noOfPupils;
    FILEREADCSV markFile;
    public classroom()
    {
     markFile = new FILEREADCSV();   
    }
    
    public void processPupil() throws IOException
    {
      setUpPupilList();
      countOKmark();
    }
    
    private void setUpPupilList() throws IOException
    {
      System.out.println("Pupil Classroom: test mark");
      System.out.println("** preparing to read data file.");
      
      String[] dataRows = markFile.readCSVtable();
      
      noOfPupils = dataRows.length - 1;
      
      System.out.println("** "+ noOfPupils + " rows read.\n\n");
      
      pupilList = new Pupil[noOfPupils];
      
      for (int i = 0; i < noOfPupils; i++) {
          
          pupilList[i] = new Pupil();
          
          pupilList[i].readDetails(dataRows[i+1]);
          
        }
    }
    
    public void countOKmark()
    {
    }
}