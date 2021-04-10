package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.bean.NhanVien;

public class NhanVienDaoImpl implements NhanVienDao {
	private List<NhanVien> nhanViens = new ArrayList<NhanVien>();

	@Override
	public void addNhanVien(NhanVien nhanVien) {
		nhanViens.add(nhanVien);
	}

	@Override
	public ArrayList<NhanVien> getListNhanVien() {
		return (ArrayList<NhanVien>) nhanViens;
	}

}
