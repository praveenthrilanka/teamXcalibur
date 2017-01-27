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
 
    
    
    
}
