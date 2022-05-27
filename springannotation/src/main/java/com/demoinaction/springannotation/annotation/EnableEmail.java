package com.demoinaction.springannotation.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

// javadoc文档处理？？
@Documented
// 注解有效期： 开发阶段，代码审查辅助 SOURCE; 编译时候预处理，动态生成代码 Class; 运行时候要用，比如执行加载操作 Runtime
@Retention(RetentionPolicy.RUNTIME)
// Target 注解作用域 通过ElementType选定范围
@Target(ElementType.TYPE)
// 将指定的类注入到Ioc 三种注入方式，添加类直接注入，通过ImportBeanDefinitonRegistrar注入；通过ImportSelector注入
@Import(EmailImportSelector.class)
public @interface EnableEmail {

}
