package WorkDay4.CdStore;

public class VideoStore {

  private Video[] videoArr = new Video[100];
  private int videoTotal = 0;

  public void add(Video video) {
    if (video == null) {
      System.out.println("已全部租赁");
      return;
    }

    videoArr[videoTotal++] = video ;
  }
  public Video rent(String name) {
    int index = -1;

    for (int i = 0; i < videoTotal;i++){
      if(videoArr[i].getName().equals(name)){
        index = i;
        break;
      }
    }
    if (index == -1) {
      return null;
    }
    Video rlt = videoArr[index];
    videoArr[index] = videoArr[videoTotal - 1];
    videoArr[videoTotal--] = null;
    return rlt;
  }
  public int averageScore(){
    int average = 0;
    for (int i =0; i < videoTotal;i++){
      average = videoArr[i].getScore()/i;
    }
    return average;
  }
  //listInventory()
  public void listInventory(){
    for (int i =0; i < videoTotal; i++){
      Video video = videoArr[i];
      System.out.println(video.getName() + "的评分:" + video.getScore() + "是否被租赁:" + video.getIsrent());
    }
  }

}