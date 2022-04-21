package com.example.demo.controller;

import com.example.demo.service.TestService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/hello")
    @ApiOperation(value = "hello, world api", notes = "hellow world swagger check")
    public String hellowWorld() {
        return "hello, world";
    }


    @ApiOperation(value = "test", notes = "테스트입니다")
    @ApiResponses({
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "page not found!")
    })

    @GetMapping(value = "/board")
    public Map<String, String> selectBoard(@ApiParam(value = "샘플번호", required = true, example = "1")
                                           @RequestParam String no) {

        Map<String, String> result = new HashMap<>();
        result.put("test title", "테스트");
        result.put("test contents", "테스트 내용");
        return result;

    }

    @GetMapping(value = "/test")
    public String test() throws Exception {
        Map<String,Object> param = new HashMap<>();
        String result = null;
        result = testService.list(param);
        return result;
    }
}
