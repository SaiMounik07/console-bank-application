package com.gdn.testcasemanagement;

import java.sql.*;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("12345", "sai");
        Customer customer = new Customer(account);

        BankManager bankManager = new BankManager();
        bankManager.addAccount(account);
//        int num=1;
//        String query="Select * from tab where per = ?";
//        String url="jdbc:mysql://localhost:3306/test";
//        String username="root";
//        String password="rootroot";
//
//
//             Connection connection = DriverManager.getConnection(url, username, password);
//             PreparedStatement statement = connection.prepareStatement(query) ;
//             statement.setInt(1, num);
//             ResultSet resultSet = statement.executeQuery();
//             while (resultSet.next()) {
//                int name = resultSet.getInt("per");
//                System.out.println("Name: " + name);
//            }

//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("SQL Exception: " + e.getMessage());
//        }

        while (true) {
            System.out.println("\nBanking Application Login:");
            System.out.println("1. Customer");
            System.out.println("2. Bank Manager");
            System.out.println("3. Exit");
            System.out.print("Choose a role to log in: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    customer.showMenu();
                    break;
                case 2:
                    bankManager.showMenu();
                    break;
                case 3:
                    System.out.println("Thank you for using our banking application!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
