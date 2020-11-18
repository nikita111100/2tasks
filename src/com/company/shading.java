package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;

public class shading {
    public static void main(String[] args) {
       test test = new test();
       test.shadingPermClass();
       int i = 5;
       test.shadingPermObject(i);

    }
}
class test {
    int i = 0;
    public void shadingPermClass () {
        int i = 1;
        System.out.println("Выводится переменная метода " + i);
        System.out.println("Выводится переменная класса " + this.i);
    }
    public void shadingPermObject (int i){
        System.out.println("Выводится переменная обьекта "+i);
        System.out.println("Выводится переменная обьекта " + this.i);
    }
}
