package com.gachon.splaship;

import lombok.Data;

@Data
public class RankDto {

    String userName;
    int rank;

    public RankDto(String userName, int rank) {
        this.userName = userName;
        this.rank = rank;
    }
}
