import java.util.*;

public class ValidParanthasis {

    public static void main(String[] args) {
        String[] items = {"(", "[", "{", "}", "]", ")"};
        System.out.println(isValid(items));
    }

    public static boolean isValid(String[] items) {
        Stack<String> stk = new Stack<>();

        if (items.length % 2 != 0) {
            return false;
        }

        for (String item : items) {
            if (item.equals("(") || item.equals("[") || item.equals("{")) {
                stk.push(item);
            } else {
                if (stk.isEmpty()) {
                    return false;
                }
                String top = stk.pop();
                if (!((top.equals("(") && item.equals(")")) ||
                      (top.equals("[") && item.equals("]")) ||
                      (top.equals("{") && item.equals("}")))) {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}
