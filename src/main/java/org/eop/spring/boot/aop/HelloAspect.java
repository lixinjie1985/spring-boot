package org.eop.spring.boot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author lixinjie
 * @since 2017-09-20
 */
@Aspect
public class HelloAspect {

	@Before("execution(* org.eop.service.*.*(..))")
	public void before(JoinPoint jp) {
		
	}
	
	@AfterReturning(pointcut = "", returning = "retVal")
	public void afterReturning(JoinPoint jp, Object retVal) {
		
	}
	
	@AfterThrowing(pointcut = "", throwing = "ex")
	public void afterThrowing(JoinPoint jp, Exception ex) {
		
	}
	
	@After("execution(* org.eop.service.*.*(..))")
	public void after(JoinPoint jp) {
		
	}
	
	@Around("execution(* org.eop.service.*.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		//调用前执行的代码
		
		Object retVal = pjp.proceed();
		//调用后执行的代码
		
		return retVal;
	}
}
