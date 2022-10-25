package com.gachon.splaship.controller;

import com.gachon.splaship.RankDto;
import com.gachon.splaship.service.RankService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class RankController {

    private final RankService rankService;

    @GetMapping(value = "/hello")
    public String hello() {
        return "health check";
    }

    @GetMapping(value = "/rank")
    public List<RankDto> rank() {
        return rankService.getRankList();
    }

    @GetMapping(value = "/new-score")
    public Boolean newScore(@RequestParam(value="name") String name, @RequestParam(value="score") Integer score) {
        return rankService.calculateNewRank(new RankDto(name, score));
    }
}