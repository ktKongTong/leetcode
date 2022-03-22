package swordToOfferSA._0021_0040;


public class _0038_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length < 2){
            return new int[]{0};
        }
        int[] res = new int[temperatures.length];
        int max = temperatures[temperatures.length - 1];
        int maxIdx = temperatures.length - 1;
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (i == temperatures.length - 1||temperatures[i] >= max) {
                max = temperatures[i];
                res[i] = 0;
                continue;
            }
            for (int j = i + 1; j <= maxIdx; j++) {
                if (temperatures[j] > temperatures[i]) {
                    maxIdx = j;
                    max = temperatures[j];
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}
//    int[] arr = new int [temperatures.length];
//        for(int i = temperatures.length-1;i >= 0;i--){
//                int j = i + 1;
//                while(j < temperatures.length){
//        if(temperatures[j] > temperatures[i]){
//        arr[i] = j - i;
//        break;
//        }else if(arr[j] == 0){
//        break;
//        }else{
//        // 加速
//        j += arr[j];
//        }
//        }
//        }
//        return arr;


//    int[] res = new int[temperatures.length];
//    Stack<Integer> stack = new Stack<>();
//    for(int i = 0; i < temperatures.length; i++){
//    while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
//    int idx = stack.pop();
//    res[idx] = i - idx;
//    }
//    stack.push(i);
//    }
//    return res;


//    }

//}