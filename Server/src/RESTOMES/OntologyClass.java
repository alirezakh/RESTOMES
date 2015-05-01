package RESTOMES;

import java.util.ArrayList;

public class OntologyClass{
    private String className;
    private ArrayList<OntologyClass> subClassOf;
    
    public OntologyClass(){
	this.className = "";
    }

    public OntologyClass(String name){
	this.className = name;
    }

    public String getClassName(){
	return this.className;
    }

    public void setClassName(String name){
	this.className = name;
    }
    
    public ArrayList<OntologyClass> getSubClassOf(){
    	return this.subClassOf;
    }
    
    public void setSubClassOf(ArrayList<OntologyClass> subClassOf){
    	this.subClassOf = subClassOf;
    }
}
