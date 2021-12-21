package com.why.captcha.utils;

/**
 * @author W
 * @description:
 * @title: RandomResult
 * @projectName WHY-captcha
 * @date 2021/12/21
 * @company WHY-Group
 */
public class RandomResult{

    private String randomStr;

    private String result;

    public String getRandomStr() {
        return randomStr;
    }

    public void setRandomStr(String randomStr) {
        this.randomStr = randomStr;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RandomResult{" +
                "randomStr='" + randomStr + '\'' +
                ", result='" + result + '\'' +
                '}';
    }

}
