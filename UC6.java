public class UC6 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append names with delimiter
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                String result = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello " + result);
            }
        }
    }
}