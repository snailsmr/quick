package com.yhc.quick.service.impl;


import com.yhc.quick.mapper.Word11Mapper;
import com.yhc.quick.pojo.Word11;
import com.yhc.quick.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WordsServiceImpl implements WordsService {

    private int times = 0;  // 用户请求次数
    private int step = 50;  // 每次请求返回的单词条数
    private int start = 0;  // limit左区间
    private int end = step; // 偏移量

    @Autowired
    private Word11Mapper word11Mapper;  // 会显示错误，但是不影响运行
    private Map<List<String>, Integer> map = new HashMap<>();

    @Override
    public List<Word11> selectWords(String userId, String classId) {
        List<String> keyList = new ArrayList<>();
        keyList.add(userId);
        keyList.add(classId);

        boolean status = map.containsKey(keyList);  // 判断当前用户是否已经请求过某个词库

        System.out.println("status**********" + status);

        // 修改后：
        if (status) {   // 非首次请求
            times += 1;
            map.put(keyList, times);
        } else {        // 首次请求
            times = 1;
            map.put(keyList, times);
        }

        if (times >= 2) {
            start = step * (times - 1);
            end = step;
        }

        // 待完善，此处写死先用四级词库进行测试。应该为动态选择词库
        return word11Mapper.selectWords(start, end);
    }


}
