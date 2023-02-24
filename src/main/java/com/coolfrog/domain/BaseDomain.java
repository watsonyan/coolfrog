package com.coolfrog.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseDomain {
    private Long id;
    private LocalDateTime createTime;
    private LocalDateTime lastUpdateTime;
}
