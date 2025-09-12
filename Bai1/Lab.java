package Bai1;

public class Lab {
    public static void main(String[] args) {
        Fraction phanSo237 = new Fraction(2, 3);
        Fraction another237 = new Fraction(5, 6);

        Fraction tong237 = phanSo237.add(another237);
        Fraction hieu237 = phanSo237.subtract(another237);
        Fraction tich237 = phanSo237.multiply(another237);
        Fraction thuong237 = phanSo237.divide(another237);

        System.out.println("Tổng = " + tong237);
        System.out.println("Hiệu = " + hieu237);
        System.out.println("Tích = " + tich237);
        System.out.println("Thương = " + thuong237 );
        System.out.println(thuong237.isSimplified() ? "Phan so toi gian" : "Phan so chua toi gian");
        thuong237.simplify();
        System.out.println("Thuong = " + thuong237);


    }
}
