package org.example.module.common.captcha.domain.response;

import org.example.common.util.JsonUtil;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author linzhaoming
 * @since 2020-12-16
 **/
@ApiModel("验证码")
public class CaptchaResponse {

    @ApiModelProperty("key")
    private String key;

    @ApiModelProperty("验证码图片base64字符串")
    private String image;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return JsonUtil.toJSONString(this);
    }
}
