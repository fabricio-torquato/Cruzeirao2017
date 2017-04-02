package bean.layout;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "LayoutBean", eager = true)
@ApplicationScoped
public class LayoutBean {

    private String theme = "bootstrap";

    public String getApplicationTheme() {
        return theme;
    }
}