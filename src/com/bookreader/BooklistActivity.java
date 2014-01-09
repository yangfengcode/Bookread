package com.bookreader;
import android.app.ListActivity;  
import android.os.Bundle;  
import android.os.Handler;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.AbsListView;  
import android.widget.BaseAdapter;  
import android.widget.Button;  
import android.widget.LinearLayout;  
import android.widget.ListView;  
import android.widget.TextView;  
import android.widget.AbsListView.OnScrollListener;  
import android.app.Activity;


public class BooklistActivity extends ListActivity implements OnScrollListener {

    
	
	 private ListView listView;  
	    //ȫ�ֱ�����������¼ScrollView�Ĺ���״̬��1��ʾ��ʼ������2��ʾ���ڹ�����0��ʾֹͣ����  
	    private int scrollState;  
	    //�ɼ��ؼ�¼������  
	    private int count = 100;  
	    private int lastItem;  
	    //��ǰ�ɼ�ҳ���е�Item����  
	    private int visibleItemCount;  
	      
	    private Button footerButton;  
	    private LinearLayout footerProgressBarLayout;  
	    private View view;  
	    private ListAdapter mAdapter = new ListAdapter();  
	      
	    public void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        //������ҳ�沼��  
	        setContentView(R.layout.activity_booklist);  
	          
	        LayoutInflater inflater = LayoutInflater.from(this);  
	        //���صײ�����   
	        footerButton = (Button) view.findViewById(R.id.button5);  
	       
	        //���ఴť����¼�  
	        footerButton.setOnClickListener(new View.OnClickListener() {  
	              
	            public void onClick(View v) {  
	                if(lastItem == mAdapter.count && scrollState == OnScrollListener.SCROLL_STATE_IDLE){  
	                    //����ҳ��ײ����ֿؼ��ɼ���  
	                    footerButton.setVisibility(View.GONE);  
	                    footerProgressBarLayout.setVisibility(View.VISIBLE);  
	                    if(mAdapter.count <= count){  
	                        //ʹ��Handler��̬��������  
	                        new Handler().postDelayed(new Runnable() {  
	                              
	                            public void run() {  
	                                mAdapter.count += 10;  
	                                mAdapter.notifyDataSetChanged();  
	                                listView.setSelection(lastItem - visibleItemCount + 1);  
	                                //��ȡ���ݳɹ�����Layout���ɼ�,Button��Ϊ�ɼ�  
	                                footerButton.setVisibility(View.VISIBLE);  
	                                footerProgressBarLayout.setVisibility(View.GONE);  
	                            }  
	                        } , 2000);  
	                    }  
	                }  
	            }  
	        });  
	          
	        listView = getListView();  
	        //��������ӵ�ListView��Footer��  
	        listView.addFooterView(view);  
	        listView.setAdapter(mAdapter);  
	          
	        //���û�������  
	        listView.setOnScrollListener(this);  
	    }  
	 
	    public void onScroll(AbsListView view, int firstVisibleItem,  
	            int visibleItemCount, int totalItemCount) {  
	        this.visibleItemCount = visibleItemCount;  
	        lastItem = firstVisibleItem + visibleItemCount - 1;  
	        if(mAdapter.count >= count){  
	            listView.removeFooterView(view);  
	        }  
	          
//	        boolean loadMore = firstVisibleItem + visibleItemCount >= totalItemCount;  
//	        if(loadMore){  
//	          mAdapter.count += visibleItemCount;  
//	          mAdapter.notifyDataSetChanged();  
//	        }  
	    }  
	 
	    public void onScrollStateChanged(AbsListView view, int scrollState) {  
	        this.scrollState = scrollState;  
	    }  
	      
	    /**  
	     * ����ƥ����  
	     * @author qin_lei  
	     *  
	     */ 
	    public class ListAdapter extends BaseAdapter{  
	 
	        int count = 10;  
	          
	        public int getCount() {  
	            return count;  
	        }  
	 
	        public Object getItem(int position) {  
	            return position;  
	        }  
	 
	        public long getItemId(int position) {  
	            return position;  
	        }  
	 
	        public View getView(int position, View convertView, ViewGroup parent) {  
	            LayoutInflater inflater = LayoutInflater.from(BooklistActivity.this);  
	            View view = inflater.inflate(R.layout.main_item, null);  
	            TextView tv = (TextView) view.findViewById(R.id.tv);  
	            tv.setText(position);  
	            return view;  
	        }  
	    }  

	}
	
