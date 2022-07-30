package com.LessonPayment;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {

    public static void main(String[] args) {

        System.out.println("KR");
        ArrayList<User> arraylist = new ArrayList<>();
        System.out.println("Welcome PX");
        while (true) {


            System.out.println("Welcome PX");
            System.out.println("Product [1]");
            System.out.println("History[2]");
            System.out.println("Product List [3]");
            System.out.println("= ");


        }
    }

    interface Kr {
        void product();


    }


    class User implements Kr {
        String name;
        String phone;
        String productName;
        int card;

        public User() {

        }

        public User(String name, String phone, String productName, int card) {
            this.name = name;
            this.phone = phone;
            this.productName = productName;
            this.card = card;

        }

        @Override
        public void product() {

        }
    }
}