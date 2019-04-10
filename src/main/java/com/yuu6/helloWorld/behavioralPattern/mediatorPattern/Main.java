package com.yuu6.helloWorld.behavioralPattern.mediatorPattern;

import com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter.ChineseWaiter;
import com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter.EnglishWaiter;
import com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter.GermanWaiter;
import com.yuu6.helloWorld.behavioralPattern.mediatorPattern.waiter.Waiter;

public class Main {
    public static void main(String[] args) {
        // 中介者
        Mediator mediator = new Mediator();

        // 三个服务人员
        Waiter chinese = new ChineseWaiter();
        Waiter english = new EnglishWaiter();
        Waiter german = new GermanWaiter();

        // 两个参观者
        Visitor germanVisitor = new Visitor( "german");
        Visitor chineseVisitor = new Visitor( "chinese");
        Visitor englishVisitor = new Visitor( "english");

        // 绑定
        chinese.setMediator(mediator);
        english.setMediator(mediator);
        german.setMediator(mediator);
        germanVisitor.setMediator(mediator);
        chineseVisitor.setMediator(mediator);
        englishVisitor.setMediator(mediator);
        mediator.addVisitor(germanVisitor);
        mediator.addVisitor(chineseVisitor);
        mediator.addVisitor(englishVisitor);
        mediator.addWaiter(chinese);
        mediator.addWaiter(english);
        mediator.addWaiter(german);

        // 一个中国游览者进入
        chineseVisitor.comeIn();
        germanVisitor.comeIn();
        englishVisitor.comeIn();
    }
}
