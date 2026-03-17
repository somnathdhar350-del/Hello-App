public class UC5 {
    public static void main(String[] args) {
        
        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            StringBuilder names = new StringBuilder();
            
            // Enhanced for loop
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            
            System.out.println("Hello " + names.toString());
        }
    }
}