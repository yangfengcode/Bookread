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
	    //全局变量，用来记录ScrollView的滚动状态，1表示开始滚动，2表示正在滚动，0表示停止滚动  
	    private int scrollState;  
	    //可加载记录的条数  
	    private int count = 100;  
	    private int lastItem;  
	    //当前可见页面中的Item总数  
	    private int visibleItemCount;  
	      
	    private Button footerButton;  
	    private LinearLayout footerProgressBarLayout;  
	    private View view;  
	    private ListAdapter mAdapter = new ListAdapter();  
	      
	    public void onCreate(Bundle savedInstanceState) {  
	        super.onCreate(savedInstanceState);  
	        //加载主页面布局  
	        setContentView(R.layout.activity_booklist);  
	          
	        LayoutInflater inflater = LayoutInflater.from(this);  
	        //加载底部布局   
	        footerButton = (Button) view.findViewById(R.id.button5);  
	       
	        //更多按钮点击事件  
	        footerButton.setOnClickListener(new View.OnClickListener() {  
	              
	            public void onClick(View v) {  
	                if(lastItem == mAdapter.count && scrollState == OnScrollListener.SCROLL_STATE_IDLE){  
	                    //设置页面底部布局控件可见性  
	                    footerButton.setVisibility(View.GONE);  
	                    footerProgressBarLayout.setVisibility(View.VISIBLE);  
	                    if(mAdapter.count <= count){  
	                        //使用Handler动态加载数据  
	                        new Handler().postDelayed(new Runnable() {  
	                              
	                            public void run() {  
	                                mAdapter.count += 10;  
	                                mAdapter.notifyDataSetChanged();  
	                                listView.setSelection(lastItem - visibleItemCount + 1);  
	                                //获取数据成功设置Layout不可见,Button设为可见  
	                                footerButton.setVisibility(View.VISIBLE);  
	                                footerProgressBarLayout.setVisibility(View.GONE);  
	                            }  
	                        } , 2000);  
	                    }  
	                }  
	            }  
	        });  
	          
	        listView = getListView();  
	        //将布局添加到ListView的Footer中  
	        listView.addFooterView(view);  
	        listView.setAdapter(mAdapter);  
	          
	        //设置滑动监听  
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
	     * 数据匹配器  
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
	
