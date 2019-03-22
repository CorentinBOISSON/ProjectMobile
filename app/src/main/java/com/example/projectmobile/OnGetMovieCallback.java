package com.example.projectmobile;

public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}