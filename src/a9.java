public class a9{
    public static void main(String[] args)
    {
        // String Gender = args[0];
        int age = Integer.parseInt(args[1]);
        if(args.length==0)
        {
            System.out.println("Empty Arguments");
        }
        else{
            if(args[0].equals("Male") )
            {
                if (age >= 1 && age <= 58){
                    System.out.println("Interest == 8.4%");
                }
                else if (age >= 59 && age <= 100) {
                    System.out.println("Interest == 10.5%");
                }
            }
        }
        if(args[0].equals("Female"))
        {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest == 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest == 9.2%");
            }
        }
    }
}