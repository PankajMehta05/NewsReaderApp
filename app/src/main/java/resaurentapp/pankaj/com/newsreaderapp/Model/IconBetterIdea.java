package resaurentapp.pankaj.com.newsreaderapp.Model;

import android.graphics.drawable.Icon;

import java.util.List;

import resaurentapp.pankaj.com.newsreaderapp.Interface.IconBetterIdeaService;
import retrofit2.Call;

public class IconBetterIdea implements IconBetterIdeaService {
    private String url;
    private List<Icon> icons;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Icon> getIcons() {
        return icons;
    }

    public void setIcons(List<Icon> icons) {
        this.icons = icons;
    }

    @Override
    public Call<IconBetterIdea> getIconUrl(String url) {
        return null;
    }
}
