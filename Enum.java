enum Status{
    Running, Pending, Failed, Success, Terminated; 
}



public class Enum {
    public static void main(String[] args) {
        int i=5;
        Status[] st=Status.values(); //Here we have made the Array of type Status in which the values of Enum are fetched or comes by the function i.e, Values();
        for (Status s: st){
            System.out.println(s+":"+s.ordinal());
        }


        //We can also check for the condition to enum through if-else conditionig.
        // Status ss= Status.Running;
        // if(ss == Status.Pending){
        //     System.out.println("Please wait");
        // }
        // else if(ss == Status.Failed){
        //     System.out.println("Try Again");
        // }
        // else if(ss == Status.Terminated){
        //     System.out.println("Terminated....!");
        // }
        // else if(ss == Status.Running){
        //     System.out.println("All Good");
        // }
        // else
        //     System.out.println("Done");

        //But the above things can be done also through the switch
        Status p=Status.Success;
        switch (p) {
            case Failed:
                System.out.println("Try Again");
                break;
            
            case Pending:
                System.out.println("Please Wait");
                break;

            case Success:
                System.out.println("Done");
                break;

            case Terminated:
                System.out.println("Terminated");
                break;
        
            case Running:
                System.out.println("All Good");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}
