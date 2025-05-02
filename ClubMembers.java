import java.util.ArrayList;
public class ClubMembers
{
    private ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();
    public ClubMembers(MemberInfo[] b){
        for(int i = 0; i< b.length; i++){
            memberList.add(b[i]); 
        }
    }
    public ClubMembers(){
    }
    public void addMembers(String[] names, int gradYear)
    { 
        for(int i = 0; i< names.length; i++){
           memberList.add(new MemberInfo(names[i], gradYear, true)); 
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year)
    { 
        ArrayList<MemberInfo> newList = new ArrayList<MemberInfo>();
        for(int i = 0; i< memberList.size(); i++){
            if(memberList.get(i).getGradYear() <= year){
                memberList.remove(i);
                if(memberList.get(i).inGoodStanding()) newList.add(memberList.remove(i));
            }
        }
        return newList;
    }

    public ArrayList<MemberInfo> getList(){
        return memberList;
    }
    

}
