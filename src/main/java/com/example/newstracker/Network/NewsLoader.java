package com.example.newstracker.Network;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.newstracker.Model.News;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader {

    private String mUrl;

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public Object loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<News> newsArticles = QueryUtils.fetchNewsData(mUrl);
        return newsArticles;
    }

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

}
