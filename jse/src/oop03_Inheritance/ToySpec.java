package oop03_Inheritance;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {      // 토이 스펙 클래스는 토이라는 클래스는 "use"한다.
	private Map<String , Object> properties ; 
	
	public ToySpec(){
		properties = new HashMap<String,Object>();
	}

	public Map<String, Object> getProperties() {
		return properties;
	}
	
	/* 맵에 키값 , 속성값 추가 */
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	public void setProperty(String pname, Object pValue) {
		properties.put(pname, pValue);
	}

	/*키값에 따라서 속성값을 불러오기*/
	public Object getProperties(String pname){
		return properties.get(pname);
	}
	
	/* 비교검색 */
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
