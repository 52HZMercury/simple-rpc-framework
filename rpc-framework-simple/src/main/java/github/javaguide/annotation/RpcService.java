package github.javaguide.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RPC service annotation, marked on the service implementation class
 * RPC 注册服务的注解，在服务实现类上标记
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface RpcService {

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
