package com.demoinaction.springannotation.email.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

// 三种import方法
// 直接引入类
// 通过beanDefinition定义
// 通过Selector引入
public class EmailImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return emailImport();
    }

    private String[] emailImport(){
        System.out.println("emailImport");
        List<String> emailImport=new ArrayList<>();
        emailImport.add("com.demoinaction.springannotation.emal.component.EmailClient");
        emailImport.add("com.demoinaction.springannotation.emal.configuration.EmailConfiguration");
        return emailImport.toArray(new String[0]);
    }
}
