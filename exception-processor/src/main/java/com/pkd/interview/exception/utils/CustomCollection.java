

package com.pkd.interview.exception.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomCollection<T> {
  List data = new ArrayList();

  public List add(List a) {
    data.add(a);
    return a;
  }

  public T add(T a) {
    data.add(a);
    return a;
  }

  @Override
  public String toString() {
    return "CustomCollection{" + "data=" + data + '}';
  }

  public Iterator<T> iterator() {
    List<T> out = new ArrayList();
    createListObj(data, out);
    return out.iterator();
  }

  private List<T> createListObj(List src, List<T> out) {
    for (Object o : src) {
      if (o instanceof List) {
        createListObj((List) o, out);
      } else {
        out.add((T) o);
      }
    }

    return out;

  }
}
