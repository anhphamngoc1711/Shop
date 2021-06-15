package com.example.service;

import com.example.dao.HoaDonDAO;
import com.example.daoimp.HoaDonImp;
import com.example.entity.HoaDon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoaDonService implements HoaDonImp {
	
	@Autowired
	HoaDonDAO hoaDonDAO;

	@Override
	public int ThemHoaDon(HoaDon hoaDon) {
		return hoaDonDAO.ThemHoaDon(hoaDon);
	}
	
	
}
