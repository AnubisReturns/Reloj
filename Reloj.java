
package relog;


public class Relog {

    public static void main(String[] args) {
     int hr=0,m=0,s=0;
     
    while (hr<24){
    while (m<60){
    while (s<60){
    
        System.out.println(hr+":"+m+":"+s);
    s++;
    }s=0; m++;
    }m=0; hr++;
    }
   
}
}
