package com.chenyu;

/**
 * 品牌
 *
 * @author
 * @create 2018-01-24 17:15
 **/
public interface Brand {

    /**
     * 销售品牌
     */
    void sale();
}

/**
 * 联想
 */
class LenveoBrand implements Brand {

    @Override
    public void sale() {
        System.out.println("销售联想");
    }
}

/**
 * 华为
 */
class HuaweiBrand implements Brand {

    @Override
    public void sale() {
        System.out.println("销售华为");
    }
}