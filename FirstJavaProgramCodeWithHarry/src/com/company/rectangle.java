package com.company;
class area{
   int l,b;
    public int areaOfRectangle(){
        return l*b;

    }
    public int perimeter(){
        return (2*(l+b));
    }
}

public class rectangle {
    public static void main(String[] args) {


            area rect=new area();
            rect.l=4;
            rect.b=7;
        System.out.println(rect.areaOfRectangle());
        System.out.println(rect.perimeter());

    }
}
