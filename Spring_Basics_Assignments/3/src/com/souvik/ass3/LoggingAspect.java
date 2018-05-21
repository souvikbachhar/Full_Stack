package com.souvik.ass3;

import java.util.Date;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	//@Pointcut("execution(* com.souvik.ass3.Student.getAllDetails(..))")
//	private void selectAll(){}
	
	static Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@After(value="execution(* com.souvik.ass3.Student.getAllDetails(..))||execution(* com.souvik.ass3.Student.getDetails(..))", argNames = "joinPoint")
	public void LoggingAdvice(JoinPoint joinPoint)
	{
		logger.info("Method Name :" + joinPoint.getSignature().toShortString()+"Time :"+new Date());
		
	}
	
	@Around("execution(* com.souvik.ass3.Student.getAllDetails(..))||execution(* com.souvik.ass3.Student.getDetails(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
			
			long start = System.currentTimeMillis();
            Object output = pjp.proceed();
            long elapsedTime = System.currentTimeMillis() - start;
            logger.info("Method execution time: " + elapsedTime + " milliseconds.");
            return output;
    }
}
