package com.CommerceCore.CommerceCore.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentAndShipping {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String country;
    private String regionState;
    private String postalCode;
    private Integer cardNumber;
    private String expirationDate;
    private Integer securityCode;
}
