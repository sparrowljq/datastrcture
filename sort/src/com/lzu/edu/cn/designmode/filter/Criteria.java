package com.lzu.edu.cn.designmode.filter;

import java.util.List;
/**
 * 
 * @author junqiangliu
 *	创建标准接口
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
