package com.lzu.edu.cn.designmode.filter;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author junqiangliu
 *	标准的女性实现类
 */
public class CriteriaMale implements Criteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons=new ArrayList<>();
		for(Person person:persons) {
			if(person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
