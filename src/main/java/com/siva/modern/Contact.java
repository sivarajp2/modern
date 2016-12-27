package com.siva.modern;

public class Contact {
	

	    private int id;
	    private String dept;
   

	    public int getId() {
	        return this.id;
	    }

	    public String getDept() {
	        return this.dept;
	    }
	    
	    public int setId(int id) {
	    	this.id = id;
	    	return id;
	    }
	    public String setDept(String dept) {
	    	this.dept = dept;
	        return dept;
	    }
	 
	    public String toString() {
	        return String.format("[%s - %s]", id, dept);
	    }
	}
	

