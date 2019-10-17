
package com.pkd.interview.models;

public class User {
  private String userId;

  public String getUserId() {

    return userId;
  }

  public void setUserId(final String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof User)) {
      return false;
    }

    final User user = (User) o;

    return userId != null ? userId.equals(user.userId) : user.userId == null;

  }

  @Override
  public int hashCode() {
    return userId != null ? userId.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "User{" + "userId='" + userId + '\'' + '}';
  }
}
