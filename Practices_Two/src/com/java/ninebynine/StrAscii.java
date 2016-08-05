package com.java.ninebynine;

public class StrAscii {
    
    public static void main(String[] args)
    {
     
        StrAscii.stringToBytesASCII("Apple");
    }
    
    public static byte[] stringToBytesASCII(String str) {
 byte[] b = new byte[str.length()];
 for (int i = 0; i < b.length; i++) {
     System.out.println("Before Ascii "+i+" ="+b[i]);
  b[i] = (byte) str.charAt(i);
  System.out.println("After Ascii "+i+" ="+b[i]);

  StrAscii sa=new StrAscii();
  
  System.out.println("Compressed data Bytes "+i+" ="+sa.compressbyte(b[i]));
  System.out.println("Compressed data Slots "+i+" ="+sa.compressslot(b[i]));
  System.out.println("Decompressed data "+i+" ="+ (sa.compressbyte(b[i])*9+sa.compressslot(b[i])));
 }

 return b;
}
 public long compressslot(long x)
 {
     x = x%9;
     return x;
 }
 public long compressbyte(long y)
 {
     y = y/9;
     return y;
 }
}