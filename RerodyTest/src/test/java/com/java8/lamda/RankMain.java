package com.java8.lamda;

import com.java8.lamda.rank.RankManager;
import com.java8.lamda.rank.RankVO;

import java.util.List;

public class RankMain {

    public static void main(String[] args) {

        RankManager rankManager = RankManager.getInstance();
        rankManager.init(100);

        List<RankVO> rankList = rankManager.getRankListFilter(r -> r.getValue() > 90);

        rankList.forEach(r -> System.out.println(r.getValue()));

    }

}
