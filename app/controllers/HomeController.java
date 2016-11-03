package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(String name) {
        return ok(index.render("Welcome to the Home page", name));
    }

	public Result products(String name) {
        return ok(products.render("Products page", name));
    }
	
	public Result about(String name) {
        return ok(about.render("About Us", name));
    }

	public Result contactus(String name) {
        return ok(about.render("Contact Us", name));
    }

}
