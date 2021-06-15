package com.example.service;

import com.example.dao.ChiTietHoaDonDAO;
import com.example.daoimp.ChiTietHoaDonImp;
import com.example.entity.ChiTietHoaDon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChiTietHoaDonService implements ChiTietHoaDonImp {
	
	@Autowired
	ChiTietHoaDonDAO chiTietHoaDonDAO;

	@Override
	public boolean ThemChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		
		return chiTietHoaDonDAO.ThemChiTietHoaDon(chiTietHoaDon);
	}

}
