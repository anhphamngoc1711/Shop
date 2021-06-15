package com.example.controller;

import com.example.entity.DanhMucSanPham;
import com.example.entity.SanPham;
import com.example.service.DanhMucService;
import com.example.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
	
	@Autowired
	DanhMucService danhMucService;
	
	@Autowired
	SanPhamService sanPhamService;
	
	@GetMapping("/{id}/{tendanhmuc}")
	public String Default(ModelMap modelMap,@PathVariable int id,@PathVariable String tendanhmuc){
		
		List<SanPham> listSanPhams = sanPhamService.LayDanhSachSanPhamTheoMaDanhMuc(id);
		List<DanhMucSanPham> danhMucSanPhams = danhMucService.LayDanhMuc();
		
		modelMap.addAttribute("danhmuc",danhMucSanPhams);
		modelMap.addAttribute("tendanhmuc",tendanhmuc);
		modelMap.addAttribute("listSanPham",listSanPhams);
		
		return "sanpham";
	}
}
