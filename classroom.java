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
      
      noOfpupil = dataRows.length - 1;
      
      System.out.println("** "+ noOfPupil + " rows read.\n\n");
    }
    
    public void countOKmark()
    {
    }
}