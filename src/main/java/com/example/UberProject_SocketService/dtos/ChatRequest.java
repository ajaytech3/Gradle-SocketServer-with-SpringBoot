package com.example.UberProject_SocketService.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatRequest {

    private  String name;
    private String message;
}
