package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* 필기
            @Autowired
            : 의존성을 주입할 때 사용되는 대표적인 어노테이션
            - 의존성을 주입하는 방법 3가지
                1. 필드 주입 - 사용 빈도 20%
                2. 생성자 주입 - 사용 빈도 80%
                3. setter 주입 - 사용 빈도 없음
         */

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        
        BookService service = context.getBean("ServiceField", BookService.class);
        
        /* 전체 도서 목록 조회하기 */
        List<BookDTO> books = service.selectAllBooks();
        
        for (BookDTO book : books) {
            System.out.println("book = " + book);
        }
                

    }
}
