public class item
{
    //data
    private int location;
    private String description;
    
    //methods
    public item(int x,String y)
    {
        location=x;
        description=y;
    }
    public item()
    {
        System.out.println("Location "+location);
        System.out.println("Description "+description);
    }
}
