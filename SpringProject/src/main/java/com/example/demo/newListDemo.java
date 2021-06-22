package com.example.demo;

import org.owasp.encoder.Encode;
import org.owasp.encoder.esapi.ESAPIEncoder;
import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Encoder;
import org.owasp.esapi.errors.ValidationException;
import org.owasp.esapi.reference.DefaultEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.util.ArrayUtils;
import sun.font.Script;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

public class newListDemo {

    private static final Logger LOGGER= LoggerFactory.getLogger(newListDemo.class);

    public static void main(String[] args) throws ValidationException {

        Emp emp1 = new Emp(101, "kush is good");
        Emp emp2 = new Emp(102, "loki");
        Emp emp3 = new Emp(103, "poki");

        Emp[] emps = new Emp[3];
        emps[0] = emp1;
        emps[1] = emp2;
        emps[2] = emp3;

        List<Emp> empList = new ArrayList<Emp>();
        empList.add(emp1);
        empList.add(emp3);
        empList.add(emp2);

        if (empList.get(0).getName() == "kush is goom"){
            System.out.println(empList.get(0).getName() + "*****$$$$$$");
    }
         // List<String> ss = Arrays.stream(emps).map(Emp::getName).filter(s->!s.startsWith("ku")).collect(Collectors.toList());
 //       ss.set( ss.indexOf("loki") ,"-");

//
//        List<String> ss = Arrays.stream(emps).map(Emp::getName).filter(s->!s.startsWith("kush")).collect(Collectors.toList()).stream()
//                .map(s ->  s.equals("poki") ? "Tuborg" : s)
//                .collect(Collectors.toList());
//
//        String aa= String.join(",",ss);
//        System.out.println(aa);


//        List<Object> newItems = items.stream().map(o ->  o.equals("value") ? "new_value" : o).collect(toList());
//        List<String> result = names.stream().filter(s->s.equals("S")).
//                collect(Collectors.toList());
//        System.out.println(result);
//        for(String i:ss){
//            if(i=="kush"){
//                i="-";
//            }
//            if(i=="loki"){
//              ss.remove(i);
//            }
//        }
//        for(String i:ss){
//            System.out.println(i);
//        }

 //       String abc="";
//        for(int i=0;i<emps.length;i++){
//            abc=abc+emps[i].getName()+",";
//        }
//        for (Emp i: emps) {
//            abc=abc+i.getName()+",";
//        }
//        System.out.println(abc);

//        StringBuilder s=new StringBuilder();
//        s.append("kk");
//        s.append(",");
//        s.append("la").append(",");
//
//        for(int i=0;i<4;i++){
//            s.append(i);
//        }
//        System.out.println(s.toString());
//
//
//
//        int n=10;
//        boolean nn=!true;
//        if(n!=0 && n!= 20){
//            System.out.println("we are inside"+nn);
//        }
//        //List<String> dfs= Arrays.asList(emps).stream().map(Emp::getName).collect(Collectors.toList());
//
//      //  System.out.println(dfs);
//     //   ArrayList<String> abcd = new ArrayList<>();
//       // abcd.toJSONString();
//
//
//        String HK="kush,loki";
//        System.out.println(HK.length());
//        System.out.println(HK.substring(0,HK.length()-1));
//        System.out.println(HK.substring(1));
//
//
//        List<Object> organs = new ArrayList<Object>();
//
//        //organs.addAll();
//
//    if(organs!=null){
//        System.out.println("inside organ, it is fake"+organs);
//    }
//
//    newListDemo.LOGGER.debug("user list ********",empList.toString());
//
//    Long temp = 0L;
//
//    Long temp2=temp+1;
//    System.out.println(temp2 );
//    BigDecimal bd=BigDecimal.valueOf(100);
//    System.out.println(bd);
//
//
//       Encoder encoder= ESAPI.encoder();
//      Encoder encoder=DefaultEncoder.getInstance();
//       String abc= encoder.encodeForLDAP("kush");
//       System.out.println(ESAPI.encoder().encodeForLDAP("kush***///@&(())==}}))]]"));
//      int nnn= ESAPI.validator().getValidInteger("RequestParameter","100",0,Integer.MAX_VALUE,false);
//        System.out.println(Integer.parseInt("100"));
//       String bbb= (new SecureRandom()).toString() ;
//      ESAPI.encoder();
    }
}
