package com.yuu6.helloWorld.structurlaPattern.adapteePattern;

import com.yuu6.helloWorld.structurlaPattern.decoratePattern.Say;

/**
 * 适配器类
 */
public class Adapter implements Say {

    private OldSay oldSay;
    public Adapter(OldSay oldSay){
        this.oldSay = oldSay;
    }

    @Override
    public void say() {
        oldSay.oldSay();
    }
}
