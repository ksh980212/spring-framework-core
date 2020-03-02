package com.springframework.free.demo;

import java.lang.annotation.*;

/** Source로 변경하면 컴파일 전에 사라짐 */
/** Runtime 런타임까지 가져감 */

/** 어노테이션을 클래스까지 가져감 (컴파일 후) */

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PerLogging {
}
