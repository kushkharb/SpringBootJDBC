package com.example.demo;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Encoder;
import org.owasp.esapi.reference.DefaultEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

@Service
public class EmpService {
    @Autowired
    JdbcTemplate jt;

    private static HashMap<Integer,Emp> empDb= new HashMap<>();
    public EmpService() {
        empDb.put(100,new Emp(100,"kush"));
        empDb.put(101,new Emp(101,"poki"));
        empDb.put(102,new Emp(102,"loki"));
    }

    public Emp getEmployee(int id) throws Exception {
        if(empDb.containsKey(id)){
            Emp e=empDb.get(id);
            return new Emp(e.getId(),e.getName(),HttpStatus.OK.getReasonPhrase(),HttpStatus.OK.value(),"Employee exist");
        }else {
            throw new Exception();
        }
    }

    public Response saveEmp(Emp emp) throws Exception {
        if(empDb.containsKey(emp.getId())){
            throw new Exception("Already Exist");
        }
        if(emp!=null){
            empDb.put(emp.getId(),emp);
            return new Response(HttpStatus.OK.getReasonPhrase(),HttpStatus.OK.value(),"Saved Successfully");
        }
        else{
            throw new Exception("Not Saved");
        }
    }

    public Emp getEmpByJDBC(int id) throws Exception {
        Emp emp =	jt.queryForObject("select * from Emp where id="+id, (rs, rowNum) -> new Emp( rs.getInt(1),rs.getString(2)));
        if(emp!=null) {
            emp.setHttpStatus(HttpStatus.OK.value());
            emp.setStatus(HttpStatus.OK.getReasonPhrase());
            emp.setMessage("Employee exist");
            return emp;
        }else {
            throw new Exception();
        }
    }

    public Response addEmp(Emp emp) throws Exception {

        if(emp!=null) {
            int row = jt.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    PreparedStatement pst = connection.prepareStatement("insert into EMP(id,name) values(?,?)");
                    pst.setInt(1, emp.getId());
                    pst.setString(2, emp.getName());
                    return pst;
                }
            });
            return new Response(HttpStatus.OK.getReasonPhrase(), HttpStatus.OK.value(), "Saved Successfully");
        }else {
            throw new Exception("Not Saved");
        }
    }

    public String extrafunction(){
        Encoder encoder= ESAPI.encoder();
        String abc= encoder.encodeForLDAP("kush");
        System.out.println(abc);

     //   Scanner s = new Scanner(Runtime.getRuntime().exec().getInputStream();
        return abc;
    }

}