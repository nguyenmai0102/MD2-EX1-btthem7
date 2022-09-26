package btlamthem7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhap year: ");
        int year = scanner.nextInt();
        System.out.printf("nhap month : ");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("the month "+ month + "has :" + "28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("the month "+ month + "has :" + "31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("the month "+ month +  "has :" + "30 days!");
                break;
            default:
                System.out.println("the month does not exit!");

                }
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.printf("%d is a leap year", year);
                }else {
                    System.out.printf("%d is not a leap year", year);
                }
            }else {
                System.out.printf("%d is a leap year",  year);
            }
        }else {
            System.out.printf("%d is not a leap year", year);
        }
            }
        }


