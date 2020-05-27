package com.rhb.red.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: rhb
 * @description:
 */
public class RedGenerateUtils {

    /**
     *  二倍均值法生成随机集合
     * @param totalCount
     * @param totalAmount
     * @return
     */
    public static List<Integer> generateDetail(Integer totalCount,Integer totalAmount){
        List<Integer> restList = new ArrayList<>(totalCount);
        if(totalCount>0 && totalAmount>0){
            Integer restCount = totalCount;
            Integer restAmount = totalAmount;
            Random random = new Random();
            for(int i=0;i<totalCount-1;i++){
                Integer curAmount = random.nextInt(restAmount / restCount * 2 - 1) + 1;
                restList.add(curAmount);
                restAmount-=curAmount;
                restCount--;
            }
            restList.add(restAmount);
        }
        return restList;
    }

}
