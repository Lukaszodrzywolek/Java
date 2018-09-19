import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        System.out.println("Welcome to business card generator!");
    }
        System.out.println(" ");
    String name,surname;
    int tel;
    Scanner scanner = new Scanner(System.in);

        System.out.println("►State your name, please.");
    name = scanner.nextLine();
        System.out.println("►State your surname, please.");
    surname = scanner.nextLine();
        System.out.println("►State your phone number, please.");
    tel = scanner.nextInt();

        System.out.println(" ");

        if (tel>999999999 || tel<99999999)
    {
        System.out.println("Χ- You wrote wrong phone number. Please try again. -Χ");
    }
        else
    {
        System.out.println("Congratulations you generated own business card!");
        System.out.println("");
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   █ Hello! I'm " + name + " " + surname);
        System.out.println("║   █ My phone number: " + tel);
        System.out.println("║   █ Check out my services!");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }﻿