package dev.project.atm.main;

import dev.project.atm.controller.BankBranchController;

public class MainClass {

    public static void main(String[] args) {
        BankBranchController bankBranchController=new BankBranchController();
        while(true){
            bankBranchController.allProcess();
        }

    }
}
