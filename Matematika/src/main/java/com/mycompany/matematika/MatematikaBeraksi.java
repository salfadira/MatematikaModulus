/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matematika;

/**
 *
 * @author salfa
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        mtk.pertambahan(10, 12);
        System.out.println("pertambahan 10 + 12 = " + mtk.operasi);
        mtk.pengurangan(50, 21);
        System.out.println("pengurangan 50 - 21 = " + mtk.operasi);
        mtk.perkalian(25, 4);
        System.out.println("perkalian 25 * 4 = " + mtk.operasi);
        mtk.pembagian(70, 10);
        System.out.println("pembagian 70 / 10 = " + mtk.operasi);
        
        
    }
}


