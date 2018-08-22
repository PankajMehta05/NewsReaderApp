package resaurentapp.pankaj.com.newsreaderapp.Interface;

import resaurentapp.pankaj.com.newsreaderapp.Common.Common;
import resaurentapp.pankaj.com.newsreaderapp.Model.News;
import resaurentapp.pankaj.com.newsreaderapp.Model.WebSite;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();
    @GET
    Call<News> getNewestArticles(@Url String url);
}
