package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		Student [] student = new Student[n];
		
		for (int i = 0; i < student.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:  %n", i+1);
			sc.nextLine();
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			student[i] = new Student(name, grade1, grade2);
			student[i].gradeAverage();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < student.length; i++) {
			if (student[i].gradeAverage() >= 6.0) {
				System.out.println(student[i].getName());
			}
		}
		
		sc.close();
	}

}