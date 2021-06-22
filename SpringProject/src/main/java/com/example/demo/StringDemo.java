package com.example.demo;

import sun.awt.motif.X11SunUnicode_0;

import javax.crypto.*;
import java.awt.*;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.security.*;
import java.lang.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StringDemo {
    private String abc;

    public String getValue(){
        return this.abc="lokiloki";
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, IOException, IllegalBlockSizeException, InvalidKeyException, NoSuchPaddingException, ClassNotFoundException, BadPaddingException, ParseException {
        StringBuffer sb=new StringBuffer();
        String s=new String();

        sb.append("hi kush");
        System.out.println(sb);
//        sb.delete(0,sb.length());
        s=sb.toString();
        System.out.println(s);
        System.out.println(sb+" 222");
//        int a=Math.random();
        System.out.println("randon--- "+ Math.random());

        GuardedObject xyz=new GuardedObject("abc", new Guard() {
            @Override
            public void checkGuard(Object object) throws SecurityException {

            }
        });

        char[] c={'k','u','s','h'};

        System.out.println(xyz.getObject());
       // System.out.println(String.valueOf(c));
//        c=null;
        //System.out.println(new String(c));

        //Key key= getKeyFromConfiguration();

        System.out.println("********************");

        KeyGenerator key= KeyGenerator.getInstance("AES");
        SecretKey mykey= key.generateKey();
        Cipher cp=Cipher.getInstance("AES/ECB/PKCS5PADDING");
        cp.init(Cipher.ENCRYPT_MODE,mykey);
//        List<Character> characterList= Arrays.asList(c);
//        SealedObject x= new SealedObject((Serializable) characterList,cp);
//        System.out.println(x.getObject(mykey));

       // System.out.println(c.toString());

        byte[] text=String.valueOf(c).getBytes("UTF8");
        cp.init(Cipher.ENCRYPT_MODE,mykey);
        byte[] textE=cp.doFinal(text);

        System.out.println(new String(textE));
        System.out.println(mykey.toString());
        cp.init(Cipher.DECRYPT_MODE,mykey);

        System.out.println(new String(cp.doFinal(textE)).toUpperCase());

        KeyGenerator key9= KeyGenerator.getInstance("AES");
        SecretKey mykey9= key9.generateKey();
        System.out.println(mykey9);

//        Character[] n= (Character[]) x.getObject(mykey);
//        System.out.println(String.valueOf(n))



       // char[] exp=s.toCharArray();
     //   System.out.println(exp[1]);
        //      System.out.println(Crypto);


        String a="LOKI";
        System.out.println(a.toLowerCase());
        a=a.toLowerCase();
        System.out.println(a);



        Timestamp timestamp=new Timestamp(999);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        DateTimeFormatter bb= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS a z");

        System.out.println(timestamp);
        System.out.println("************");
        System.out.println(simpleDateFormat.format(timestamp));



        Timestamp ts = new Timestamp(System.currentTimeMillis());
        ts= timestamp;
        Date d=new Date();
        d.setTime(ts.getTime());

        ZonedDateTime zd = ZonedDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        System.out.println(zd.format(formatter));


        System.out.println("************");


        System.out.println(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-21").getTime()));

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        new Date(sdf.parse("2019-01-21").getTime());
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("yyy-MM-dd");
        LocalDate localDate=LocalDate.parse("2019-01-21",formatter1);
        System.out.println(Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));

       // synchronized ()

        System.out.println("************");


        Long number=new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-21").getTime();
        System.out.println(number);
        System.out.println(new Date(number));


        System.out.println("************");

        DateFormat df =new  SimpleDateFormat("yyyy-MM-dd");
        Date d1=new Date();
        synchronized (df){
             d1=df.parse("2019-01-21");
        }
        System.out.println(d1);

        DecimalFormat decimalFormat=new DecimalFormat(new StringBuilder().toString());

       final SimpleDateFormat se = null;
       SimpleDateFormat ss=new SimpleDateFormat();
       ss=se;
        //System.out.println(LocalDateTime.now().format(bb));

       // System.out.println();
        //LocalDate now=LocalDate.now();
        //String s1=now.format(bb);

         StringDemo stringDemo=new StringDemo();
        System.out.println(stringDemo.getValue()+"hiiii");

        Label label=new Label();
        label.setText("pashiii");

        String xxx=label.getText();
        System.out.println(xxx);

        int temp=99;
        if(temp==9){
            System.out.println("1stttt");
        }
        else if(temp==99){
            System.out.println("2nddd");
        }else{
            System.out.println("endd");
        }

        System.out.println("abc".contains("bc"));

        System.out.println("abc".equalsIgnoreCase("ABC"));

    }
}
