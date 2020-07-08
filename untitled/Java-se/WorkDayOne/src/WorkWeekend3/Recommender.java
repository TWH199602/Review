package WorkWeekend3;

import java.util.List;

public interface Recommender {
    void add(String username, List<String> project);

    boolean likeBoth(String userName, String project1, String project2) throws UnknownPersonException;

    List<String> recommendByPerson(String username);

    List<String> recommendByProject(String project);
}
