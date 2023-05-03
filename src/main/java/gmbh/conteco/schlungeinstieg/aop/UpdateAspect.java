package gmbh.conteco.schlungeinstieg.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UpdateAspect {

    @Pointcut("target(gmbh.conteco.schlungeinstieg.aop.ShoppingCart)")
    public void targetShoppingCart() {
    }

    @Pointcut("execution(public * gmbh.conteco.schlungeinstieg.aop.ShoppingCart.*(Item))")
    public void methodsInShoppingCartWithItemParameter() {
    }

    //@After("targetShoppingCart() && !methodsInShoppingCartWithItemParameter()")
    @Around("targetShoppingCart()")
    public Object updateAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed();
        ShoppingCart cart = (ShoppingCart) joinPoint.getTarget();
        cart.updatePrice();
        cart.updateItemCount();
        return result;
    }

    @Pointcut("args(item)")
    public void itemParameter(Item item) {
    }

    @Before(value = "targetShoppingCart() && itemParameter(item)",
            argNames = "item")
    public void shoutItem(Item item) {
        System.out.println(item.getName() + " was touched!");
    }
}