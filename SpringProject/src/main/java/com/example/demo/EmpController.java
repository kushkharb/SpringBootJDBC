package com.example.demo;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {
    @Autowired
    EmpService service;

    @GetMapping(path ="/emp/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE,MediaType.TEXT_PLAIN_VALUE})
    public Emp Emp(@PathVariable("id") int id){
        try {
            return service.getEmployee(id);
        }catch(Exception e){
            return new Emp(HttpStatus.NOT_FOUND.getReasonPhrase(), HttpStatus.NOT_FOUND.value(),"Employee doesn't exist with this id");
        }
    }
    @PostMapping(path ="/emp/save",produces = MediaType.APPLICATION_JSON_VALUE,consumes =MediaType.APPLICATION_JSON_VALUE)
    public Response saveEmp(@RequestBody Emp emp){
        try{
            return service.saveEmp(emp);
        }catch(Exception e){
            return new Response(HttpStatus.NOT_FOUND.getReasonPhrase(),HttpStatus.NOT_FOUND.value(),e.getMessage());
        }
    }

    @GetMapping(path ="/emp/jdbc/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Emp EmpJdbc(@PathVariable("id") int id){
        try {
            return service.getEmpByJDBC(id);
        }catch(Exception e){
            return new Emp(HttpStatus.NOT_FOUND.getReasonPhrase(), HttpStatus.NOT_FOUND.value(),"Employee doesn't exist with this id");
        }
    }

    @PostMapping(path ="/emp/jdbc/add",produces = MediaType.APPLICATION_JSON_VALUE,consumes =MediaType.APPLICATION_JSON_VALUE)
    public Response addEmp(@RequestBody Emp emp){
        try{
            return service.addEmp(emp);
        }catch(Exception e){
            return new Response(HttpStatus.NOT_FOUND.getReasonPhrase(),HttpStatus.NOT_FOUND.value(),e.getMessage());
        }
    }
}
