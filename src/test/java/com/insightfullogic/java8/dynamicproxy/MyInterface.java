package com.insightfullogic.java8.dynamicproxy;

import java.util.Map;

public interface MyInterface {

  Integer sum(Integer a, Integer b);
  Map<String, Object> getElement(String key);
  String getPath(String serviceName);
  void execute();
}
