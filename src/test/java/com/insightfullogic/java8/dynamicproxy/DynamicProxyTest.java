package com.insightfullogic.java8.dynamicproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

  @Test
  public void testDynamicProxy() {
    MyInvocationHandler handler = new MyInvocationHandler();
    MyInterface o = (MyInterface) Proxy.newProxyInstance(
        MyInvocationHandler.class.getClassLoader(),
        new Class[]{ MyInterface.class }, handler);
    o.sum(1, 3);
    o.getElement("");
    o.getPath("");
    o.execute();
  }
}
