package io.github.agamgk1.controller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//retention - jak dlugo adnotacja ma pozostawac
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface IllegalExceptionProcessing {

}
