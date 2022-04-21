package com.example.demo.mapper;

import com.example.demo.vo.TestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    public List<TestVO> list(TestVO testVO);
}

