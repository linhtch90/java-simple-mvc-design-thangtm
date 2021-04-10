package controller;

import model.dao.NhanVienDao;
import view.QuanLyNhanVienView;

public interface QuanLyNhanVienController {
	void setNhanVienDao(NhanVienDao nhanVienDao);

	void setQuanLyNhanVienView(QuanLyNhanVienView lyNhanVienView);

	// load and controller
	void running();
}
