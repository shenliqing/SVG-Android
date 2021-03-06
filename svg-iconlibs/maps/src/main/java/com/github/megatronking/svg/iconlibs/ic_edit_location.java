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
public class ic_edit_location extends SVGRenderer {

    public ic_edit_location(Context context) {
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
        
        mPath.moveTo(12.0f, 2.0f);
        mPath.cubicTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
        mPath.rCubicTo(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        mPath.rCubicTo(0.0f, 0.0f, 7.0f, -7.75f, 7.0f, -13.0f);
        mPath.rCubicTo(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        mPath.close();
        mPath.moveTo(12.0f, 2.0f);
        mPath.rMoveTo(-1.56f, 10.0f);
        mPath.lineTo(9.0f, 12.0f);
        mPath.rLineTo(0f, -1.44f);
        mPath.rLineTo(3.35f, -3.34f);
        mPath.rLineTo(1.43f, 1.43f);
        mPath.lineTo(10.44f, 12.0f);
        mPath.close();
        mPath.moveTo(10.440001f, 12.0f);
        mPath.rMoveTo(4.45f, -4.45f);
        mPath.rLineTo(-0.7f, 0.7f);
        mPath.rLineTo(-1.44f, -1.44f);
        mPath.rLineTo(0.7f, -0.7f);
        mPath.rCubicTo(0.15f, -0.15f, 0.39f, -0.15f, 0.54f, 0.0f);
        mPath.rLineTo(0.9f, 0.9f);
        mPath.rCubicTo(0.15f, 0.15f, 0.15f, 0.39f, 0.0f, 0.54f);
        mPath.close();
        mPath.moveTo(14.89f, 7.55f);
        
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