package com.test;

import java.util.ArrayList;
import java.util.List;

public class RankService {

    private static List<RankVO> rankVOList = new ArrayList<RankVO>();

    public static void main(String[] args) {
        RankService rankService = new RankService();
        long t = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            RankVO rankVO = new RankVO();
            rankVO.setId(i);
            rankVO.setData((int) System.currentTimeMillis() / 1000);
            rankVO.setLevel((int) (Math.random() * 10));
            rankService.addRank(rankVO);

        }

        rankVOList.forEach(r -> System.out.println("ID:" + r.getId() + "积分：" + r.getLevel()));

        long time = System.currentTimeMillis() - t;

        System.out.println("执行耗时" + time);

    }

    private void addRank(RankVO rankVO) {

        int size = rankVOList.size();
        int low = 0, high = size - 1;
        while (low <= high) {

            int mid = (low + high) / 2;

            if (mid < 0 || mid >= size) {
                break;
            }

            RankVO rankVO1 = rankVOList.get(mid);

            int i = dbCompare(rankVO1, rankVO);

            if (i < 0) {
                low = mid + 1;
            } else if (i > 0) {
                high = mid - 1;
            } else {
                System.out.println("异常");
            }


        }
        rankVOList.add(low, rankVO);

    }


    private int dbCompare(RankVO r1, RankVO r2) {

        if (r1.getLevel() > r2.getLevel()) {
            return -1;
        }
        if (r1.getLevel() < r2.getLevel()) {
            return 1;
        }

        if (r1.getData() < r2.getData()) {
            return -1;
        }
        if (r1.getData() > r2.getData()) {
            return 1;
        }

        if (r1.getId() < r2.getId()) {
            return -1;
        }
        if (r1.getId() > r2.getId()) {
            return 1;
        }

        return 0;

    }

}

class RankVO {
    private int id;

    private int data;

    private int level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
