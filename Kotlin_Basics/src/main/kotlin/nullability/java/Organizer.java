package nullability.java;

public class Organizer {

  public static void main(String[] args){
    Organizer org = new Organizer();
    org.closeMeeting(null);
  }

  boolean closeMeeting(Meeting meeting) {
    if(meeting.canClose) return meeting.close();
    return false;
  }

  class Meeting {
    public boolean canClose;

    public boolean close() {
      return false;
    }
  }
}
