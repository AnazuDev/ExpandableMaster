package com.anasbex.expandable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
/*import  com.anasbex.expandable.ExpandableListView
import  com.anasbex.expandable.ExpandableGridView*/

/*ExpandableMain Support GridView and ListView ©AnasBex*/

public class ExpandableMain extends ListView {
    
    boolean expanded = false;

    public ExpandableMain(Context context) {
        super(context);
    }

    public ExpandableMain(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExpandableMain(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (isExpanded()) {
            int expandSpec = MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK,
                    MeasureSpec.AT_MOST);
            super.onMeasure(widthMeasureSpec, expandSpec);

            ViewGroup.LayoutParams params = getLayoutParams();
            params.height = getMeasuredHeight();
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
     
}

/*public class GridView extends ExpandableMain {
    
   

    
}*/

