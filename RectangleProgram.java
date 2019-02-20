package SS1TH3;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào chiều dài của hình chữ nhật");
        weight = scn.nextFloat();
        System.out.println("Mời bạn nhập vào chiều dài của hình chữ nhật");
        height = scn.nextFloat();
        float area = weight*height;
        System.out.println("Area = " + area);

    }
}
