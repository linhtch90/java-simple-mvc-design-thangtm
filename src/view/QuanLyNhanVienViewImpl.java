package view;

import java.util.List;
import java.util.Scanner;

import model.bean.NhanVien;

public class QuanLyNhanVienViewImpl implements QuanLyNhanVienView {

	private Scanner scan = new Scanner(System.in);

	@Override
	public int showMenu() {
		System.out.println("----menu----");
		System.out.println("1. input nhan vien");
		System.out.println("2. show list nhan vien");
		System.out.println("3. Exit");
		System.out.print("---> Choice menu:");
		String choice = scan.nextLine();
		return choice.isEmpty() ? -1 : Integer.parseInt(choice);
	}

	@Override
	public NhanVien inputNhanVien() {
		NhanVien nhanVien = new NhanVien();
		System.out.println("Nhap ten nhan vien: ");
		nhanVien.setTen(scan.nextLine());
		System.out.println("2. show list nhan vien");
		nhanVien.setTuoi(Integer.parseInt(scan.nextLine()));
		return nhanVien;
	}

	@Override
	public void showListNhanVien(List<NhanVien> nhanViens) {
		if (!nhanViens.isEmpty()) {
			for (NhanVien nhanVien : nhanViens) {
				System.out.println(String.format("%s %d", nhanVien.getTen(), nhanVien.getTuoi()));
			}
		} else {
			System.out.println("Nhan vien trong");
		}
	}

	@Override
	public void showMessageError(String messageError) {
		System.err.println(messageError);
	}

	@Override
	public void showMessageInfo(String messageInfo) {
		System.out.println(messageInfo);
	}

}
