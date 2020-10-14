package com.example.demospringboot.pojo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@XmlRootElement
public class Message {

    private String message;

    private String date;

}
