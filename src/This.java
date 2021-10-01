public class This {

    public static void main(String[] args) {
         OneM obj=new OneM();
         obj.setName("KRATI GOYAL");
        System.out.println(obj.getName());
      //  System.out.println(obj.name);
    }
}
class OneM{
   private String name;
    public String getName(){
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }
}
