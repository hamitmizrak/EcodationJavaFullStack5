package tutorials.atm.dao;

import tutorials.atm.dto.BankBranchDto;
import tutorials.atm.dto.SafeDto;
import tutorials.atm.sql.IDaoConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BankBranchDao implements IDaoConnection<SafeDto> {

    //executeUpdate ==> Create-Delete-Update
    //executeQuery  ==> Query

    //CREATE
    @Override
    public void create(SafeDto safeDto) {
        try (Connection connection = getInterfaceConnection()) {
            //transaction açmak
            connection.setAutoCommit(false);
            String sql = "insert into safe (money_type,money_currency,money_amount) values (?,?,?);";
            // Sıralamayı dikkat edin: java.sql.SQLException: No value specified for parameter 3
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, safeDto.getMoneyType());
            preparedStatement.setString(2, safeDto.getMoneyCurrency());
            preparedStatement.setDouble(3, safeDto.getMoneyAmount());
            //effected
            int rowEffected = preparedStatement.executeUpdate();
            if (rowEffected > 0) {
                System.out.println(BankBranchDto.class + " Ekleme Başarılı");
                //commit yapabilsin
                connection.commit();
            } else {
                System.out.println(BankBranchDto.class + " Ekleme Başarısız !!! ");
                //commit yapabilsin
                connection.rollback();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    //LIST
    @Override
    public ArrayList<SafeDto> list() {
        ArrayList<SafeDto> safeDtoArrayList = new ArrayList<>();
        SafeDto safeDto;
        try (Connection connection = getInterfaceConnection()) {
            String sql = "select * from safe";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                safeDto = new SafeDto();
                safeDto.setId(resultSet.getLong("id"));
                safeDto.setMoneyType(resultSet.getString("money_type"));
                safeDto.setMoneyCurrency(resultSet.getString("money_currency"));
                safeDto.setMoneyAmount(resultSet.getDouble("money_amount"));
                safeDto.setDate(resultSet.getString("created_date"));
                safeDtoArrayList.add(safeDto);
            }
            for (SafeDto safeDto1 : safeDtoArrayList) {
                System.out.println(safeDto1);
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return safeDtoArrayList;
    }

    //SUM AMOUNT
    @Override
    public double sumAmount() {
        double sumAmount = 0;
        ArrayList<SafeDto> safeDtoArrayList = new ArrayList<>();
        SafeDto safeDto;
        try (Connection connection = getInterfaceConnection()) {
            //transaction açmak
            connection.setAutoCommit(false);
            String sql = "select * from safe";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                safeDto = new SafeDto();
                safeDto.setMoneyAmount(resultSet.getDouble("money_amount"));
                safeDtoArrayList.add(safeDto);
                sumAmount += Double.valueOf(safeDto.getMoneyAmount());
            }
            System.out.println("Toplam para: " + sumAmount);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return sumAmount;
    }

    @Override
    public double safeSpecialIdsumAmount(long id) {
        double sumAmount = 0;
        ArrayList<SafeDto> safeDtoArrayList = new ArrayList<>();
        SafeDto safeDto;
        try (Connection connection = getInterfaceConnection()) {
            //transaction açmak
            connection.setAutoCommit(false);
            String sql = "select * from safe where id="+id;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                safeDto = new SafeDto();
                safeDto.setMoneyAmount(resultSet.getDouble("money_amount"));
                safeDtoArrayList.add(safeDto);
                sumAmount = Double.valueOf(safeDto.getMoneyAmount());
            }
            System.out.println("Toplam para: " + sumAmount);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return sumAmount;
    }


    //UPDATE
    @Override
    public void update(SafeDto safeDto) {
        try (Connection connection = getInterfaceConnection()) {
            //transaction açmak
            connection.setAutoCommit(false);
            String sql = "update safe set  money_type=? , money_currency=? , money_amount=?  where id=?;";
            // Sıralamayı dikkat edin: java.sql.SQLException: No value specified for parameter 3
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, safeDto.getMoneyType());
            preparedStatement.setString(2, safeDto.getMoneyCurrency());
            preparedStatement.setDouble(3, safeDto.getMoneyAmount());
            preparedStatement.setLong(4, safeDto.getId());
            //effected
            int rowEffected = preparedStatement.executeUpdate();
            if (rowEffected > 0) {
                System.out.println(BankBranchDto.class + " Güncelleme Başarılı");
                //commit yapabilsin
                connection.commit();
            } else {
                System.out.println(BankBranchDto.class + " Güncelleme Başarısız !!! ");
                //commit yapabilsin
                connection.rollback();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    //DELETE
    @Override
    public void delete(SafeDto safeDto) {
        try (Connection connection = getInterfaceConnection()) {
            //transaction açmak
            connection.setAutoCommit(false);
            String sql = "delete from safe where id=?;";
            // Sıralamayı dikkat edin: java.sql.SQLException: No value specified for parameter 3
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, safeDto.getId());
            //effected
            int rowEffected = preparedStatement.executeUpdate();
            if (rowEffected > 0) {
                System.out.println(BankBranchDto.class + " Silme  Başarılı");
                //commit yapabilsin
                connection.commit();
            } else {
                System.out.println(BankBranchDto.class + " Silme Başarısız !!! ");
                //commit yapabilsin
                connection.rollback();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    ////////////////////////////////////////////////////
    public static void main(String[] args) {
        BankBranchDao bankBranchDao = new BankBranchDao();
        SafeDto safeDto = new SafeDto();

        //CREATE
        /*
        safeDto.setMoneyAmount(1000);
        safeDto.setMoneyType("kağıt");
        safeDto.setMoneyCurrency("tr");
        bankBranchDao.create(safeDto);*/

        //UPDATE
       /*
        safeDto.setId(1L);
        safeDto.setMoneyAmount(11);
        safeDto.setMoneyType("kağıt11");
        safeDto.setMoneyCurrency("tr11");
        bankBranchDao.update(safeDto);*/

        //SİLME
        /*
        safeDto.setId(1L);
        bankBranchDao.delete(safeDto);
        */
        double sum = bankBranchDao.sumAmount();
        System.out.println(sum);
        //LIST
        bankBranchDao.list();
    }
}
