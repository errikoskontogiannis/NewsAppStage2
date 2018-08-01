package com.example.h3nry.newsappstage2;

import android.content.AsyncTaskLoader;
import android.content.Context;
import java.util.List;

public class StoryLoader extends AsyncTaskLoader<List<Story>> {

    private static final String LOG_TAG = StoryLoader.class.getName();

    private String mUrl;

    public StoryLoader(Context context, String url) {

        super(context);
        mUrl = url;

    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Story> loadInBackground() {

        if (mUrl == null) {

            return null;

        }

        List<Story> stories = QueryUtils.fetchStoryData(mUrl);

        return stories;

    }

}
