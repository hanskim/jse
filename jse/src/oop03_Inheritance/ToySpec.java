package oop03_Inheritance;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {      // ���� ���� Ŭ������ ���̶�� Ŭ������ "use"�Ѵ�.
	private Map<String , Object> properties ; 
	
	public ToySpec(){
		properties = new HashMap<String,Object>();
	}

	public Map<String, Object> getProperties() {
		return properties;
	}
	
	/* �ʿ� Ű�� , �Ӽ��� �߰� */
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	public void setProperty(String pname, Object pValue) {
		properties.put(pname, pValue);
	}

	/*Ű���� ���� �Ӽ����� �ҷ�����*/
	public Object getProperties(String pname){
		return properties.get(pname);
	}
	
	/* �񱳰˻� */
	public boolean match(ToySpec spec){
		String specStr="";
		String thisStr="";
		
		if(spec.getProperties("ToyUser") !=null){
			specStr +=spec.getProperties("ToyUser");
		}
		if(spec.getProperties("ToyType") !=null){
			specStr +=spec.getProperties("ToyType");
			thisStr += spec.getProperties("ToyType");
		}
		return spec.equals(thisStr);
		
	}
	public boolean equals(Object obj){
		return super.equals(obj);
	}
	
	public String toString(  ){
		return properties.toString();
		
	}
	
	
	

}
