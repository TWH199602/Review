package WorkDay17.Set.Team;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TeamPlayer {
    private String name;
    private int num;
    private String position;
    private int positionIndex;

    public TeamPlayer(String name, int num, String position) {
        this.name = name;
        this.num = num;
        this.position = position;
        switch (position) {
            case "PG":
                positionIndex = 1;
                break;
            case "SG":
                positionIndex = 2;
                break;
            case "SF":
                positionIndex = 3;
                break;
            case "PF":
                positionIndex = 4;
                break;
            case "C":
                positionIndex = 5;
                break;
            default:
                throw new RuntimeException("不支持的位置");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public TeamPlayer(int positionIndex) {
        this.positionIndex = positionIndex;
    }

    public int getPositionIndex() {
        return positionIndex;
    }

    public void setPositionIndex(int positionIndex) {
        this.positionIndex = positionIndex;
    }

    @Override
    public String toString() {
        return "TeamPlayer{" +
                "positionIndex=" + positionIndex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TeamPlayer that = (TeamPlayer) o;
        return num == that.num &&
                positionIndex == that.positionIndex &&
                Objects.equals(name, that.name) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num, position, positionIndex);
    }

}


