package com.darthbinamira.masamune;

import playn.java.LWJGLPlatform;

public class Runner {

  public static void main(String[] args) {
    LWJGLPlatform platform = new LWJGLPlatform(new LWJGLPlatform.Config());
    new Game(platform);
    platform.start();
  }
}
