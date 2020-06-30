package WorkDay11.Commision;

/**
 * 将数组的大小增加到8。将两个Commission的对象添加到staffList中，提供自定义的姓名，地址，电话号码和社会保险号。
 *      * 让一名员工每小时赚取6.25美元和20％的佣金，另一名员工每小时赚取9.75美元和15％的佣金。
 *      * 对于添加的第一位员工，将工作时间设为35，总销售额为$ 400；
 *      * 对于添加的第二位员工，将小时数设为40，将销售额设为$ 950。
 */

public class Staff {
    StaffMember[] staffList;

    //设置工作人员名单
    public Staff() {
        staffList = new StaffMember[8];
        staffList[0] = new Executive("张三", "玄武", "13312345678", "123-45-6789", 2423.07);
        staffList[1] = new Employee("李四", "仙林", "13888888888", "987-65-4321", 1246.15);
        staffList[2] = new Employee("王五", "鼓楼", "13777777777", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("赵六", "河西", "13555555555", "958-47-3625", 10.55);
        staffList[4] = new Volunteer("小强", "江宁", "15111111111");
        staffList[5] = new Volunteer("小明", "栖霞", "13999999999");
        staffList[6] = new Commission("印度阿三","印度","13799999999","121-77-8789",6.25,0.2);
        staffList[7] = new Commission("越南猴子","越南","1315555555","110-00-3859",9.75,0.15);
       //向上的数据类型转换；
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Hourly) staffList[3]).addHours(40);
        ((Commission) staffList[6]).addSales(400);
        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[7]).addSales(950);
        ((Commission) staffList[7]).addHours(40);
    }

    // 支付所有员工工资。
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);
            amount = staffList[count].pay(); // 多态
            if (amount == 0.0) {
                System.out.println("鼓励!");
            } else {
                System.out.println("支付: " + amount);
            }
            System.out.println("-----------------------------------");
        }
    }
}
