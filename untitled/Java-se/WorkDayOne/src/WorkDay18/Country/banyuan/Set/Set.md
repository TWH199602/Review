##Set
    package WorkDay18.Country.banyuan.Set;
    
    import java.util.HashSet;
    
    public class Set<S> {
        public static void main(String[] args) {
            Set<String> set = new HashSet<>();
            //HashSet在添加时具有去重功能；
            //去重必须先重写equals & hashcode 方法
            //在确定根据哪一项元素去重时，在重写的equals & hashcode 方法中只保留那一项属性即可；
            boolean add = ((HashSet) set).add("123");
            
        }
    }
    hashSet不保证元素顺序
    treeSet会进行排序；须事先实现comparable接口
    linkdeSet会始终保持插入的元素顺序；
