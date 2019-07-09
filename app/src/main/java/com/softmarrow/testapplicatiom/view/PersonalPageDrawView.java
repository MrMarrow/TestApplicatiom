package com.softmarrow.testapplicatiom.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;

import com.softmarrow.testapplicatiom.R;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class PersonalPageDrawView extends View {


    // ratios of circle coordinates and radius
    private static final float RATIO_CIRCLE_CENTRE_X = 0.5F;
    private static final float RATIO_CIRCLE_CENTRE_Y = 0.6F;
    private static final float RATIO_CIRCLE_RADIUS = 0.2F;

    // ratios of rectangle coordinates
    private static final float RATIO_RECT_X1 = 0.12F;
    private static final float RATIO_RECT_Y1 = 0.05F;
    private static final float RATIO_RECT_X2 = 0.88F;
    private static final float RATIO_RECT_Y2 = 0.35F;


    private Paint paint;
    private Rect rectCircle;
    private float width;
    private float height;



    public PersonalPageDrawView(Context context) {
        super(context);
        paint = new Paint();
        rectCircle = new Rect();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        width = getWidth();
        height = getHeight();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(setWidthOrX(RATIO_CIRCLE_CENTRE_X), setHeightOrY(RATIO_CIRCLE_CENTRE_Y),
                setHeightOrY(RATIO_CIRCLE_RADIUS), paint);

        canvas.drawRoundRect(setWidthOrX(RATIO_RECT_X1), setHeightOrY(RATIO_RECT_Y1),
                setWidthOrX(RATIO_RECT_X2), setHeightOrY(RATIO_RECT_Y2),50, 50, paint);


    }

    /**
     * returns the coordinate or width relative to the screen width
     * @param ratio of object coordinate or width
     * @return
     */
    public float setWidthOrX(float ratio){
        return width * ratio;
    }

    /**
     * returns the coordinate or height relative to the screen height
     * @param ratio of object coordinate or height
     * @return
     */
    public float setHeightOrY(float ratio){
        return height * ratio;
    }
}
