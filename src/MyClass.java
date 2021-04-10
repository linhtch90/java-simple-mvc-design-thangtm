import controller.QuanLyNhanVienController;
import controller.QuanLyNhanVienControllerImpl;
import model.dao.NhanVienDaoImpl;
import view.QuanLyNhanVienViewImpl;

public class MyClass {
	public static void main(String[] args) {
		QuanLyNhanVienController lyNhanVienController = new QuanLyNhanVienControllerImpl();
		lyNhanVienController.setNhanVienDao(new NhanVienDaoImpl());
		lyNhanVienController.setQuanLyNhanVienView(new QuanLyNhanVienViewImpl());
		lyNhanVienController.running();
	}
}
