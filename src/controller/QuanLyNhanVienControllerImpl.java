package controller;

import java.util.ArrayList;

import model.bean.NhanVien;
import model.dao.NhanVienDao;
import view.QuanLyNhanVienView;

public class QuanLyNhanVienControllerImpl implements QuanLyNhanVienController {

	private NhanVienDao nhanVienDao;
	private QuanLyNhanVienView quanLyNhanVienView;

	@Override
	public void setNhanVienDao(NhanVienDao nhanVienDao) {
		this.nhanVienDao = nhanVienDao;
	}

	@Override
	public void setQuanLyNhanVienView(QuanLyNhanVienView quanLyNhanVienView) {
		this.quanLyNhanVienView = quanLyNhanVienView;
	}

	@Override
	public void running() {
		int choiceMenu;
		while (true) {
			choiceMenu = quanLyNhanVienView.showMenu();
			switch (choiceMenu) {
				case QuanLyNhanVienView.MENU_ADD_NHANVIEN:
					NhanVien nv = quanLyNhanVienView.inputNhanVien();
					nhanVienDao.addNhanVien(nv);
					break;
				case QuanLyNhanVienView.MENU_SHOW_LIST_NHANVIEN:
					ArrayList<NhanVien> listNhanVien = nhanVienDao.getListNhanVien();
					quanLyNhanVienView.showListNhanVien(listNhanVien);
					break;
				case QuanLyNhanVienView.MENU_EXIT:
					quanLyNhanVienView.showMessageInfo("~~Bye bye!~~");
					System.exit(0);
				default:
					quanLyNhanVienView.showMessageError("Menu khong ton tai");
			}
		}
	}

}
