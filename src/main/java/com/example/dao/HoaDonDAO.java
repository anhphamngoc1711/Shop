package com.example.dao;

import com.example.daoimp.HoaDonImp;
import com.example.entity.HoaDon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HoaDonDAO implements HoaDonImp {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public int ThemHoaDon(HoaDon hoaDon) {
		Session session = sessionFactory.getCurrentSession();
		int id = (int) session.save(hoaDon);
		if(0 < id){
			return id;
		}else{
			return 0;
		}
		
	}

}
