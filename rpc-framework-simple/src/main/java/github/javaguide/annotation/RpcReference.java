package github.javaguide.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RPC reference annotation, autowire the service implementation class
 * RPC 消费服务的注解
 * @author smile2coder
 * @createTime 2020年09月16日 21:42:00
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface RpcReference {

    /**
     * Service version, default value is empty string
     * 服务版本，默认值是空字符串
     */
    String version() default "";

    /**
     * Service group, default value is empty string
     * 服务组，默认是空字符串
     */
    String group() default "";

}
