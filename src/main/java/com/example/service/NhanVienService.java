package com.example.service;

import com.example.dao.NhanVienDAO;
import com.example.daoimp.NhanVienImp;
import com.example.entity.NhanVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService implements NhanVienImp {
	
	@Autowired
	NhanVienDAO nhanVienDAO;

	@Override
	public boolean KiemTraDangNhap(String email, String matkhau) {
		boolean kiemtra = nhanVienDAO.KiemTraDangNhap(email, matkhau);
		return kiemtra;
	}

	@Override
	public boolean ThemNhanVien(NhanVien nhanVien) {
		boolean ktThem = nhanVienDAO.ThemNhanVien(nhanVien);
		return ktThem;
	}
	
	
}
