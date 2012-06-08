class UrlMappings {

    static mappings = {

        "/$controller/$action?/$id?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "home", action: "index")
        "/login"(controller: "login", action: "auth")
        "/feed/$region"(controller: "region", action: "feed")
        "/signup"(controller: "register")
        "/register/register"(controller: "register", action: "register")
        /*"/$region/subscribe"(controller: "region", action: "subscribe")
        "/$region/addroute"(controller: "region") {
            action = [PUT: "addRoute", POST: "saveRoute"]
        }
        "/$region/$route/rating"(controller: "route", action = [POST: "saveRating"])
        "/$region/$route/comment"(controller: "route", action = [POST: "saveComment"])
        "/$region/$route"(controller: "route", action = [GET: "show"])
        "/$region"(controller: "region", action: "show") */
        "/region/create"(controller: "region", action: "create")
        "/region/list"(controller: "region", action: "list")
        "/region/save"(controller: "region", action: "save")
        name region: "/$region/$route?" {
            controller = "region"
            action = "find"
        }
        "500"(view: '/error')

    }

    /*
    GET     /                           controllers.ApplicationController.index()

    GET     /signup                     controllers.ApplicationController.signupForm()
    POST    /signup                     controllers.ApplicationController.signup()

    POST    /login                      controllers.ApplicationController.login()

    GET     /feed/:region               controllers.RegionController.getRegionFeed(region)

    POST    /:region/subscribe          controllers.RegionController.subscribe(region)

    GET     /:region/addroute           controllers.RegionController.addRoute(region)
    POST    /:region/addroute           controllers.RegionController.saveRoute(region)

    POST    /:region/:route/rating      controllers.RouteController.saveRating(region, route)

    POST    /:region/:route/comment     controllers.RouteController.saveComment(region, route)

    GET     /:region/:route             controllers.RouteController.getRouteHtml(region, route)

    GET     /:region                    controllers.RegionController.getRegionHtml(region)
     */
}