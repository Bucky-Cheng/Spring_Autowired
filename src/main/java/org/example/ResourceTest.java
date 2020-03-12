package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ResourceTest {

    public void getResource(ApplicationContext context) throws IOException {
        Resource resource=context.getResource("org\\example\\aaa.txt");

        if (resource.exists()) {
            System.out.println("文件存在");
        }else {
            System.out.println("文件不存在");
        }
        if (resource.isReadable()) {
            System.out.println("文件可读");
        }
        if (resource.isOpen()) {
            System.out.println("资源文件已打开");
        }
        System.out.println("FILE NAME:"+resource.getFilename());
        System.out.println("--------------------------");
        System.out.println("FILE URL:"+resource.getURL());
        System.out.println("FILE CONTENT LENGTH:"+resource.contentLength() );
    }
}
