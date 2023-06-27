package com.bootcoding.dsa.typecasting.pen;

public class PenApp {
    public static void main (String[]args){
        Pen p = new Pen();
        Marker m = new Marker();
//        WhiteMarker wm = new WhiteMarker();

         p = new Marker();
         p = m;
        WhiteMarker wm1 = (WhiteMarker) p;
        wm1.print();
// ClassCastException Q ata hai ?
// ans - Parent ke object me child ka object hum pass kr sakte hai ....to koi bhi error nhi ayega... program child ki property easily run krega...
//but jab child class ke object me parent ka class ka object pass kre to CLASS CAST EXCEPTION ata hai.

    }


}
