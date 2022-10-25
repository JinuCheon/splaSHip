package com.gachon.splaship.service;

import com.gachon.splaship.RankDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RankServiceTest {

    @Test
    void 새로운_유저가_랭킹을_갱신() {

        RankService rankService = new RankService();

        Boolean result = rankService.calculateNewRank(new RankDto("새로운유저", 1000));

        Assertions.assertTrue(result);
        Assertions.assertEquals(rankService.getRankList().get(0).getUserName(), "새로운유저");
    }

    @Test
    void 새로운_유저가_랭킹을_갱신하지_못함() {

        RankService rankService = new RankService();

        for(int i=1;i<=10;i++) {
            rankService.calculateNewRank(new RankDto("유저"+i, i*10));
        }

        Boolean result = rankService.calculateNewRank(new RankDto("새로운 유저", 1));

        Assertions.assertFalse(result);
    }
}