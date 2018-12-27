package si.vajnar_tech.vajnarglobe;

import android.graphics.Canvas;
import android.graphics.Paint;

class Point
{
  float x, y;

  Point(double x, double y)
  {
    this.x = (float) x;
    this.y = (float) y;
  }

  @Override
  public String toString()
  {
    return ("P(" + x + "," + y + ")");
  }

  void draw(Canvas canvas, Paint paint, int color)
  {
    paint.setColor(color);
    canvas.drawCircle(x, y, 4, paint);
  }

  void draw(Canvas canvas, Paint paint, int color, int r)
  {
    paint.setColor(color);
    canvas.drawCircle(x, y, r, paint);
  }
}

