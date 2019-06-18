public class fetchdaytime{
  int ftime;
  int fmin;
  int fsec;
  String fday;

  int[] reconfigure = {8, 7, 6, 5, 4, 3, 2, 1, 0};
  int[] currentval = {8, 9, 10, 11, 12, 13, 14, 15, 16};
  GetCurrentDateAndTime gt;

  public fetchdaytime(){
    GetCurrentDateAndTime gt = new GetCurrentDateAndTime();
    ftime = gt.getHour();
    fday = gt.getDay();
    fmin = gt.getMin();
    fsec = gt.getSec();
  }

  public String fetchday(){
    return fday;
  }

  public int getHour(){
    return ftime;
  }

  public int getmin(){
    return fmin;
  }

  public int getsec(){
    return fsec;
  }

  public int fetchtime(){
    return ftime;
  }

  public int realtimeval(){
    if(ftime >= 8 && ftime <= 16){
      for(int i = 0; i < currentval.length; i++){
        if(currentval[i] == ftime){
          return reconfigure[i];
        }
      }
    }

    return 0;
  }

}
