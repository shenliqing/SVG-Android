package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_border_color extends SVGRenderer {

    public ic_border_color(Context context) {
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
        
        mPath.moveTo(17.75f, 7.0f);
        mPath.lineTo(14.0f, 3.25f);
        mPath.rLineTo(-10.0f, 10.0f);
        mPath.lineTo(4.0f, 17.0f);
        mPath.rLineTo(3.75f, 0f);
        mPath.rLineTo(10.0f, -10.0f);
        mPath.close();
        mPath.moveTo(17.75f, 7.0f);
        mPath.rMoveTo(2.96f, -2.96f);
        mPath.rCubicTo(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        mPath.lineTo(18.37f, 0.29f);
        mPath.rCubicTo(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        mPath.lineTo(15.0f, 2.25f);
        mPath.lineTo(18.75f, 6.0f);
        mPath.rLineTo(1.96f, -1.96f);
        mPath.close();
        mPath.moveTo(20.71f, 4.04f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(0.0f, 20.0f);
        mPath.rLineTo(24.0f, 0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.lineTo(0.0f, 24.0f);
        mPath.close();
        mPath.moveTo(0.0f, 20.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}