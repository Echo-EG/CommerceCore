package com.CommerceCore.CommerceCore.modal;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;


@Mapper
public interface TaskMapper {

    @Select("SELECT * FROM products")
    ArrayList<Product> getAllProducts();

    @Insert("INSERT INTO shipping_payment (first_name, last_name, email, address, city, country, region_state, postal_code, card_number, expiration_date, security_code )" +
            " VALUES (#{firstName}, #{lastName}, #{email}, #{address}, #{city}, #{country}, #{regionState}, #{postalCode}, #{cardNumber}, #{expirationDate}, #{securityCode})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void addPaymentAndShipping (PaymentAndShipping paymentAndShipping);


}
