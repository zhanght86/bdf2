package com.bstek.bdf2.core.orm.hibernate;

import org.hibernate.EmptyInterceptor;

import com.bstek.dorado.util.proxy.ProxyBeanUtils;

/**
 * @author Benny Bao (mailto:benny.bao@bstek.com)
 * @since 2010-11-26
 */
public class UnByteCodeProxyInterceptor extends EmptyInterceptor {
	public static final String BEAN_ID="bdf2.unByteCodeProxyInterceptor";
	private static final long serialVersionUID = -6422637558312349795L;
	@Override
	public String getEntityName(Object object) {
		if (object != null) {
			Class<?> cl = ProxyBeanUtils.getProxyTargetType(object);
			return cl.getName();
		} else {
			return null;
		}
	}

}
