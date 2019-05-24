package OODBasics;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class DedupNumberArray {

    public List<Number> dedupArray(Number[] arr) {
        List<Number> res = new ArrayList<>();
        if (arr == null || arr.length == 0) return res;
        Set<BigDecimal> set = new HashSet<>();
        for (Number num : arr) {
            BigDecimal convertNum = new BigDecimal(num.doubleValue());
            if (!set.contains(convertNum)) {
                set.add(convertNum);
                res.add(num);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        DedupNumberArray d = new DedupNumberArray();
        Number[] arr = new Number[]{1, 1.0, 20L, 2.0, 200, new AtomicLong(1), 1.00001};
        List<Number> res = d.dedupArray(arr);
        for (Number num : res) {
            System.out.println(num);
        }
    }
}
