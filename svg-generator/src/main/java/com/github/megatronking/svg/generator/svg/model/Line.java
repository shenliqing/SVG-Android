package com.github.megatronking.svg.generator.svg.model;


import com.github.megatronking.svg.generator.svg.utils.PathBuilder;

/**
 * The line element model in the svg xml.
 *
 * @author Megatron King
 * @since 2016/11/22 19:34
 */

public class Line extends SvgNode {

    public float x1;
    public float y1;
    public float x2;
    public float y2;

    @Override
    public void toPath() {
        if (Float.isNaN(x1) || Float.isNaN(y1) || Float.isNaN(x2) || Float.isNaN(y2)) {
            return;
        }
        // "M x1, y1 L x2, y2"
        PathBuilder builder = new PathBuilder();
        builder.absoluteMoveTo(x1, y1);
        builder.absoluteLineTo(x2, y2);
        pathData =  builder.toString();
    }

}
