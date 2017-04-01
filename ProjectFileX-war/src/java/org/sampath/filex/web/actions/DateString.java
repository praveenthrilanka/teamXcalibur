/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DateString {
    
    public static String getDate(String date){

        String time;
        if(Integer.parseInt(date.substring(11, 13))>12)
            time=Integer.toString(Integer.parseInt(date.substring(11, 13))-12)+(date.substring(13, 19))+" PM";
        else if(Integer.parseInt(date.substring(11, 13))==00)
            time="12"+(date.substring(13, 19))+" AM";
        else 
            time=date.substring(11, 19)+" AM";
        
        date=date.substring(4, 11)+date.substring(24, 28)+" at "+time;
        
        return date;
    }
    /*
    public static String compareDate(String first,String second)
    {
        String array[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        int fmonth=0;
        int smonth=0;
        int fday;
        int sday;
        
        if(Integer.parseInt(first.substring(8, 11))<Integer.parseInt(second.substring(8, 11)))
            return first;
        else if(Integer.parseInt(first.substring(8, 11))>Integer.parseInt(second.substring(8, 11)))
            return second;
        else{
            for(int x=0;x<12;x++)
            {
                if(first.substring(1, 3).toLowerCase().equals(array[x]))
                    fmonth=x;
                else
                    System.out.print("Month not found");
            }
            for(int x=0;x<12;x++)
            {
                if(second.substring(1, 3).toLowerCase().equals(array[x]))
                    smonth=x;
                else
                    System.out.print("Month not found");
            }
            
            if(fmonth<smonth)
                return first;
            else if(fmonth>smonth)
                return second;
            else
            {
                if(Integer.parseInt(first.substring(5, 6))<Integer.parseInt(second.substring(5, 6)))
                    return first;
                if(Integer.parseInt(first.substring(5, 6))>Integer.parseInt(second.substring(5, 6)))
                    return second;
                else
                {
                    if(first.substring(1, 3).equals("AM"))
                        fday=0;
                    else
                        fday=1;
                    
                    if(second.substring(1, 3).equals("AM"))
                        sday=0;
                    else
                        sday=1;
                    
                    if(fday<sday)
                        return first;
                    if(fday>sday)
                        return second;
                    else
                    {
                        if(Integer.parseInt(first.substring(17, 18))<Integer.parseInt(second.substring(17, 18)))
                            return first;
                        if(Integer.parseInt(first.substring(17, 18))>Integer.parseInt(second.substring(17, 18)))
                            return second;
                        else
                            {
                                if(Integer.parseInt(first.substring(20, 21))<Integer.parseInt(second.substring(20, 21)))
                                    return first;
                                if(Integer.parseInt(first.substring(20, 21))>Integer.parseInt(second.substring(20, 21)))
                                    return second;
                                else
                                {
                                    if(Integer.parseInt(first.substring(23, 24))<Integer.parseInt(second.substring(23, 24)))
                                        return first;
                                    if(Integer.parseInt(first.substring(23, 24))>Integer.parseInt(second.substring(23, 24)))
                                        return second;

                                }
                            }
                
                    }
                    
                }
                
            
            }
        
        }
        return null;
    }
*/
 
    public static String getDateRange(String range)
    {
        String array[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String dateRange="";
        String drange[]=range.split(" - ");//splits the string based on string;
        String temp[]=drange[0].split("/");
        
        int month=Integer.parseInt(temp[0]);
        dateRange+=array[month-1]+" "+temp[1]+" "+temp[2]+",";
        
        temp=drange[1].split("/");
        month=Integer.parseInt(temp[0]);
        dateRange+=array[month-1]+" "+temp[1]+" "+temp[2];
        
        return dateRange;
    }
    
    public static boolean compareDate(String compare,String date)
    {
        try {
            DateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
            Date tdate = format.parse(date);
            
            String dateRange[] = DateString.getDateRange(compare).split(",");
            System.out.println(dateRange[0]+"<<------>>"+dateRange[1]);
            System.out.println(tdate);
            Date leftdate=format.parse(dateRange[0]);
            Date rightdate=format.parse(dateRange[1]);
            
            System.out.println("THIS IS DATE RANGE\n "+leftdate.toString()+"++"+rightdate.toString());
            
            return !(tdate.before(leftdate) || tdate.after(rightdate));
            
            
        } catch (ParseException ex) {
            Logger.getLogger(DateString.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return false;
    }
}
