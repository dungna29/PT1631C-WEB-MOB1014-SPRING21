/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package3;

import Package1.ClassA;

/**
 *
 * @author DungNAPC
 */
public class ClassD extends ClassA {

    void method() {
        ClassA classA = new ClassA();
        a = 1;
        b = 2;//Không gọi đến thuộc tính ở package khác nếu không kế thừa
        //c = 3;//Không gọi đến thuộc tính ở package khác để Default
        //d = 4; - Không gọi được đến thuộc tính bị private
    }
}
