package dev.project.atm.dao;

import dev.project.atm.dto.SafeDto;
import dev.project.atm.sql.IDaoConnection;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BankBranchDao implements IDaoConnection<SafeDto> {

    //executeUpdate ==> Create, Update
    //executeQuery  ==> Query

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
        ArrayList<SafeDto> dtoArrayList=new ArrayList<>();
        SafeDto safeDto;
        try (Connection connection = getInterfaceConnection()) {
            //insert sql
            String sql = "select * from safe";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                safeDto=new SafeDto();
                safeDto.setId(resultSet.getLong("id"));
                safeDto.setMoneyType(resultSet.getString("money_type"));
                safeDto.setMoneyCurrency(resultSet.getString("money_currency"));
                safeDto.setMoneyAmount(resultSet.getDouble("money_amount"));
                safeDto.setDate(resultSet.getString("created_date"));
                dtoArrayList.add(safeDto);
            }
            for (SafeDto safeDto1: dtoArrayList) {
                System.out.println(safeDto1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dtoArrayList;
    }

    //SUM amount
    //select sum(money_amount) as sum from safe;
    public double sumAmount() {
        double sumAmount=0;
        ArrayList<SafeDto> listSafeDto=new ArrayList<>();
        SafeDto safeDto=new SafeDto();
        try (Connection connection = getInterfaceConnection()) {
            //insert sql
            String sql = "select * from safe";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                safeDto.setMoneyAmount(resultSet.getDouble("money_amount"));
                listSafeDto.add(safeDto);
                sumAmount+= Double.valueOf(safeDto.getMoneyAmount());
            }
            //System.out.println("Toplam Miktar: "+sumAmount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sumAmount;
    }

    //UPDATE
    @Override
    public void update(SafeDto safeDto) {
        try (Connection connection = getInterfaceConnection()) {
            //insert sql
            String sql = "update safe set money_type=? , money_currency=? , money_amount=? where id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, safeDto.getMoneyType());
            preparedStatement.setString(2, safeDto.getMoneyCurrency());
            preparedStatement.setDouble(3, safeDto.getMoneyAmount());
            preparedStatement.setLong(4, safeDto.getId());

            //effected
            int rowEffected = preparedStatement.executeUpdate();
            if (rowEffected > 0)
                System.out.println(SafeDto.class + " güncelleme başarılı");
            else
                System.out.println(SafeDto.class + " güncelleme başarısız !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //DELETE
    @Override
    public void delete(SafeDto safeDto) {
        try (Connection connection = getInterfaceConnection()) {
            //insert sql
            String sql = "delete from safe where id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, safeDto.getId());

            //effected
            int rowEffected = preparedStatement.executeUpdate();
            if (rowEffected > 0)
                System.out.println(SafeDto.class + " silme başarılı");
            else
                System.out.println(SafeDto.class + " silme başarısız !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BankBranchDao bankBranchDao=new BankBranchDao();
        SafeDto safeDto=new SafeDto();
        safeDto.setId(2L);
        safeDto.setMoneyAmount(1111);
        safeDto.setMoneyType("kağıt11");
        safeDto.setMoneyCurrency("lira11");

        //INSERT
        //bankBranchDao.create(safeDto);

         //LIST
        /*for (SafeDto safeDto1: bankBranchDao.list()) {
            System.out.println(safeDto1);
        }*/

        //Money Amount Sum
        double sum= bankBranchDao.sumAmount();
        System.out.println(sum);

        //UPDATE
        //bankBranchDao.update(safeDto);

        //DELETE
        //bankBranchDao.delete(safeDto);


    }
}
