package Ex1_1;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String num: args) {
                System.out.println(num + " => " + Main.numberArabicToRoman(Integer.parseInt(num)));
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            String input;
            do {
                System.out.print("Enter the number to convert (q to quit) : ");
                input = scanner.nextLine();
                if (input.contentEquals("")) {
                    System.out.println("Please enter a nomber to convert");
                } else if (!input.contentEquals("q") && ! input.contentEquals("Q")) {
                    int num;
                    try {
                        System.out.println("  => " + Main.numberArabicToRoman(Integer.parseInt(input)));
                    } catch (InvalidParameterException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Please enter a nomber to convert");
                    }
                }
            } while (!input.contentEquals("q") && !input.contentEquals("Q"));
        }
    }

        static String numberArabicToRoman (int toConvert) {
        if (toConvert <= 0 || toConvert > 3999) {
            throw new InvalidParameterException("Number to convert must be between 1 and 3999");
        }

        int remainder = toConvert;
        String thousand = unitArabicToRoman(remainder / 1000, 1000);
        remainder = remainder % 1000;
        String hundred = unitArabicToRoman(remainder / 100, 100);
        remainder = remainder % 100;
        String ten = unitArabicToRoman(remainder / 10, 10);
        remainder = remainder % 10;
        String unit = unitArabicToRoman(remainder, 1);

        return thousand + hundred + ten + unit;
    }

    static String unitArabicToRoman(int unit, int base) {
        String unitSymbol, fiveSymbol, tenSymbol;
        switch (base) {
            case 1: {
                unitSymbol = "I";
                fiveSymbol = "V";
                tenSymbol = "X";
            }; break;
            case 10: {
                unitSymbol = "X";
                fiveSymbol = "L";
                tenSymbol = "C";
            }; break;
            case 100: {
                unitSymbol = "C";
                fiveSymbol = "D";
                tenSymbol = "M";
            } break;
            case 1000: {
                unitSymbol = "M";
                fiveSymbol = "";
                tenSymbol = "";
            }; break;
            default: throw new InvalidParameterException("Invalid Base");
        }

        switch (unit) {
            case 0: return "";
            case 1: return unitSymbol;
            case 2: return unitSymbol + unitSymbol;
            case 3: return unitSymbol + unitSymbol + unitSymbol;
            case 4: return unitSymbol + fiveSymbol;
            case 5: return fiveSymbol;
            case 6: return fiveSymbol + unitSymbol;
            case 7: return fiveSymbol + unitSymbol + unitSymbol;
            case 8: return fiveSymbol + unitSymbol + unitSymbol + unitSymbol;
            case 9: return unitSymbol + tenSymbol;
            default: throw new InvalidParameterException("Number between 0 and 9 expected");
        }
    }
}
