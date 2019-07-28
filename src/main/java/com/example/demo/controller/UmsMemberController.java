package com.example.demo.controller;

import com.example.demo.common.api.CommonResult;
import com.example.demo.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "UmsMemberController",description = "会员登录注册管理")
@Controller
@RequestMapping("/sso")
public class UmsMemberController {

    @Autowired
    private UmsMemberService service;

    /**
     * 获取验证码
     * @param telephone
     * @return
     */
    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getAuthCode(@RequestParam @ApiParam("手机号码") String telephone){
        return service.generateAuthCode(telephone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verfyAuthCode",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult verfyAuthCode(@RequestParam @ApiParam("手机号码") String telephone,@RequestParam @ApiParam("验证码") String authCode){
        return service.verifyAuthCode(telephone, authCode);
    }
}
