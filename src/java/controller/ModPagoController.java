package controller;

import cajadelUnapec.ModPago;
import facade.ModPagoFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "modPagoController")
@ViewScoped
public class ModPagoController extends AbstractController<ModPago> {

    @Inject
    private MobilePageController mobilePageController;

    public ModPagoController() {
        // Inform the Abstract parent controller of the concrete ModPago Entity
        super(ModPago.class);
    }

}
