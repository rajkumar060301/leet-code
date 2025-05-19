class Solution {
    public int[] findEvenNumbers(int[] digits) {
        final Map<Integer, Integer> digitsMap = new HashMap<>();
        for (final int d : digits) {
            digitsMap.put(d, digitsMap.getOrDefault(d, 0) + 1);
        }

        final List<Integer> nums = new ArrayList<>();
        for (int i = 100; i < 999; i += 2) {
            final Map<Integer, Integer> curDigitsMap = new HashMap<>(); 

            int cur = i;
            while (cur != 0) {
                final int digit = cur % 10;

                curDigitsMap.put(digit, curDigitsMap.getOrDefault(digit, 0) + 1);

                cur /= 10;
            }

            boolean hasMatch = true;
            for (final Map.Entry<Integer, Integer> entry : curDigitsMap.entrySet()) {
                final int digitCount = digitsMap.getOrDefault(entry.getKey(), 0);

                if (entry.getValue() > digitCount) {
                    hasMatch = false;
                    break;
                }
            }

            if (hasMatch) nums.add(i);
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();
    }
}