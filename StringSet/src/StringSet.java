import java.util.ArrayList;

public class StringSet extends ArrayList<String> {

    public boolean add(String newStr) {
        try {
            super.add(newStr);
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }

    public void pop() {
        if (size() > 0) {
            remove(size() - 1);
        }
    }

    public int sumValidIntegers() {
        int total = 0;
        int num;
        for (int i = 0; i < size(); i++) {
            try {
                num = Integer.parseInt(get(i));
                total += num;
            } catch (NumberFormatException e) {
                // do nothing
            }
        }
        return total;
    }

    public int numChars() {
        int total = 0;
        for (int i = 0; i < size(); i++) {
            total += get(i).length();
        }
        return total;
    }

    public int countStrings(String stringToLookFor) {
        int total = 0;
        for (int i = 0; i < size(); i++) {
            if (get(i).contains(stringToLookFor)) {
                total++;
            }
        }
        return total;
    }
}
