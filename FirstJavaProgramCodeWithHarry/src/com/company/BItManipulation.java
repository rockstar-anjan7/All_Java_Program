package com.company;

public class BItManipulation {
    public static void main(String[] args) {
//        1. Get Bit
//        Rule:
//        step 1 -> bitMask=pahle 1<<position nikalo;
//            step 2 -> bitMask aur original number ka and(&) nikalo; agar non zero aaya to One tha aur zero aaya matlab zero tha;
        int num=5;// 0101
        int pos=2;
        int bitMask=1<<pos;
//        if((bitMask & num)==0){
//            System.out.println("The Bit was zero");
//        }
//        else{
//            System.out.println("The bit was One");
//        }

//        2. Set Bit
//        Rule:maksad hai 1 set karne ka kisi specific position pe;
//        step 1-> bitMask=1<<position;
//        step 2-> bitMask aur original number ka or(|) niklana hai.
//        int newNumber=bitMask | num;
//        System.out.println(newNumber);

//        3. Clear Bit
//        Rule: maksad hai kisi specific position ke number ko clear karna matlab zero bana dena;
//        step 1->bitMask=1<<position;
//        step 2-> btiMask aur Original number ke saath and with not (!&) ka operation lagana;
        int notBitMask=~(bitMask);
        int newNumber2=notBitMask & num;
        System.out.println(newNumber2);

//        4.Update Bit
//        Rule: isme humlog ko simple update karna hai matlab agar 1 update karna hai to Set wala rule lagaayenge
//         aur agar 0 update karna hai to Clear Bit wala rule laga denge;


//         left << shift operator me humlog left ke side kheenchenge
//         e.g. 01001 ko <<2 karna hai matlab left side 2 bit tak kheench do
//              00100  matlab baaki ke jagah pe automatic zero ho jaayega
//        usi tarah
//         right >> shift operator me humlog right ke side kheenchenge
//          e.g. 00101 ko >> 2 karne ka matlab hai right side 2 bit tak kheenh denge
//               00001 ho jaayega.
    }
}
