package com.example.Ecommerce.Dto.RequestDto;

import lombok.Data;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CheckoutCartRequestDto {

    String customerEmail;

    String cardNo;

    int cvv;
}