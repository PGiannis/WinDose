
import java.util.Scanner;

public class Informations extends Covid_19 {
	int id;
	int age;
	int option;
	String name;
	String surename;
	String positive;
	String negative;
	String sex;
	String Location;
	String State;

	public void elements() {

	}

	public String changeState(String x) {
		this.State = x;
		return State;

	}

	public static void main(String[] args) {
		System.out.println("�������� �� ������ �� ������");
		System.out.println("������� 1 �� ������ �� ����� �������� ���� ������");
		System.out.println("������� 2 �� ������ �� �������� ��� ��������� ���� ������");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		int i = option;
		while (i != 1 && i != 2) {
			System.out.println("���� ���� ������!");
			System.out.println("�������� �������� ���� ������");
			int options = input.nextInt();
			i = options;

		}

		if (i == 1) {
			System.out.println("�������� ID ������");
			int id = input.nextInt();
			System.out.println();
		} else if (i == 2) {
			System.out.println("�������� ID ������");
			int id = input.nextInt();

			System.out.println("���� ���� ������!");
			System.out.println("�������� �������� ���� ������");
			int options = input.nextInt();
			options = option;

		}

	}
}