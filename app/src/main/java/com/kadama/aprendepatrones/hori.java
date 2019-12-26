package com.kadama.aprendepatrones;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.GridLayout;

import androidx.annotation.RequiresApi;

public class hori extends GridLayout {
    public hori(Context context) {
        super(context);
    }

    public hori(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public hori(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public hori(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
