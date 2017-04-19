package chapter2;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by dzbe1116 on 4/13/2017.
 */
public class TigerReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object terget, Method method, Object[] args) throws Throwable {
        return "A ferocious tiger";
    }
}
