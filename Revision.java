import java.util.Scanner;

public class Revision {

    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public static int BinCoff(int n, int r) {

        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);
        int binCoff = n_fact / (r_fact * nmr_fact);
        return binCoff;

    }

    public static boolean isPalindrome(int n) {
        int num = 0;
        int myNumber = n;

        while (n > 0) {
            int digit = n % 10;
            num = num * 10 + digit;

            n /= 10;

        }
        return myNumber == num;

    }

    public static void LinearSearch() {

        String menu[] = { "Mango", "Apple", "Banana", "Graphs", "Orange" };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Index number : ");
        while (true) {
            int index = sc.nextInt();

            if (index >= 0 && index < menu.length) {
                System.out.print("Name at index " + index + ": " + menu[index]);
                break;
            } else {
                System.out.print("Invalid index. Please enter the valid index :) ");

            }
        }
        sc.close();

    }

    public static int Linear(int linear[], int key) {
        for (int i = 0; i < linear.length; i++) {
            if (key == linear[i]) {
                return i;

            }
        }
        return -1;
    }

    public static int BinarySearch(int search[], int key) {
        int start = 0;
        int end = search.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (search[mid] == key) {
                return mid;
            }
            if (search[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void Pairs(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void SubArray(int arr[]) {

        // int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                int currSum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                System.out.println("Sum : " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
            System.out.println();

        }
        System.out.println("Maxmimum : " + maxSum);

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void primeNumber(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max SubArray : " + maxSum);
    }

    public static int trappedRainwater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];

        }
        return trappedWater;

    }

    public static void namePairs(String friends[]) {
        int tp = 0;

        for (int i = 0; i < friends.length; i++) {
            String name = friends[i];
            for (int j = 1; j < friends.length; j++) {
                System.out.println("(" + name + "," + friends[j] + ") ");
                tp++;

            }
            System.out.println();

        }
        System.out.println("Total pairs : " + tp);
    }

    public static boolean trice(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    return true;
                }
            }
        }
        return false;
    }

    public static int stockPrice(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int BinarySeach(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int num[] = { 1, 9, 8, 0, 2, 3, 5, 6 };
        int key = 3;
        System.out.println(BinarySeach(num, key));

        // int prices[] = { 1, 1, 5, 3, 6, 4 };
        // System.out.println(stockPrice(prices));

        // int arr[] = { 1, 2, 3, 4, 5, 1, 2 };
        // (trice(arr));
        // String friends[] = { "Sikanto", "Mandal", "Pogo", "Prince", "Radhe", "Shyam",
        // "Krishna" };
        // namePairs(friends);

        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // System.out.println(trappedRainwater(height));

        // int arr[] = { 1, -2, 6, -1, 3 };
        // kadanes(arr);
        // // int a = 5;
        // int b = 1;
        // int x = 5;

        // b = ++b + b++;

        // int y = x++ + ++x + ++b + b++;

        // System.out.println(y);
        // System.out.println(a);

        // // b = ++b + b++;
        // int y = x++ + ++x + ++b + b++;

        // System.out.println("y : " + y);
        // System.out.println("b : " + b);

        // int arr[] = { 1, 2, 5, 6, 7, 9, 10, 12 };

        // primeNumber(5, 20);

        // int n = 13;
        // System.out.println(isPrime(n));
        // isPrime(n);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // System.out.println("Subarrays are : ");

        // SubArray(arr);

        // reverse(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // while (true) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the key : ");
        // int key = sc.nextInt();
        // int index = BinarySearch(search, key);

        // if (index == -1) {
        // System.out.println("Not Found");

        // } else {
        // System.out.println("Key is at index " + index);
        // break;
        // }
        // }

        // int linear[] = { 1, 2, 5, 6, 7, 9, 10, 12 };

        // int key = 11;

        // int index = Linear(linear, key);

        // if (index == -1) {
        // System.out.println("Not Found");
        // } else {
        // System.out.println("key is at index :" + index);
        // }

        // LinearSearch();

        // if (name == -1) {
        // System.out.println("Not present");
        // } else {
        // System.out.println(name);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number for items : ");
        // int n = sc.nextInt();
        // String menu[] = new String[n];

        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the " + i + " item : ");
        // menu[i] = sc.next();

        // }
        // System.out.print("Enter the Key : ");
        // String key = sc.next();

        // int index = LinearSearch(menu, key);
        // if (index == -1) {
        // System.out.println("Not found");

        // } else {
        // System.out.println("Key is at index : " + index);

        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number : ");
        // int number = sc.nextInt();
        // System.out.println(isPalindrome(number));

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the n number : ");
        // int n = sc.nextInt();
        // System.out.print("Enter the r number : ");
        // int r = sc.nextInt();

        // System.out.println("Binomial Coefficient : " + BinCoff(n, r));

    }
}
