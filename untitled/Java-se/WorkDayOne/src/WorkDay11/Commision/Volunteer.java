package WorkDay11.Commision;
/**
 * 志愿者
 */
public class Volunteer extends StaffMember {
    // 使用指定的信息设置志愿者。
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    // 志愿者的零薪为0。
    @Override
    public double pay() {
        return 0.0;
    }
}
