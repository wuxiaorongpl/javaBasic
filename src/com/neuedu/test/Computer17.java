package com.neuedu.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Computer17 {
    private char color;
    private int cpu;

    public Computer17(){

    }
    public Computer17(char color,int cpu){
        this.color=color;
        this.cpu=cpu;
    }
    public void a(){
        System.out.println("笔记本颜色"+color+","+"型号"+cpu);
    }
}
