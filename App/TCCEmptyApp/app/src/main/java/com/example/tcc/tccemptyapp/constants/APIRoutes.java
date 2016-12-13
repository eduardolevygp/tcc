package com.example.tcc.tccemptyapp.constants;

/**
 * Created by Alan on 05/10/2016.
 */
public class APIRoutes {
    public static final String BASE_URL = "https://acebackend.herokuapp.com";

    public static final String ADM_URL = "/api/membrosGestao";
    public static final String COURSE_LIST_URL = "/api/disciplinas/lista/";
    public static final String COURSE_DETAILS_URL = "/api/disciplinas/";
    public static final String EVENTS_URL = "/api/eventos";

    public static final String NEWS_LIST_URL = "/api/noticias";
    public static final String NEWS_IMAGES = BASE_URL + "/images/noticias/";
    public static final String NEWS_DETAIL_URL = "/api/noticias/";

    public static final String BASE_URL_ADM_IMAGE = BASE_URL + "/images/membros/";
    public static final String BASE_URL_EVENT_IMAGE = BASE_URL + "/images/eventos/";
}
