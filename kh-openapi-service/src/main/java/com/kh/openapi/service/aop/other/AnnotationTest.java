package com.kh.openapi.service.aop.other;

import com.kh.openapi.service.aop.impl.TimeHandler;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.service.aop.other
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 19:24 2018/1/18
 */
@Component("annotationTest")
@Aspect
public class AnnotationTest {

    @Resource
    private TimeHandler timeHandler;

    //定义切点
     @Pointcut("execution(* com.kh.openapi.service.aop.other.BraveKnight.saying(..))")
     public void sayings(){}
     /**
       * 前置通知(注解中的sayings()方法，其实就是上面定义pointcut切点注解所修饰的方法名，那只是个代理对象,不需要写具体方法，
       * 相当于xml声明切面的id名，如下，相当于id="embark",用于供其他通知类型引用)
       * <aop:config>
          <aop:aspect ref="mistrel">
              <!-- 定义切点 -->
              <aop:pointcut expression="execution(* *.saying(..))" id="embark"/>
              <!-- 声明前置通知 (在切点方法被执行前调用) -->
              <aop:before method="beforSay" pointcut-ref="embark"/>
              <!-- 声明后置通知 (在切点方法被执行后调用) -->
             <aop:after method="afterSay" pointcut-ref="embark"/>
         </aop:aspect>
        </aop:config>
       */
     @Before("sayings()")
     public void sayHello(){
         System.out.println("注解类型前置通知");
     }

     //后置通知
     /* @After("sayings()")
     public void sayGoodbey(){
          System.out.println("注解类型后置通知");
      }*/
     //环绕通知。注意要有ProceedingJoinPoint参数传入。
     @Around("sayings()")
     public void sayAround(ProceedingJoinPoint pjp) throws Throwable{
                 System.out.println("注解类型环绕通知..环绕前");
                 pjp.proceed();//执行方法
                 System.out.println("注解类型环绕通知..环绕后");
             }
}
