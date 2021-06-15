package com.example.service;

import com.example.dao.MauSanPhamDAO;
import com.example.daoimp.MauSanPhamImp;
import com.example.entity.MauSanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MauSanPhamService implements MauSanPhamImp{
	
	@Autowired
	MauSanPhamDAO mauSanPhamDAO;
	
	@Override
	public List<MauSanPham> LayDanhSachMau() {
		// TODO Auto-generated method stub
		return mauSanPhamDAO.LayDanhSachMau();
	}

}
