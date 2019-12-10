package com.java8.lamda.rank;

import java.util.ArrayList;
import java.util.List;

public class RankManager {

    private static RankManager instance;

    private static List<RankVO> rankList = new ArrayList<>();

    public static RankManager getInstance() {
        if (instance == null) {
            instance = new RankManager();
        }
        return instance;
    }

    public void init(int num) {
        for (int i = 0; i < num; i++) {
            long time = System.currentTimeMillis();
            int value = (int) (Math.random() * 100);
            rankList.add(new RankVO(i, 0, time, value, RankEnum.RANK + "_" + i, RankEnum.RANK_NAME + "_" + i));
        }
    }


    public List<RankVO> getRankList(RankInterface rankInterface) {
        List<RankVO> ranks = new ArrayList<>();
        for (RankVO rankVO : rankList) {
            if (rankInterface.condition(rankVO)) {
                ranks.add(rankVO);
            }
        }
        return ranks;
    }

    public static List<RankVO> getRankList() {
        return rankList;
    }

    public static void setRankList(List<RankVO> rankList) {
        RankManager.rankList = rankList;
    }
}
