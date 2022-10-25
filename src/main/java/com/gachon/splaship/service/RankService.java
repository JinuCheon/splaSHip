package com.gachon.splaship.service;

import com.gachon.splaship.RankDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankService {

    static List<RankDto> rankList = new ArrayList<>();

    public List<RankDto> getRankList() {
        return rankList;
    }

    public void calculateNewRank() {

    }
}
