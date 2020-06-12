package WorkDay4.CdStore;

public class Main {

  public static void main(String[] args) {
    Video video1 = new Video();
    VideoStore videoStore = new VideoStore();
    video1.setName("黑客帝国");
    video1.setScore(4);
    video1.setIsrent(false);
    Video video2 = new Video();
    video2.setName("教父");
    video2.setScore(5);
    video2.setIsrent(true);
    Video video3 = new Video();
    video3.setName("星球大战");
    video3.setScore(3);
    video3.setIsrent(false);
    videoStore.add(video1);
    videoStore.add(video2);
    videoStore.add(video3);

    videoStore.listInventory();

    System.out.println("影片名称:" + video1.getName());
    System.out.println("影片评分:" + video1.getScore());
    System.out.println("是否租赁:" + video1.getIsrent());
    System.out.println("影片名称:" + video2.getName());
    System.out.println("影片评分:" + video2.getScore());
    System.out.println("是否租赁:" + video2.getIsrent());
    System.out.println("影片名称:" + video3.getName());
    System.out.println("影片评分:" + video3.getScore());
    System.out.println("是否租赁:" + video3.getIsrent());

  }
}
