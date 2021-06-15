package com.example.controller;

import com.example.entity.DanhMucSanPham;
import com.example.entity.MauSanPham;
import com.example.entity.SanPham;
import com.example.entity.SizeSanPham;
import com.example.service.DanhMucService;
import com.example.service.MauSanPhamService;
import com.example.service.SanPhamService;
import com.example.service.SizeSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/themsanpham")
public class ThemSanPhamController {

	@Autowired
	SanPhamService sanPhamService;
	
	@Autowired
	DanhMucService danhMucService;
	
	@Autowired
	MauSanPhamService mauSanPhamService;
	
	@Autowired
	SizeSanPhamService sizeSanPhamService;
	
	@GetMapping
	public String Default(ModelMap modelMap){
		List<SanPham> listSanPhams =  sanPhamService.LayDanhSachSanPhamLimit(0);
		List<SanPham> allSanPham = sanPhamService.LayDanhSachSanPhamLimit(-1);
		List<DanhMucSanPham> danhMucSanPhams = danhMucService.LayDanhMuc();
		List<MauSanPham> listMauSanPham = mauSanPhamService.LayDanhSachMau();
		List<SizeSanPham> listSizeSanPham = sizeSanPhamService.LayDanhSachSize();
		
		double tongsopage = Math.ceil((double) allSanPham.size() / 5);
		modelMap.addAttribute("listSanPham", listSanPhams);
		modelMap.addAttribute("allSanPham", allSanPham);
		modelMap.addAttribute("tongsopage", tongsopage);
		modelMap.addAttribute("danhmuc",danhMucSanPhams);
		modelMap.addAttribute("listsize",listSizeSanPham);
		modelMap.addAttribute("listmau",listMauSanPham);
		
		return "themsanpham";
	}
}
