package WorkWeekend3;

import java.util.*;

/**
 * 许多网站都根据他人喜欢的物品组合来推荐书籍和电影。例如，如果张三喜欢"速度与激情"和"see you again"，而李四喜欢“see you again”，
 * 则系统可能会建议李四观看“速度与激情”。
 * 我们的目标是创建一个具有两个功能的推荐系统：
 * <p>
 * （a）对于给定的用户，它可以产生一组他们喜欢的项目；
 * （b）给定一个项目，它可以产生一组用户可能会喜欢的其他项目。
 * 例如：
 * A 用户 喜欢 1,2,3,4,5  B用户喜欢 a,b,c,3  C用户喜欢 a
 * <p>
 * (a) 传入c用户，返回列表为 b,c,3
 * (b) 传入3项目，返回列表为 1,2,4,5,a,b,c，传入a项目，返回列表为 b,c,3
 * <p>
 * 实现：
 * PersonalRecommender类包含一个名为likes的HashMap，hashMap将人的名字作为key，value是一个LinkedList<String>，
 * 包含（书，电影，歌曲等）的名称。使用适当的访问修饰符可防止另一个类直接访问或编辑likes。
 * 添加addLikes方法，该方法接收一个人的名字和一个项目的名称，并将该项目添加到该人的List集合中。
 * 添加likesBoth方法，该方法接收一个人的名字和两个项目的名称，并返回一个布尔值，表示该人是否喜欢这两个项目。
 * 如果HashMap中没有给定名称的人，likesBoth应该抛出UnknownPersonException以报告未找到该人。
 * 添加recommendByPerson方法，该方法接收一个人名作为参数，返回项目的List
 * 添加recommendByProject方法，该方法接收一个项目名作为参数，返回项目的List，
 * 该List中的项目是所有Likes中包含的人中包含有给定项目名称的其他项目的集合
 * 为上述方法的类创建一个Recommender接口，PersonalRecommendor作为实现类。并添加相应的测试方法。
 */

public class PersonalRecommender implements Recommender {

    private Map<String, List<String>> likes = new HashMap<>();

    @Override
    public void add(String username, List<String> project) {
        if (username == null || project == null) {
            throw new IllegalArgumentException();
        }
        likes.put(username, project);
    }

    @Override
    public boolean likeBoth(String userName, String project1, String project2) throws UnknownPersonException {
        List<String> list = likes.get(userName);
        if (list == null) {
            throw new UnknownPersonException();
        }
        return list.contains(project1) && list.contains(project2);
    }

    @Override
    public List<String> recommendByPerson(String username){
        //获取用户列表
        List<String> list = likes.get(username);
        //创建存储结果的列表
        HashSet<String> result = new HashSet<>();
        //
        for (List<String> one : likes.values()) {
            List<String> listnew = new ArrayList<>(one);
            listnew.retainAll(list);
            if(listnew.size() > 0){
                result.addAll(one);
            }
        }
        result.addAll(list);
        return new LinkedList<>(result);
    }
    @Override
    public List<String> recommendByProject(String project){
        Set<String> lists = new HashSet<>();
        for (List<String> ones : likes.values()) {
            if(ones.contains(project)){
                lists.addAll(ones);
            }
        }
        List<String> result = new LinkedList<>(lists);
        return result;
    }

}
