package atm;


import atm.controller.BankBranchController;

public class MainClass {

    public static void main(String[] args) {
        BankBranchController bankBranchController=new BankBranchController();
        bankBranchController.decision();
    }
}
