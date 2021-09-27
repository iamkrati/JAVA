public class EmployeebyThis {
    public int eid;
    public String E_name;
    EmployeebyThis(int eiid,String E_name){
//        this.eid=eid;
//        this.E_name=E_name;
        System.out.println(E_name+eiid);
    }
}
class Main11{
    public static void main(String[] args) {
        EmployeebyThis obj=new EmployeebyThis(10,"krati");
    }
}
