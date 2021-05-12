package com.svet.eatbubbles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;

public class CanvasView extends View {
    private static int width;
    private static int height;
private GameManager gameManager;


    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initWidthAndHeight(context);
        gameManager = new GameManager();

    }

    private void initWidthAndHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        width = point.x;
        height = point.y;
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gameManager.onDraw(canvas);

    }
}
