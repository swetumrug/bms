/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author swetu
 */
public class BankDriver {

    public static void main(String args[]) {

        int choice = 0;
        int option1 = 0;
        int option2 = 0;

        Scanner sc = new Scanner(System.in);

        Employee p1 = new PartTime(20.0f, 18.0f, 1, "Kevin", "Patel", "kevin@abc.com", "8881110000", EmployeeType.PartTime);
        Employee p2 = new PartTime(25.0f, 20.0f, 2, "Rahul", "Shah", "rahul@abc.com", "8881112222", EmployeeType.PartTime);

        Employee f1 = new FullTime(5000.0f, 3, "Kavita", "Sukhadia", "kavita@abc.com", "8472223344", EmployeeType.FullTime);
        Employee f2 = new FullTime(5500.0f, 4, "Shilpi", "Sharma", "shilpi@abc.com", "8472223355", EmployeeType.FullTime);
        Employee f3 = new FullTime(10000.0f, 5, "admin", "hr", "admin@abc.com", "8470001111", EmployeeType.FullTime);
        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(p1);
        empList.add(p2);
        empList.add(f1);
        empList.add(f2);
        empList.add(f3);

        Transaction t1 = new Transaction(01, TransactionType.Credit, 100.0f, Instant.now());
        Transaction t2 = new Transaction(02, TransactionType.Debit, 1000.0f, Instant.now());

        ArrayList<Transaction> tranList1 = new ArrayList<Transaction>();
        tranList1.add(t1);
        tranList1.add(t2);

        Account a1 = new Account(001, AccountType.Saving, 5000.0f);
        a1.setTransactionList(tranList1);

        Transaction t3 = new Transaction(03, TransactionType.Credit, 200.0f, Instant.now());
        Transaction t4 = new Transaction(04, TransactionType.Debit, 2000.0f, Instant.now());

        ArrayList<Transaction> tranList2 = new ArrayList<Transaction>();
        tranList2.add(t3);
        tranList2.add(t4);

        Account a2 = new Account(002, AccountType.Checking, 25000.0f);
        a2.setTransactionList(tranList2);

        ArrayList<Account> accList1 = new ArrayList<Account>();
        accList1.add(a1);
        accList1.add(a2);

        Customer c1 = new Customer(001, "Mahasweta", "Thakkar", "mahasweta@gmail.com", "6302221155");
        c1.setAccList(accList1);

        //////////////////////
        Transaction t5 = new Transaction(05, TransactionType.Credit, 300.0f, Instant.now());
        Transaction t6 = new Transaction(06, TransactionType.Debit, 3000.0f, Instant.now());

        ArrayList<Transaction> tranList3 = new ArrayList<Transaction>();
        tranList3.add(t5);
        tranList3.add(t6);

        Account a3 = new Account(003, AccountType.Saving, 6000.0f);
        a3.setTransactionList(tranList3);

        Transaction t7 = new Transaction(07, TransactionType.Credit, 400.0f, Instant.now());
        Transaction t8 = new Transaction(8, TransactionType.Debit, 4000.0f, Instant.now());

        ArrayList<Transaction> tranList4 = new ArrayList<Transaction>();
        tranList4.add(t7);
        tranList4.add(t8);

        Account a4 = new Account(004, AccountType.Checking, 30000.0f);
        a4.setTransactionList(tranList4);

        ArrayList<Account> accList2 = new ArrayList<Account>();
        accList2.add(a3);
        accList2.add(a4);

        Customer c2 = new Customer(002, "Margrate", "Yesuvijs", "margrate@gmail.com", "6302221155");
        c2.setAccList(accList2);

        ArrayList<Customer> cusList = new ArrayList<Customer>();
        cusList.add(c1);
        cusList.add(c2);

        Bank bank = new Bank(1000, "Union Bank", "8881114455", "www.unionbank.com");
        bank.setCusList(cusList);
        bank.setEmpList(empList);

        do {
            menu();
            choice = sc.nextInt();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter username");
            String username = s.nextLine();
            System.out.println("Enter password");
            String password = s.nextLine();

            LoginService loginService = new LoginService();
            Userlogin userlogin = loginService.authenticateUser(username, password);
            if (userlogin == null) {
                System.err.println("Invalid  Username/Password");
                break;
            } else {
                System.out.println("Login Success");
                System.out.println("Welcome " + userlogin.getFirstName());
                if (userlogin.isEmployee) {
                    System.out.println("Employee Page");
                } else {
                    System.out.println("Customer Page");
                }
            }

            switch (choice) {
                case 1:
                    do {
                        bankMenu();
                        option2 = sc.nextInt();
                        switch (option2) {
                            case 1:
                                System.out.println(bank);
                                try {
                                    FileWriter fw = new FileWriter(("c:\\data\\bms.txt"), true);

                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write("===============Bank ===================\n");
                                    bw.write(bank.getBid() + "|" + bank.getName() + "|" + bank.getPhone() + "|" + bank.getWebURL() + "\n");

                                    bw.close();

                                    fw.close();
                                    break;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 2:
                                System.out.println("Add and Save Employee");
                                try {
                                    FileWriter fw = new FileWriter(("c:\\data\\bms.txt"), true);

                                    BufferedWriter bw = new BufferedWriter(fw);

                                    bw.write("================Employee[s] ================\n");
                                    System.out.println("Enter Employee ID:");
                                    int eid = sc.nextInt();

                                    System.out.println("Enter Employee's First Name");
                                    String empfirst = sc.next();

                                    System.out.println("Enter Employee's Last Name");
                                    String emplast = sc.next();

                                    System.out.println("Enter Employee's Email ");
                                    String empemail = sc.next();

                                    System.out.println("Enter Employee's Phone ");
                                    String empphone = sc.next();

                                    System.out.println("Enter Employee Type ");
                                    String empType = sc.next();

                                    if (empType.equalsIgnoreCase("FullTime")) {
                                        System.out.println("Enter Employee's Monthly Salary:");
                                        float salary = sc.nextFloat();
                                        Employee emp = new FullTime(salary, eid, empfirst, emplast, empemail, empphone, EmployeeType.FullTime);

                                        empList.add(emp);
                                        bank.setEmpList(empList);
                                        System.out.println(emp);

                                    } else if (empType.equalsIgnoreCase("PartTime")) {
                                        System.out.println("Enter hours:");
                                        float hours = sc.nextFloat();
                                        System.out.println("Enter Hourly Rate:");
                                        float rate = sc.nextFloat();
                                        Employee emp = new PartTime(hours, rate, eid, empfirst, emplast, empemail, empphone, EmployeeType.PartTime);

                                        empList.add(emp);
                                        bank.setEmpList(empList);
                                        System.out.println(emp);

                                    } else {
                                        System.out.println("enter valid employeeType as FullTime or PartTime");
                                        //break;
                                    }

                                    for (Employee e : bank.empList) {

                                        bw.write(e.getEid() + "|" + e.getFirst() + "|" + e.getLast() + "|" + e.getEmail() + "|" + e.getPhone() + "|" + e.getEmpType() + "|");
                                        if (e instanceof FullTime) {
                                            bw.write(((FullTime) e).getSalary() + "" + "\n");
                                        } else {
                                            bw.write(((PartTime) e).getHours() + "|" + ((PartTime) e).getRate() + "" + "\n");
                                        }
                                        bw.write("\n");

                                    }
                                    bw.close();

                                    fw.close();
                                    break;
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }

                                break;
                            case 3:
                                System.out.println("Employee List");
                                System.out.println(bank.empList);
                                break;
                            default:
                                break;
                        }
                        //break;
                    } while (option2 != 3);

                    break;
                case 2:
                    do {
                        employeeMenu();
                        option1 = sc.nextInt();

                        switch (option1) {
                            case 1:
                                try {
                                FileWriter fw = new FileWriter(("c:\\data\\bms.txt"), true);

                                BufferedWriter bw = new BufferedWriter(fw);

                                bw.write("================Customer[s] ================\n");

                                System.out.println("1. Add and Customer and open an account:");
                                System.out.println("cid:");
                                int cid = sc.nextInt();
                                System.out.println("first:");
                                String first = sc.next();
                                System.out.println("last:");
                                String last = sc.next();
                                System.out.println("email:");
                                String email = sc.next();
                                System.out.println("phone:");
                                String phone = sc.next();

                                for (int i = 0; i < 2; i++) {
                                    System.out.println("aid:");
                                    int aid = sc.nextInt();

                                    System.out.println("account type:Saving or Checking?");
                                    String acctype = sc.next();
                                    int balance = 0;

                                    if (acctype.equalsIgnoreCase("saving")) {
                                        Account acc = new Account(aid, AccountType.Saving, balance);
                                        ArrayList<Account> accList = new ArrayList<Account>();
                                        accList.add(acc);
                                        Customer cus = new Customer(cid, first, last, email, phone);
                                        cus.setAccList(accList);

                                        cusList.add(cus);
                                        bank.setCusList(cusList);
                                        System.out.println(cus);
                                        //break;
                                    } else if (acctype.equalsIgnoreCase("checking")) {
                                        Account acc = new Account(aid, AccountType.Checking, balance);
                                        ArrayList<Account> accList = new ArrayList<Account>();
                                        accList.add(acc);
                                        Customer cus = new Customer(cid, first, last, email, phone);
                                        cus.setAccList(accList);
                                        cusList.add(cus);
                                        bank.setCusList(cusList);
                                        System.out.println(cus);

                                    } else {
                                        System.out.println("Enter valid account type!");
                                        //break;
                                    }
                                    System.out.println("Do you want to open another account?");
                                    System.out.println("yes or no?");
                                    String ans = sc.next();
                                    if (ans.equalsIgnoreCase("yes")) {
                                        continue;
                                    } else {
                                        break;
                                    }

                                }
                                for (Customer cus : bank.cusList) {

                                    bw.write(cus.getCid() + "|" + cus.getFirst() + "|" + cus.getLast() + "|" + cus.getEmail() + "|" + cus.getPhone() + "|" + cus.getAccList() + "\n");

                                    bw.write("\n");

                                }

                                bw.close();

                                fw.close();
                                // break;

                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                            break;
                            case 2:
                                System.out.println("2. Find Customer[]");
                                System.out.println("Enter your cid:");
                                int cid1 = sc.nextInt();
                                boolean found = false;
                                for (Customer cus : bank.getCusList()) {
                                    if (cus.getCid() == cid1) {
                                        System.out.println(cus);
                                        found = true;
                                        break;
                                    }
                                }
                                if (found == false) {
                                    System.out.println("For this id - Customer does not exit");
                                }
                                break;
                            case 3:
                                System.out.println("3. Print Customers[]");
                                System.out.println(bank.cusList);
                                break;
                            case 4:
                                System.out.println("4. Print Customer's Transactions");
                                System.out.println("Enter your cid:");
                                int cid2 = sc.nextInt();
                                boolean found1 = false;
                                for (Customer cus : bank.getCusList()) {
                                    if (cus.getCid() == cid2) {
                                        System.out.println(cus);
                                        System.out.println(cus.getAccList());

                                        for (Account acc : cus.getAccList()) {

                                            System.out.println(acc.getTransactionList());
                                        }

                                        found1 = true;
                                        break;
                                    }
                                }
                                if (found1 == false) {
                                    System.out.println("For this id - Customer does not exit");
                                }

                                break;
                            default:
                                break;

                        }
                        //break;
                    } while (option1 != 5);

                    break;
                case 3:
                    System.out.println("Enter Customer ID:");
                    System.out.println("Enter your cid:");
                    int cid2 = sc.nextInt();

                    boolean found1 = false;
                    for (Customer cus : bank.getCusList()) {
                        if (cus.getCid() == cid2) {
                            System.out.println("Enter Acc id:");
                            int aid2 = sc.nextInt();
                            boolean found2 = false;
                            for (Account acc : cus.getAccList()) {

                                if (acc.getAid() == aid2) {
                                    System.out.println(acc);

                                    customerMenu();
                                    int option3 = sc.nextInt();
                                    switch (option3) {
                                        case 1:
                                            System.out.println("Deposit");
                                            System.out.println("How much do you want to deposit?");
                                            float amount1 = sc.nextFloat();
                                            System.out.println("Transaction id");
                                            int tid1 = sc.nextInt();
                                            Transaction tran1 = new Transaction(tid1, TransactionType.Credit, amount1, Instant.now());
                                            float b1 = acc.getBalance();
                                            b1 = b1 + amount1;
                                            acc.setBalance(b1);
                                            System.out.println("Account Details" + acc);
                                            System.out.println("Transaction Details:" + tran1);
                                            break;
                                        case 2:
                                            System.out.println("Withdraw");
                                            System.out.println("How much do you want to withdraw?");
                                            float amount2 = sc.nextFloat();
                                            System.out.println("Transaction id");
                                            int tid2 = sc.nextInt();
                                            Transaction tran2 = new Transaction(tid2, TransactionType.Debit, amount2, Instant.now());
                                            float b2 = acc.getBalance();
                                            b2 = b2 - amount2;
                                            acc.setBalance(b2);
                                            System.out.println("Account details" + acc);
                                            System.out.println("Transaction Details:" + tran2);
                                            break;
                                        case 3:
                                            System.out.println("Check Account Balance");
                                            System.out.println(acc);
                                            break;
                                        case 4:
                                            System.out.println("Print Accounts List");
                                            System.out.println(cus.accList);
                                            break;

                                        default:
                                            break;
                                    }

                                    found2 = true;
                                    break;
                                }

                            }
                            if (found2 == false) {
                                System.out.println("For this id - Account does not exit");
                            }
                            found1 = true;
                            break;
                        }
                    }
                    if (found1 == false) {
                        System.out.println("For this id - Customer does not exit, enter valid cid");
                    }
                    break;
                default:
                    break;

            }
            break;
        } while (choice != 4);

    }

    public static void menu() {
        System.out.println("1. Bank Admin/HR");
        System.out.println("2. Employee");
        System.out.println("3. Customer");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
    }

    public static void bankMenu() {
        System.out.println("1. Print Bank Information");
        System.out.println("2. Add and Save Employee");
        System.out.println("3. Print Employees List");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
    }

    public static void employeeMenu() {
        System.out.println("1. Add Customer and open an account:");
        System.out.println("2. Find Customer[]");
        System.out.println("3. Print Customers");
        System.out.println("4. Print Customer's Transactions");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
    }

    public static void customerMenu() {
        System.out.println("1. Deposit and Print Transaction");
        System.out.println("2. Withdraw and Print Transaction");
        System.out.println("3. Check Account Balance");
        System.out.println("4. Print Accounts");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
    }

}
