package com.xwrl.custom.dyztestbar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author : Bilibili喜闻人籁
 * @since : 2022/10/6
 * 作用:
 */
public class TestBar extends View {
    private static final String TAG = "TestBar";

    public TestBar(Context context) {
        super(context);
    }

    public TestBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setWidth(int x) {
        Log.d(TAG, "setWidth: "+x);
    }

    public void setHeight(int x) {
        Log.d(TAG, "setHeight: "+x);
    }

}
