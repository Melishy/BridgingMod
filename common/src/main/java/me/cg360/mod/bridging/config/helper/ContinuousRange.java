package me.cg360.mod.bridging.config.helper;

import dev.isxander.yacl3.api.controller.ValueFormatter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ContinuousRange {

    float min();
    float max();

    float sliderStep() default 0.1f;
}
