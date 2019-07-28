package com.example.demo.service;

import com.example.demo.common.api.CommonResult;

/**
 * 会员管理Service
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     * @param telephone
     * @param atuhCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone,String atuhCode);
}
