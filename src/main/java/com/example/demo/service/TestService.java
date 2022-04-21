package com.example.demo.service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.vo.TestVO;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service("TestService")
public class TestService {

@Autowired
    TestMapper testMapper;
    public String list(Map<String,Object> param)
    {
        TestVO testVO = new TestVO();
        List<TestVO> list = new ArrayList<TestVO>();
        list = testMapper.list(testVO);

        JSONObject objResult = new JSONObject();
        JSONArray array = new JSONArray();
        for(int i = 0; i < list.size(); i++) {
            JSONObject obj = new JSONObject();
            obj.put("id" ,list.get(i).getId());
            obj.put("title" ,list.get(i).getTitle());
            obj.put("content" ,list.get(i).getContent());
            obj.put("writer" ,list.get(i).getWriter());
            obj.put("writerDate" ,list.get(i).getWriterDate());
            obj.put("hit" ,list.get(i).getHit());
            array.put(obj);
        }
        objResult.put("data",array);
        return  objResult.toString();
    }
}
