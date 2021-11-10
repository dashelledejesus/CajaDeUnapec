package controller;

import cajadelUnapec.FormaDePago;
import facade.FormaDePagoFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "formaDePagoController")
@ViewScoped
public class FormaDePagoController extends AbstractController<FormaDePago> {

    @Inject
    private MobilePageController mobilePageController;

    public FormaDePagoController() {
        // Inform the Abstract parent controller of the concrete FormaDePago Entity
        super(FormaDePago.class);
    }

}
