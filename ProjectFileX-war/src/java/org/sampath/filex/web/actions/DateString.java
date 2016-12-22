/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

/**
 *
 * @author Ashantha
 */
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
 
    
    
    
}
