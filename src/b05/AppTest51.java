package b05;

public class AppTest {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement(3);
        bookManagement.showAllBookInfor();
        System.out.println("Tong so cuon sach ban chay  la: "+bookManagement.countBook());
        System.out.println("Cuon sach co tong so ban chay nhieu nhat la: "+ bookManagement.findBestseller().printBookInfor());
    }
}
