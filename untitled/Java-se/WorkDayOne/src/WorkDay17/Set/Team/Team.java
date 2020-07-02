//package WorkDay17.Set.Team;
//
//import java.util.*;
//
//public class Team {
//    List<TeamPlayer> Starting = new ArrayList<>();
//    List<TeamPlayer> Substitute = new ArrayList<>();
//
//    public List<TeamPlayer> getStarting() {
//        return Starting;
//    }
//
//    public void setStarting(List<TeamPlayer> starting) {
//        Starting = starting;
//    }
//
//    public List<TeamPlayer> getSubstitute() {
//        return Substitute;
//    }
//
//    public void setSubstitute(List<TeamPlayer> substitute) {
//        Substitute = substitute;
//    }
//    public void Player(TeamPlayer teamPlayer){
//        if(!Starting.contains(teamPlayer) && Starting.size() < 5){
//            Starting.add(teamPlayer);
//        }else {
//            Substitute.add(teamPlayer);
//        }
//    }
//
//    /**
//     * 查找某一位置的球员
//     * @param teamPlayers
//     * @param position
//     * @return
//     */
//    private TeamPlayer getByPosition(List<TeamPlayer> teamPlayers,String position){
//        for (TeamPlayer teamPlayer : teamPlayers) {
//            if(position.equals(teamPlayer.getPosition())){
//                return teamPlayer;
//            }
//        }
//        throw new RuntimeException("该位置球员未找到");
//    }
//
//    public void replace(TeamPlayer teamPlayer){
//        //获取指定位置的首发球员
//        TeamPlayer startteamplayer = getByPosition(Starting,teamPlayer.getPosition());
//        //首发数组中删除该位置的球员
//        Starting.remove(startteamplayer);
//        //替补数组中删除该位置的球员
//        Substitute.remove(teamPlayer);
//        //将替补数组中删除的成员添加到首发数组中
//        Starting.add(teamPlayer);
//        //将首发数组中删除的成员添加到替补数组中；
//        Substitute.add(startteamplayer);
//        //sort排序，并简写成lambda表达式；
//        Starting.sort(Comparator.comparingInt(TeamPlayer::getPositionIndex));
//
//        /**
//         * lambda表达式原型
//         * Starting.sort(new Comparator<TeamPlayer>() {
//         *             @Override
//         *             public int compare(TeamPlayer o1, TeamPlayer o2) {
//         *                 return o1.getPositionIndex() - o2.getPositionIndex();
//         *             }
//         *         });
//         */
//
//
//    }
//
//    public void remove(TeamPlayer teamPlayer){
//        if(Starting.remove(teamPlayer)){
//
//
//
//
//
//}
