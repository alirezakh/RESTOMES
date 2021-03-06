package RESTOMES;

import java.util.ArrayList;

public class OntologyClass{
    private String className;
    private ArrayList<OntologyClass> subClassOf;
    private ArrayList<OntologyClass> disjointWith;
    
    public OntologyClass(){
	this.className = "";
	this.subClassOf = new ArrayList<OntologyClass>();
	this.disjointWith = new ArrayList<OntologyClass>();
    }

    public OntologyClass(String name){
	this.className = name;
	this.subClassOf = new ArrayList<OntologyClass>();
	this.disjointWith = new ArrayList<OntologyClass>();
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
    
    public ArrayList<OntologyClass> getDisjointWith(){
    	return this.disjointWith;
    }
    
    public void setDisjointWith(ArrayList<OntologyClass> disjointWith){
    	this.disjointWith = disjointWith;
    }
}
