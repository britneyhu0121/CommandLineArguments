public class CommandLines {
    public static void main (String[] args){
        for(int i=0;i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}

// Command line argument passed to a program at the time when you run it.
// they are stored as string in String array passed to the args parameter of main() method.
