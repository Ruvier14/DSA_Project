package project;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private String phoneNumber;
	private String address;
	private String clubOrOrg;
	private int gradeLevel;

	public Student(String name, String phoneNumber, String address, String clubOrOrg, int gradeLevel) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.clubOrOrg = clubOrOrg;
		this.gradeLevel = gradeLevel;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Phone Number: " + phoneNumber + ", Address: " + address + ", Club/Org: " + clubOrOrg
				+ ", Grade Level: " + gradeLevel;
	}
}

public class StudentManager {
	private ArrayList<Student> studentList;

	public StudentManager() {
		studentList = new ArrayList<>();
	}

	public void addStudent(String name, String phoneNumber, String address, String clubOrOrg, int gradeLevel) {
		studentList.add(new Student(name, phoneNumber, address, clubOrOrg, gradeLevel));
	}

	public Student retrieveStudent(int index) {
		if (index >= 0 && index < studentList.size()) {
			return studentList.get(index);
		}
		return null;
	}

	public void removeStudent(int index) {
		if (index >= 0 && index < studentList.size()) {
			studentList.remove(index);
			System.out.println("Student removed successfully.");
		} else {
			System.out.println("Invalid index. Student not found.");
		}
	}

	public void displayStudentProfiles() {
		if (studentList.isEmpty()) {
			System.out.println("No student profiles available.");
		} else {
			System.out.println("Student Profiles:");
			for (int i = 0; i < studentList.size(); i++) {
				System.out.println((i + 1) + ". " + studentList.get(i));
			}
		}
	}

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println(
					"\n1. Add Student\n2. Retrieve Student\n3. Remove Student\n4. Display Student Profiles\n5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter student name: ");
				String name = scanner.nextLine();
				System.out.print("Enter student phone number: ");
				String phoneNumber = scanner.nextLine();
				System.out.print("Enter student address: ");
				String address = scanner.nextLine();
				System.out.print("Enter student grade level (integer or string): ");
				String gradeLevelInput = scanner.nextLine();
				int gradeLevel;
				try {
					gradeLevel = Integer.parseInt(gradeLevelInput);
				} catch (NumberFormatException e) {
					gradeLevel = -1; // Set to -1 to indicate it's not an integer
				}
				System.out.print("Enter student club/org: ");
				String clubOrOrg = scanner.nextLine();
				manager.addStudent(name, phoneNumber, address, clubOrOrg, gradeLevel);
				break;
			case 2:
				System.out.print("Enter index of student to retrieve: ");
				int indexRetrieve = scanner.nextInt();
				scanner.nextLine(); // consume newline
				Student retrievedStudent = manager.retrieveStudent(indexRetrieve - 1);
				if (retrievedStudent != null) {
					System.out.println("Retrieved Student: " + retrievedStudent);
				} else {
					System.out.println("Invalid index. Student not found.");
				}
				break;
			case 3:
				System.out.print("Enter index of student to remove: ");
				int indexRemove = scanner.nextInt();
				scanner.nextLine(); // consume newline
				manager.removeStudent(indexRemove - 1);
				break;
			case 4:
				manager.displayStudentProfiles();
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		} while (choice != 5);

		scanner.close();
	}
}