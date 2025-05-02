

public class Main {
    public static void main(String[] args){
        MemberInfo m1 = new MemberInfo("SMITH, JANE", 2019, false);
        MemberInfo m2 = new MemberInfo("FOX, STEVE", 2018, true);
        MemberInfo m3 = new MemberInfo("XIN, MICHAEL", 2017, false);
        MemberInfo m4 = new MemberInfo("GARCIA, MARIA", 2020, true);
        MemberInfo[] memList = {m1, m2, m3, m4}; 
        ClubMembers cList = new ClubMembers(memList);
        System.out.println(cList.removeMembers(2019));
        System.out.println(cList.getList());
    }
}
