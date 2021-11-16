package _Exception_;

public class CE2 {
    public static void main(String[] args) {
        try{
            Class.forName("CE");
        }
        catch (Exception OBJ)
        {
            OBJ.printStackTrace();
        }
    }
}
