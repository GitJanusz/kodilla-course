package com.kodilla.spring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//Pierwszy sposób tworzenia Beanów
@Scope("singleton") //Zasięg singleton jest zasięgiem domyślnym,
                    // więc de facto nie musimy używać adnotacji @Scope,
                    //gdy zasięgiem ma być singleton.
public class Circle implements Shape {
    @Override
    public String getShapeName() {
        return "This is a circle";
    }
}
