import java.net.*;
import java.io.*;
import java.util.*;
//import java.net.InetAddress;

public class GeoipifyAPIQuery{
    String IP;
    String API_URL;
    String API_KEY;
    String url;
    //String tz;
    //String stringValueOf;
    String gmttz;
    TimeZone tzz;

    public GeoipifyAPIQuery(){
      this.IP = "";
      gmttz = "";
        try
        {
            URL url_name = new URL("http://bot.whatismyipaddress.com");

            BufferedReader sc =
            new BufferedReader(new InputStreamReader(url_name.openStream()));

            // reads system IPAddress
            this.IP = sc.readLine().trim();
        }
        catch (Exception e)
        {
            this.IP = "Cannot Execute Properly";
        }




        //String inet = localhost.toString(localhost);
        //String IP = inet;
        API_KEY = "at_m7rST7QVFIRcpaYKMNKTrsViRantA";
        API_URL = "https://geo.ipify.org/api/v1?";
        url = API_URL + "&apiKey=" + API_KEY +
                     "&ipAddress=" + this.IP;
        try (java.util.Scanner s =
            new java.util.Scanner(new java.net.URL(url).openStream())) {
            String sk = s.useDelimiter("\\A").next();
            System.out.println(sk);
            sk = sk.replaceAll("[^a-zA-Z0-9]", "");
            String tz = "timezone";
            String stringValueOf = "";
            String onltz = "";
            int i = sk.indexOf(tz);
            for(int k = i; k < i+12 ; k++){
              char c = sk.charAt(k);
              stringValueOf = stringValueOf + String.valueOf(c);

            }
            for(int j = 8; j < 12; j++){
              char d = stringValueOf.charAt(j);
              onltz = onltz + String.valueOf(d);

            }
              gmttz = onltz;


            //System.out.println(sk);
            //System.out.println(i);
            //System.out.println(stringValueOf);
            //System.out.println(onltz);

        } catch (Exception ex) {
            ex.printStackTrace();
        }



    }


    public String getTimezone(){
      return gmttz;
    }

    //public TimeZone fetchTimeZone(){
      //tzz = TimeZone.getTimeZone(gmttz);
      //return tzz;
    //}

    //public void tzzx(){
      //GregorianCalendar gk = new GregorianCalendar(tzz);
      //System.out.println(gk.HOUR);
    //}


}
