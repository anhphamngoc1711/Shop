package com.example.service;

import com.example.dao.SanPhamDAO;
import com.example.daoimp.SanPhamImp;
import com.example.entity.SanPham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanPhamService implements SanPhamImp{

	@Autowired
	SanPhamDAO sanPhamDAO;
	
	@Override
	public List<SanPham> LayDanhSachSanPhamLimit(int spbatdau) {
		
		return sanPhamDAO.LayDanhSachSanPhamLimit(spbatdau);
	}

	@Override
	public SanPham LayDanhSachChiTietSanPhamTheoMa(int masanpham) {
		return sanPhamDAO.LayDanhSachChiTietSanPhamTheoMa(masanpham);
		
	}

	@Override
	public List<SanPham> LayDanhSachSanPhamTheoMaDanhMuc(int madanhmuc) {
		return sanPhamDAO.LayDanhSachSanPhamTheoMaDanhMuc(madanhmuc);
	}

	@Override
	public boolean XoaSanPhamTheoMaSanPham(int masanpham) {
		
		return sanPhamDAO.XoaSanPhamTheoMaSanPham(masanpham);
	}

	@Override
	public boolean ThemSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		return sanPhamDAO.ThemSanPham(sanPham);
	}

	@Override
	public boolean CatNhatSanPham(SanPham sanPham) {
		// TODO Auto-generated method stub
		return sanPhamDAO.CatNhatSanPham(sanPham);
	}

}
