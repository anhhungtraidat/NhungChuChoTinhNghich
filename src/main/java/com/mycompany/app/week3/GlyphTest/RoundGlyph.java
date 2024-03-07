package com.mycompany.app.week3.GlyphTest;

class RoundGlyph extends GlyphTest {
    int radius = 1;
    RoundGlyph(int r) {
    radius = r;
        System.out.println("RoundGlyph(), radius= " + radius);
    }
    //
    void draw() {
        System.out.println("RoundGlyph.draw(), radius= " + radius);
    }
}