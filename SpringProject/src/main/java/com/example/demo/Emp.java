package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
public class Emp extends Response{

    private int id;
    private String name;

    public Emp(){
        super(null,null,null);
    }
    public Emp(int id, String name){
        super(null, null, null);
        this.id = id;
        this.name = name;
    }
    public Emp(String status, Integer httpStatus, String message){
        super(status, httpStatus, message);
    }

    public Emp(int id, String name,String status, Integer httpStatus, String message) {
        super(status, httpStatus, message);
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
