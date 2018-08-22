package resaurentapp.pankaj.com.newsreaderapp.Model;

import java.util.List;

import javax.xml.transform.Source;

public class WebSite {
    private String status;
    private List<resaurentapp.pankaj.com.newsreaderapp.Model.Source> sources;


    public WebSite() {
    }

    public WebSite(String status, List<resaurentapp.pankaj.com.newsreaderapp.Model.Source> sources) {

        this.status = status;
        this.sources = sources;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<resaurentapp.pankaj.com.newsreaderapp.Model.Source> getSources() {
        return sources;
    }

    public void setSources(List<resaurentapp.pankaj.com.newsreaderapp.Model.Source> sources) {
        this.sources = sources;
    }
}