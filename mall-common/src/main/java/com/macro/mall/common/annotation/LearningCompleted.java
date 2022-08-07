package com.macro.mall.common.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LearningCompleted {
}
