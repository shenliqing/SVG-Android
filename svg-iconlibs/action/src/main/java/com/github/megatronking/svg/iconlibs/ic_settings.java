package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_settings extends SVGRenderer {

    public ic_settings(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(19.43f, 12.98f);
        mPath.rCubicTo(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.98f);
        mPath.rCubicTo(0.0f, -0.3399992f, -0.03f, -0.66f, -0.07f, -0.98f);
        mPath.rLineTo(2.11f, -1.65f);
        mPath.rCubicTo(0.19f, -0.15f, 0.24f, -0.42f, 0.12f, -0.64f);
        mPath.rLineTo(-2.0f, -3.46f);
        mPath.rCubicTo(-0.12f, -0.22f, -0.39f, -0.3f, -0.61f, -0.22f);
        mPath.rLineTo(-2.49f, 1.0f);
        mPath.rCubicTo(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f);
        mPath.rLineTo(-0.38f, -2.65f);
        mPath.cubicTo(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rCubicTo(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        mPath.rLineTo(-0.38f, 2.65f);
        mPath.rCubicTo(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f);
        mPath.rLineTo(-2.49f, -1.0f);
        mPath.rCubicTo(-0.23f, -0.09f, -0.49f, 0.0f, -0.61f, 0.22f);
        mPath.rLineTo(-2.0f, 3.46f);
        mPath.rCubicTo(-0.13f, 0.22f, -0.07f, 0.49f, 0.12f, 0.64f);
        mPath.rLineTo(2.11f, 1.65f);
        mPath.rCubicTo(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.98f);
        mPath.rCubicTo(0.0f, 0.33000088f, 0.03f, 0.66f, 0.07f, 0.98f);
        mPath.rLineTo(-2.11f, 1.65f);
        mPath.rCubicTo(-0.19f, 0.15f, -0.24f, 0.42f, -0.12f, 0.64f);
        mPath.rLineTo(2.0f, 3.46f);
        mPath.rCubicTo(0.12f, 0.22f, 0.39f, 0.3f, 0.61f, 0.22f);
        mPath.rLineTo(2.49f, -1.0f);
        mPath.rCubicTo(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f);
        mPath.rLineTo(0.38f, 2.65f);
        mPath.rCubicTo(0.03f, 0.24f, 0.24f, 0.42f, 0.49f, 0.42f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rCubicTo(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        mPath.rLineTo(0.38f, -2.65f);
        mPath.rCubicTo(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f);
        mPath.rLineTo(2.49f, 1.0f);
        mPath.rCubicTo(0.23f, 0.09f, 0.49f, 0.0f, 0.61f, -0.22f);
        mPath.rLineTo(2.0f, -3.46f);
        mPath.rCubicTo(0.12f, -0.22f, 0.07f, -0.49f, -0.12f, -0.64f);
        mPath.rLineTo(-2.11f, -1.65f);
        mPath.close();
        mPath.moveTo(19.43f, 12.98f);
        mPath.moveTo(12.0f, 15.5f);
        mPath.rCubicTo(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        mPath.rCubicTo(0.0f, -1.9300003f, 1.57f, -3.5f, 3.5f, -3.5f);
        mPath.rCubicTo(1.9300003f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        mPath.rCubicTo(0.0f, 1.9300003f, -1.57f, 3.5f, -3.5f, 3.5f);
        mPath.close();
        mPath.moveTo(12.0f, 15.5f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}