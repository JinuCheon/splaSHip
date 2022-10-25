package com.gachon.splaship;

import lombok.Data;

@Data
public class RankDto {

    String userName;
    int score;

    public RankDto(String userName, int score) {
        this.userName = userName;
        this.score = score;
    }
}
