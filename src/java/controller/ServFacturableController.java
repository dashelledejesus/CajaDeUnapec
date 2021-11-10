package controller;

import cajadelUnapec.ServFacturable;
import facade.ServFacturableFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "servFacturableController")
@ViewScoped
public class ServFacturableController extends AbstractController<ServFacturable> {

    @Inject
    private MobilePageController mobilePageController;

    public ServFacturableController() {
        // Inform the Abstract parent controller of the concrete ServFacturable Entity
        super(ServFacturable.class);
    }

}
