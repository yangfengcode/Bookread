package com.bookreader.util;

public interface OnScrollChangedListener {
	 /**
	      * ���������仯
	      * @param l
	      * @param t
	      * @param oldl
	      * @param oldt
	     */
	     public void onScrollChanged(int l, int t, int oldl, int oldt);
	 
	     /**
	      * ��������������
	     */
	     public void onScrollTop();
	 
	     /**
	      * �����������ײ�
	      */
	     public void onScrollBottom();
}
