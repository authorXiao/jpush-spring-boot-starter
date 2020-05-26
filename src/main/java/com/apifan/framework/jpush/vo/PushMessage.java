package com.apifan.framework.jpush.vo;

import java.io.Serializable;
import java.util.Map;

/**
 * 待推送消息
 *
 * @author yinzl
 */
public class PushMessage implements Serializable {
    private static final long serialVersionUID = 7913601113654276050L;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 角标
     */
    private Integer badge;

    /**
     * 附加业务参数
     */
    private Map<String, String> extras;

    /**
     * 获取 消息内容
     *
     * @return content 消息内容
     */
    public String getContent() {
        return this.content;
    }

    /**
     * 设置 消息内容
     *
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取 角标
     *
     * @return badge 角标
     */
    public Integer getBadge() {
        return this.badge;
    }

    /**
     * 设置 角标
     *
     * @param badge 角标
     */
    public void setBadge(Integer badge) {
        this.badge = badge;
    }

    /**
     * 获取 附加业务参数
     *
     * @return extras 附加业务参数
     */
    public Map<String, String> getExtras() {
        return this.extras;
    }

    /**
     * 设置 附加业务参数
     *
     * @param extras 附加业务参数
     */
    public void setExtras(Map<String, String> extras) {
        this.extras = extras;
    }
}
