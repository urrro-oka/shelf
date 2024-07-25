package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Customer;

public class CustomerDAO extends DAO {
    public Customer search(String login, String password) throws Exception {
        Customer customer = null;

        // デバッグメッセージを追加
        System.out.println("CustomerDAO: searchメソッド開始");
        System.out.println("login: " + login);
        System.out.println("password: " + password);

        try (Connection con = getConnection()) {
            PreparedStatement st = con.prepareStatement("select * from customer where login=? and password=?");
            st.setString(1, login);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setLogin(rs.getString("login"));
                customer.setPassword(rs.getString("password"));
                customer.setName(rs.getString("name"));

                // 顧客情報取得成功のデバッグメッセージを追加
                System.out.println("顧客情報取得成功: " + customer.getLogin());
            } else {
                // 顧客情報が見つからなかった場合のデバッグメッセージを追加
                System.out.println("顧客情報が見つかりませんでした。");
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            // 例外発生時のデバッグメッセージを追加
            System.err.println("データベース操作中にエラーが発生しました: " + e.getMessage());
            throw e; // 例外を再スローして、呼び出し元でハンドリング
        }

        // デバッグメッセージを追加
        if (customer == null) {
            System.out.println("customerはnullです。");
        } else {
            System.out.println("customerはnullではありません。");
        }

        return customer;
    }
}
