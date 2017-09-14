package online.shixun.common;

import org.hibernate.dialect.MySQL5Dialect;

/**
 * 引擎 MyISAM
 * 编码 UTF-8
 */
public class MySQL5MyISAMUTF8Dialect extends MySQL5Dialect {

	@Override
	public String getTableTypeString() {
		return " ENGINE=MyISAM DEFAULT CHARSET=UTF8";
	}

}
