package org.restapidoc.annotation

import java.lang.annotation.*


/**
 * This annotation is to be used on your method and contains an array of ApiParam
 * @see RestApiParam
 * @author Benjamin Stévens
 *
 */
@Documented
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestApiParams {

    /**
     * An array of ApiParam annotations
     * @see RestApiParam
     * @return
     */
    public RestApiParam[] params();

}