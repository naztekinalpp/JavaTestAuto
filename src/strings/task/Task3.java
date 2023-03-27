package strings.task;

/*
Display all the products from the list of messages, that contains "not found" or "error" text and product name begins with "C".
 Display number of products that meet the condition.
The list of messages:
Coach is not found, Table is not available, Chair search throws error,Cushion is not found, Bookcase is out of stock.
 */

public class Task3 {
    public static void main(String[] args) {

        String[] messages = {
                "coach is not found",
                "table is not available",
                "chair search throws error",
                "cushion is not found",
                "bookcase is out of stock"
        };

        int number = 0;

        for (String message : messages) {
            if (message.contains("not found") || message.contains("error")) {
                if (message.charAt(0) == 'c' || message.charAt(0) == 'C') {
                    System.out.println(message.substring(0, message.indexOf(" ")));
                    number++;
                }
            }

        }
        System.out.println(number);
    }
}
