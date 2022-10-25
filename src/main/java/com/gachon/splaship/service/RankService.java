package com.gachon.splaship.service;

import com.gachon.splaship.RankDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RankService {


    static List<RankDto> rankList = new ArrayList<>();

    public RankService() {
        for(int i=0;i<10;i++) {
            rankList.add(new RankDto("Unknown", 0));
        }
    }

    public List<RankDto> getRankList() {
        return rankList;
    }

    public Boolean calculateNewRank(RankDto newRanker) {
        if(rankList.get(9).getScore() < newRanker.getScore()) {
            rankList.remove(9);
            rankList.add(newRanker);
            rankList = rankList.stream().sorted(Comparator.comparing(RankDto::getScore).reversed()).collect(Collectors.toList());
            return true;
        }
        else {
            return false;
        }
    }
}
