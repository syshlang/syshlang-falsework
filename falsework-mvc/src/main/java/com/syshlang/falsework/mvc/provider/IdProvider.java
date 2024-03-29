package com.syshlang.falsework.mvc.provider;

import java.util.UUID;


/**
 * <b>Description:id生成工具</b><br>
 * @author sunys
 * @version 1.0 2016-8-24 下午8:40:29
 */
public class IdProvider {

	/**
	 * Description:通过uuid生成唯一的记录id
	 * @author sunys
	 * @Version 1.0 2016-8-24下午8:40:48 
	 * @return 生成的id
	 */
	public static String createUUIDId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}
}
