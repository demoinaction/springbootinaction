package com.demoinaction.springannotation.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

public class EmailImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return emailImport();
    }

    private String[] emailImport(){
        System.out.println("emailImport");
        List<String> emailImport=new ArrayList<>();
        emailImport.add("com.demoinaction.springannotation.component.EmailClient");
        emailImport.add("com.demoinaction.springannotation.configuration.EmailConfiguration");
        return emailImport.toArray(new String[0]);
    }
}
