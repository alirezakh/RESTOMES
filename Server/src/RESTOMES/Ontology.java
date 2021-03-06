
package RESTOMES;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class Ontology{
	private String url;
	private String name;
	private Map<Integer, OntologyClass> ontologyClasses;
	private Map<Integer, ObjectProperty> objectProperties;
	private Map<Integer, DataProperty> dataProperties;

	public Ontology(){
		this.url = "";
		this.name = "";
		this.ontologyClasses = new HashMap<Integer, OntologyClass>();
		this.objectProperties = new HashMap<Integer, ObjectProperty>();
		this.dataProperties = new HashMap<Integer, DataProperty>();
	}

	public Ontology(String url, String name, Map<Integer, OntologyClass> classes, Map<Integer, ObjectProperty> oProperties, Map<Integer, DataProperty> dProperties){	
		this.url = url;
		this.name = name;
		this.ontologyClasses = classes;
		this.objectProperties = oProperties;
		this.dataProperties = dProperties;
	}

	public String getUrl(){
		return this.url;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Map<Integer, OntologyClass> getOntologyClasses(){
		return this.ontologyClasses;
	}

	public void setOntologyClasses(Map<Integer, OntologyClass> classes){
		this.ontologyClasses = classes;
	}

	public Map<Integer, ObjectProperty> getObjectProperties(){
		return this.objectProperties;
	}

	public void setObjectProperties(Map<Integer, ObjectProperty> oProperties){
		this.objectProperties = oProperties;
	}

	public Map<Integer, DataProperty> getDataProperties(){
		return this.dataProperties;
	}

	public void setDataProperties(Map<Integer, DataProperty> dProperties){
		this.dataProperties = dProperties;
	}
}
