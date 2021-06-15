package com.example.service;

import com.example.dao.DanhMucDAO;
import com.example.daoimp.DanhMucImp;
import com.example.entity.DanhMucSanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucService implements DanhMucImp{

	@Autowired
	DanhMucDAO danhMucDAO;
	
	@Override
	public List<DanhMucSanPham> LayDanhMuc() {
		return danhMucDAO.LayDanhMuc();
	}

}
