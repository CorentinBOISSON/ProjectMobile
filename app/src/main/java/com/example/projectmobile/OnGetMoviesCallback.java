package com.example.projectmobile;

import java.util.List;

public interface OnGetMoviesCallback {

    void onSuccess(int page, List<Movie> movies);

    void onError();
}