package view;

import java.util.List;

import model.bean.NhanVien;

public interface QuanLyNhanVienView {
	static final int MENU_ADD_NHANVIEN = 1;
	static final int MENU_SHOW_LIST_NHANVIEN = 2;
	static final int MENU_EXIT = 3;

	int showMenu();

	NhanVien inputNhanVien();

	void showListNhanVien(List<NhanVien> nhanViens);

	void showMessageError(String messageError);

	void showMessageInfo(String messageInfo);
}
