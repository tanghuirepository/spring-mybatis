package com.springmybatis.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})

@Retention(RetentionPolicy.RUNTIME)

public @interface ReadOnlyConnection {

    DbContextHolder.DbType value() default DbContextHolder.DbType.READ;

}