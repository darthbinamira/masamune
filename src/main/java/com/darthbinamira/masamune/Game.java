package com.darthbinamira.masamune;

import playn.core.Keyboard;
import playn.core.Platform;
import playn.core.Pointer;
import playn.core.Surface;
import playn.scene.Layer;
import playn.scene.SceneGame;
import pythagoras.f.IDimension;
import react.Slot;

public class Game extends SceneGame {

  public final Pointer pointer;

  public Game(Platform platform) {
    super(platform, 33);

    pointer = new Pointer(platform);

    final IDimension viewSize = platform.graphics().viewSize;

    rootLayer.add(
        new Layer() {
          @Override
          protected void paintImpl(Surface surface) {
            surface.setFillColor(0xFF333333).fillRect(0, 0, viewSize.width(), viewSize.height());
          }
        });

    rootLayer.add(new GridView(viewSize));

    pointer.events.connect(
        new Slot<Pointer.Event>() {
          @Override
          public void onEmit(Pointer.Event event) {
            System.out.println(event);
          }
        });

    platform
        .input()
        .keyboardEvents
        .connect(
            new Keyboard.KeySlot() {
              @Override
              public void onEmit(Keyboard.KeyEvent event) {
                System.out.println(event);
              }
            });
  }
}

class GridView extends Layer {

  private final IDimension viewSize;

  public GridView(IDimension viewSize) {
    this.viewSize = viewSize;
  }

  @Override
  protected void paintImpl(Surface surface) {
    surface.setFillColor(0xFF88FFAA);
    float top = 0, bottom = this.viewSize.height(), left = 0, right = this.viewSize.width();

    for (int yy = 0; yy < bottom; yy++) {
      float ypos = yy * 40 + yy;
      surface.drawLine(left, ypos, right, ypos, 2);
    }

    for (int xx = 0; xx < right; xx++) {
      float xpos = xx * 40 + xx;
      surface.drawLine(xpos, top, xpos, bottom, 2);
    }
  }
}
