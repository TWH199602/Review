package WorkDay4.CdStore;

public class Video {
String name;
boolean isrent;
int score;
public void setName(String videoName){
  name = videoName;

}

  public String getName() {
    return name;
  }

  public void setScore(int videoStore){
  score = videoStore;
}

  public int getScore() {
    return score;
  }

  public void setIsrent(boolean videoIsRent){
  isrent = videoIsRent;
if(videoIsRent = true){
  System.out.print("是");
}
else{
  System.out.println("否");
}
}
public boolean getIsrent(){
  return isrent;
}
}
