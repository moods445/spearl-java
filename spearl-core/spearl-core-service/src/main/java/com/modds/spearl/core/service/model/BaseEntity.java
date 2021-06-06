package com.modds.spearl.core.service.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;

import java.util.Date;

public class BaseEntity {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Date createTime;
    private Date updateTime;

    private Boolean deleted;

    /**
     * 版本号
     */
    @Version
    private Long version;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建人ID
     */
    private Long creatorId;
}
