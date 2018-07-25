package com.yhc.quick.controller;


import com.yhc.quick.pojo.Word11;
import com.yhc.quick.service.IWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/words")
public class WordsController {

    @Autowired
    private IWordsService wordsService;
//    private WordsDao wordsDao;

//    @ResponseBody
//    @GetMapping("/all")
//    String findAllUser(){
//        return "success";
//    }

    @ResponseBody
    @PostMapping("/selectWords")
    public List<Word11> selectWords(@RequestParam("userId")String userId,
                                    @RequestParam("classId")String classId) {
        return wordsService.selectWords(userId, classId);
    }

}
