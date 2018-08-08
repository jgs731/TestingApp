package com.javafortesters.pulp.html;

import com.javafortesters.pulp.html.templates.FilledHTMLTemplate;
import com.javafortesters.pulp.spark.AppVersion;

import java.util.Collection;

public class HTMLReporter {

    private final AppVersion appversion;

    public HTMLReporter(final AppVersion appversion) {
        this.appversion = appversion;
    }

    public String getAsUl(Collection<String> simpleReport, String listname) {

        StringBuilder sb = new StringBuilder();

        sb.append(new FilledHTMLTemplate(appversion).ul(listname + "-list"));

        sb.append("\n");

        int line=0;
        for(String reportLine : simpleReport){
            sb.append(new FilledHTMLTemplate(appversion).li(reportLine, listname+"-list-item-"+line, listname + "-list-item"));
            line++;
        }

        sb.append("</ul>");

        return sb.toString();

    }
}
