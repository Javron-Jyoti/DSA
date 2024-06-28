import java.util.ArrayList;
import java.util.List;

class Arrays18 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;
        while (i >= 0) {
            int val = num[i] + (k % 10) + carry;
            if (val > 9) {
                list.add(val % 10);
                val = val / 10;
                carry = val;
            } else {
                list.add(val);
                carry = 0;
            }
            i--;
            k = k / 10;
        }

        if (i >= 0) {
            while (i >= 0) {
                list.add(num[i]);
                i--;
            }
        }
        if (k != 0) {
            while (k > 0) {
                int val = (k % 10) + carry;
                if (val > 9) {
                    list.add(val % 10);
                    val = val / 10;
                    carry = val;
                } else {
                    list.add(val);
                    carry = 0;
                }
                k = k / 10;
            }
        }
        if (carry != 0)
            list.add(carry);
        Collections.reverse(list);
        return list;
    }
}