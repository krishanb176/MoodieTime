
public class Countdown{
  String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday"};
  fetchdaytime ft;
  int checkval = 0;
  int hrs = 40;
  int popup;
  int addhrs = 8;
  int remaininghrs = 0;
  int remainingmin = 0;
  int remaininghrssec = 0;


  public Countdown(){
    this.ft = new fetchdaytime();
  }

  public void setCountDown(){
    for(int i = 0; i < days.length; i++){
      if(days[i] == ft.fetchday()){
        popup = i;
        checkval++;
        break;
      }
    }
    if(checkval == 1){
      while(ft.fetchday() != "friday"){
        remaininghrs = hrs - (popup*addhrs - ft.realtimeval());
        remainingmin = 59 - ft.getmin();
        remaininghrssec = 59 - ft.getsec();
        System.out.println(remaininghrs + ": " + remainingmin + ": " + remaininghrssec);
      }
      //notification code
    }
  }


  public void giveNotification(){
    if(ft.fetchday() == "friday" && ft.getHour() >= 16){
      System.out.println("Time for Moodie");
    }
  }



  //public void printCountDown(){
    //System.out.println(remaininghrs);
  //}


}
