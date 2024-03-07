package com.mycompany.app.week3.GlyphTest;

abstract class GlyphTest {
    abstract void draw();
    GlyphTest() {
        System.out.println("Glyph() before draw");
        draw();
        System.out.println("Glyph() after draw");
    }
   }
