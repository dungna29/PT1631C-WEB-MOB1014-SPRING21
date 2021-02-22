/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

import Package1.ClassA;

/**
 *
 * @author DungNAPC
 */
public class ClassC {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.a = 1;
        //classA.b = 2;//Không gọi đến thuộc tính ở package khác nếu không kế thừa
        //classA.c = 3;//Không gọi đến thuộc tính ở package khác để Default
        //classA.d = 4; - Không gọi được đến thuộc tính bị private
    }
}
