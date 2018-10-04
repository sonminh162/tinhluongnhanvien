package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nam lam viec:");
        int sonam = scanner.nextInt();
        System.out.println("nhap vao he so luong (tu 1 - 5):");
        int hesoluong = scanner.nextInt();
        if(hesoluong<5 && hesoluong>1){
            System.out.println("tien luong thang:"+(hesoluong*4000000 + sonam*500000));
        }else{
            System.out.println("he so luong khong hop le, xin moi nhap lai he so luong:");
            hesoluong = scanner.nextInt();
            System.out.println("tien luong thang:"+(hesoluong*4000000 + sonam*500000));
        }

    }
}
