package resaurentapp.pankaj.com.newsreaderapp.Interface;

import resaurentapp.pankaj.com.newsreaderapp.Model.IconBetterIdea;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface     IconBetterIdeaService {
    @GET
    Call<IconBetterIdea> getIconUrl(@Url String url);
}
