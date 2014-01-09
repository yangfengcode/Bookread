package com.bookreader.view;

import android.content.Context;
 import android.graphics.Rect;
import android.util.AttributeSet;
 import android.widget.ScrollView;
import  com.bookreader.util.*;

public class BorderScrollView extends ScrollView {

	private long millis;
	    // ����������
	     private OnScrollChangedListener onScrollChangedListener;
	 
	    public BorderScrollView(Context context) {
	         super(context);
	     }
	 
	     public BorderScrollView(Context context, AttributeSet attrs) {
	         super(context, attrs);
	     }
	
	     public BorderScrollView(Context context, AttributeSet attrs, int defStyle) {
	         super(context, attrs, defStyle);
	    }
	 
	     @Override
	     protected void onScrollChanged(int l, int t, int oldl, int oldt) {
	         super.onScrollChanged(l, t, oldl, oldt);
	 
	         if(null == onScrollChangedListener){
	             return;
	         }
	 
	         long now = System.currentTimeMillis();
	 
	         // ֪ͨ�����ߵ�ǰ�����ľ�����Ϣ
	         onScrollChangedListener.onScrollChanged(l, t, oldl, oldt);
	 
	         if(now - millis > 1000l){
	             // �������ײ���ǰ�᣺�Ӳ��ǵײ��������ײ���
	             if((this.getHeight() + oldt) != this.getTotalVerticalScrollRange()
	                    && (this.getHeight() + t) == this.getTotalVerticalScrollRange()){
	 
	                onScrollChangedListener.onScrollBottom(); // ֪ͨ�����߹������ײ�
	
	                millis = now;
	             }
	         }
	 
	         // ������������ǰ�᣺�Ӳ��Ƕ���������������
	         if(oldt != 0 && t == 0){
	             onScrollChangedListener.onScrollTop(); // ֪ͨ�����߹���������
	         }
	 
	 
	     }
	 
	     public OnScrollChangedListener getOnScrollChangedListener() {
	        return onScrollChangedListener;
	     }
	 
	     public void setOnScrollChangedListener(OnScrollChangedListener onScrollChangedListener) {
	         this.onScrollChangedListener = onScrollChangedListener;
	     }
	 
	     /**
	     * ��ù����ܳ���
	      * @return
	      */
	     public int getTotalVerticalScrollRange() {
	         return this.computeVerticalScrollRange();
	     }
	 
	     @Override
	     protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
	         return 0; // ��ֹScrollView���ӿؼ��Ĳ��ָı�ʱ�Զ�����
	     }
	
}
