package com.example.daoimp;

import com.example.entity.SanPham;

import java.util.List;

public interface SanPhamImp {
	List<SanPham> LayDanhSachSanPhamLimit(int spbatdau);
	SanPham LayDanhSachChiTietSanPhamTheoMa(int masanpham);
	List<SanPham> LayDanhSachSanPhamTheoMaDanhMuc(int madanhmuc);
	boolean XoaSanPhamTheoMaSanPham(int masanpham);
	boolean ThemSanPham(SanPham sanPham);
	boolean CatNhatSanPham(SanPham sanPham);
}
