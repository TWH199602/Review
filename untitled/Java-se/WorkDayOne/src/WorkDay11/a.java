package WorkDay11;


class ClassOne
{
    protected void getData()
    {
        System.out.println("Inside ClassOne");
    }
}
class ClassTwo extends ClassOne
{
    @Override
    protected void getData()
    {
        System.out.println("Inside ClassTwo");
    }
}

 class Test
{
    public static void main(String[] args)
    {
        ClassOne obj = new ClassTwo();
        obj.getData();
    }
}
