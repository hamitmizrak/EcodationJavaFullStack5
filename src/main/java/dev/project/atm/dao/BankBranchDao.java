package dev.project.atm.dao;

import dev.project.atm.dto.SafeDto;
import dev.project.atm.sql.IDaoConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class BankBranchDao implements IDaoConnection<SafeDto> {

    //CREATE
    @Override
    public void create(SafeDto safeDto) {
        try (Connection connection = getInterfaceConnection()) {
            //insert sql
            String sql = "insert into safe (money_type,money_currency,money_amount) values(?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, safeDto.getMoneyType());
            preparedStatement.setString(2, safeDto.getMoneyCurrency());
            preparedStatement.setDouble(3, safeDto.getMoneyAmount());

            //effected
            int rowEffected = preparedStatement.executeUpdate();
            if (rowEffected > 0)
                System.out.println(SafeDto.class + " ekleme başarılı");
            else
                System.out.println(SafeDto.class + " ekleme başarısız !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //LIST
    @Override
    public ArrayList<SafeDto> list() {
        return null;
    }

    //UPDATE
    @Override
    public void update(SafeDto safeDto) {

    }

    //DELETE
    @Override
    public void delete(SafeDto safeDto) {

    }

    public static void main(String[] args) {
        BankBranchDao bankBranchDao=new BankBranchDao();
        SafeDto safeDto=new SafeDto();
        safeDto.setMoneyAmount(2000);
        safeDto.setMoneyType("kağıt");
        safeDto.setMoneyCurrency("lira");
        bankBranchDao.create(safeDto);
    }
}
