package com.CommerceCore.CommerceCore.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingInfo {
    private String address;
    private String city;
    private String country;
    private String region_state;
    private String postal_code;

}
