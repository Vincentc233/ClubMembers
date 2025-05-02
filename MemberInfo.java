public class MemberInfo
{
    int gradYear; 
    String name;
    boolean hasGoodStanding;
    
    public MemberInfo(String n, int g, boolean h)
    { 
        name = n;
        gradYear = g; 
        hasGoodStanding = h;
    }
    
    public int getGradYear()
    { return gradYear;}

    public boolean inGoodStanding()
    { return hasGoodStanding; }

    public String toString(){
         return(name + ":" + gradYear + ":" + hasGoodStanding);
    }
}