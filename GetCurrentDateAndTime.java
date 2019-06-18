import java.util.*;

class GetCurrentDateAndTime
{

      //int hour;
      //String day;
      //DayOfWeek dow;
      GregorianCalendar date;
      String[] weekdays = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
      int dow;
      GeoipifyAPIQuery gIP;
      String tz;

      public GetCurrentDateAndTime(){
        gIP = new GeoipifyAPIQuery();
        tz = gIP.getTimezone();
        date = new GregorianCalendar(TimeZone.getTimeZone("Europe/Oslo"));
        //weekdays = {"sunday","monday","tuesday", "wednesday", "thursday","friday", "saturday"};
        dow = date.get(GregorianCalendar.DAY_OF_WEEK);

    //return daysArray[day];


      }

      /*private TimeZone getTimeZoneByClientIP() {
          TimeZone timeZone = UTC_TIME_ZONE;

          try {
              String clientIP = globals.getHTTPServletRequest().getRemoteAddr();

              if (!Utils.isNullOrEmpty(clientIP)) {
                  Location location = locationResolver.resolveLocation(clientIP);

                  if (!location.isEmpty()) {
                      timeZone = timeZoneResolver.resolveTimeZone(location.getLatitude(), location.getLongitude());
                  }

                  if (timeZone == null) {
                      timeZone = UTC_TIME_ZONE;
                  }
              }

              logger.debug("Resolved timeZoneId is {}", timeZone.getID());
          } catch (Exception e) {
              logger.error("Error resolving client timezone by ip "
                      + globals.getHTTPServletRequest().getRemoteAddr(), e);
          }

          return timeZone;
      }*/
        /*Calendar c = Calendar.getInstance();
 Date date = new Date();
 c.setTime(date);
 int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
 System.out.println(dayOfWeek);
 System.out.println(weekdays[dayOfWeek]);
      */

      public int getHour(){
        return date.get(Calendar.HOUR);
      }

      public int getMin(){
        return date.get(Calendar.MINUTE);
      }

      public int getSec(){
        return date.get(Calendar.SECOND);
      }

      public String getDay(){
        return weekdays[dow];
      }






}
