package com.ryspie.tasks.task_2;

class NumberFinder {
    public static void main(String[] args) {
        int arrayLength = 10;
        int searchingNumber = 11;
        int[] numbers = new int[arrayLength];
        int[] filledAndSortedArray = fillArray(numbers);

        boolean isContaining = search(filledAndSortedArray, searchingNumber);
        System.out.println(isContaining);


    }

    private static boolean search(int[] numbers, int x) {
        int leftIndex = 0;
        int rightIndex = numbers.length - 1;
        boolean isContainingNumber = false;

        while (leftIndex <= rightIndex) {
            int middleIndex = (rightIndex + leftIndex) / 2;
            if (numbers[middleIndex] == x) {
                isContainingNumber = true;
                break;
            } else if (numbers[middleIndex] < x) {
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        }
        return isContainingNumber;
    }

    private static int[] fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers.length - i;
        }
        return numbers;
    }
}

