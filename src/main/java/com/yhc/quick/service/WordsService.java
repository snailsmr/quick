package com.yhc.quick.service;


import com.yhc.quick.pojo.Word11;

import java.util.List;

public interface WordsService {

    // 分批返回单词列表
    List<Word11> selectWords(String userId, String classId);

}
