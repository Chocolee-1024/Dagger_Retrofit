package com.example.daggerretorfit.Scoped;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Scope;


//讓不同的shope分開(A拿A，B拿B)
//而shope都是依賴Singleton
@Scope
@Documented
@Retention(RUNTIME)
public @interface MainAnntation {
}
