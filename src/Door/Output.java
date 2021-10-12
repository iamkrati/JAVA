package Door;
public class Output {
   boolean status;
     Output(boolean status)
    {
        this.status=status;
       if(status)
         {
           System.out.println("OPENED");
         }
       else
           System.out.println("NOT OPENED");
     }

}
