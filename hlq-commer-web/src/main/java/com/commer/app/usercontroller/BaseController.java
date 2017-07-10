package com.commer.app.usercontroller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 13 on 2017/2/21.
 */
public abstract class BaseController {

    public static String THEME = "themes/default";

    /**
     * 主页的页面主题
     * @param viewName
     * @return
     */
    public String render(String viewName) {
    	System.out.println(THEME + "/" + viewName);
        return THEME + "/" + viewName;
    }

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    public BaseController keywords(HttpServletRequest request, String keywords) {
        request.setAttribute("keywords", keywords);
        return this;
    }
    
    public String render_404() {
        return "comm/error_404";
    }
}
