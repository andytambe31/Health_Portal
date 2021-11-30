/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.awt.Image;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class UtilityFunctions {
    
    //Convert functions
    public long convertToLong(String text) {
              
       return Long.parseLong( text );
        
    }
    
    public double convertToDouble(String text) {
              
       return Double.parseDouble( text );
        
    }
    
    public LocalDate convertToDate(String date) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        formatter = formatter.withLocale( Locale.US );  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
        
        LocalDate dt;
        //System.out.println(date);
        
        try{
            dt = LocalDate.parse(date, formatter);
        }catch(Exception e){
            dt = LocalDate.parse("1-Jan-1990", formatter);
        }
         
        return dt;
    }
    
    public String covertDateToString (LocalDate dob) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        String dt;
        
        try{
            dt = dob.format(formatter);
        }catch(Exception e){
            LocalDate ld = LocalDate.now();
            dt = ld.format(formatter);
        }
        return dt;
        
    }
    
    public int runValidation(String pattern,String matcher){
        
        //USed for defining the pattern
        Pattern ptn = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        
        //Used to search the pattern
        Matcher mchr = ptn.matcher(matcher);
        
        if (mchr.find()){
            return 0;
        }else return 1;

    }

    public String covertLongToString(long num) {
        
        return num+"";
        
    }
    
    public String covertDoubleToString(double num) {
        
        return num+"";
        
    }
      
     public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();

        if(icon.getIconWidth() > w)
        {
          nw = w;
          nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }

        if(nh > h)
        {
          nh = h;
          nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }

        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
}
