/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagement;

/**
 *
 * @author HI
 */
public class Main {
    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createNewAccount();
                    break;
                case 2:
                    Manager.loginSystem();
                    break;
                case 3:
                    return;
            }
        }
    }
}
