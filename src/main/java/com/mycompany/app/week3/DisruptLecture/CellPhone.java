package com.mycompany.app.week3.DisruptLecture;
class CellPhone {
    public void cellPhone() {}
    public void ring( Tune t ) { 
        t.play();
    }
}
   class Tune {
    public void play() {
    System.out.println("Tune.play()");
    }
   }
   class ObnoxiousTune extends Tune{
    ObnoxiousTune() { // …}
    // …
   }
}
