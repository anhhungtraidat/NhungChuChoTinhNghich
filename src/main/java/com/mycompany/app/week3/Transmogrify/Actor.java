package com.mycompany.app.week3.Transmogrify;

abstract class Actor {
    abstract void act();
   }
   class HappyActor extends Actor {
    public void act() { //…}
   }
}
   class SadActor extends Actor {
    public void act() { //…}
   }
}
   class Stage {
    Actor a = new HappyActor();
    void change() { a = new SadActor(); }
    void go() { a.act(); }
   }
