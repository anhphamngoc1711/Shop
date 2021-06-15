package com.example.controller;

import com.example.entity.ChiTietHoaDon;
import com.example.entity.ChiTietHoaDonId;
import com.example.entity.GioHang;
import com.example.entity.HoaDon;
import com.example.service.ChiTietHoaDonService;
import com.example.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("giohang/")
public class GioHangContronller {
	
	@Autowired
	HoaDonService hoaDonService;
	
	@Autowired
	ChiTietHoaDonService chiTietHoaDonService;
	
	@GetMapping
	public String Default(HttpSession httpSession, ModelMap modelMap){
		if(null != httpSession.getAttribute("giohang")){
			List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
			modelMap.addAttribute("soluongsanphamgiohang",gioHangs.size());
			modelMap.addAttribute("giohangs",gioHangs);
		}
		return "giohang";
	}
	
	@PostMapping
	public String ThemHoaDon(HttpSession httpSession, @RequestParam String tenkhachhang,@RequestParam String sodt,@RequestParam String diachigiaohang,@RequestParam String hinhthucgiaohang,@RequestParam String ghichu){
		
		if(null != httpSession.getAttribute("giohang")){
			List<GioHang> gioHangs = (List<GioHang>) httpSession.getAttribute("giohang");
			
			HoaDon hoaDon = new HoaDon();
			hoaDon.setTenkhachhang(tenkhachhang);
			hoaDon.setSodt(sodt);
			hoaDon.setDiachigiaohang(diachigiaohang);
			hoaDon.setHinhthucgiaohang(hinhthucgiaohang);
			hoaDon.setGhichu(ghichu);
			
			int idHoaDon = hoaDonService.ThemHoaDon(hoaDon);
			if(idHoaDon > 0){
				Set<ChiTietHoaDon> listChiTietHoaDons = new HashSet<>();
				for (GioHang gioHang : gioHangs) {
					ChiTietHoaDonId chiTietHoaDonId = new ChiTietHoaDonId();
					chiTietHoaDonId.setMachitietsanpham(gioHang.getMachitiet());
					chiTietHoaDonId.setMahoadon(hoaDon.getMahoadon());
					
					ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
					chiTietHoaDon.setChiTietHoaDonId(chiTietHoaDonId);
					chiTietHoaDon.setGiatien(gioHang.getGiatien().toString());
					chiTietHoaDon.setSoluong(gioHang.getSoluong());
					
					chiTietHoaDonService.ThemChiTietHoaDon(chiTietHoaDon);
				}
			}else{
				System.out.println("Them tb");
			};	
			
		}
		
		return "giohang";
	}
}
