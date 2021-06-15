package com.example.service;

import com.example.dao.SizeSanPhamDAO;
import com.example.daoimp.SizeSanPhamImp;
import com.example.entity.SizeSanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeSanPhamService implements SizeSanPhamImp{
	
	@Autowired
	SizeSanPhamDAO sizeSanPhamDAO;
	
	@Override
	public List<SizeSanPham> LayDanhSachSize() {
		// TODO Auto-generated method stub
		return sizeSanPhamDAO.LayDanhSachSize();
	}

}
