package com.example.daoimp;


import com.example.entity.NhanVien;

public interface NhanVienImp {
	boolean KiemTraDangNhap(String email, String matkhau);
	boolean ThemNhanVien(NhanVien nhanVien);
}
