package model.dao;

import java.util.ArrayList;

import model.bean.NhanVien;

public interface NhanVienDao {
	void addNhanVien(NhanVien nhanVien);

	ArrayList<NhanVien> getListNhanVien();
}
